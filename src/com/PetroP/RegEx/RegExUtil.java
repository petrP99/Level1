package com.PetroP.RegEx;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegExUtil {
    private static final String LOGS = "logs.txt";
    private static final String NEW_LOGS = "newLogs.txt";
    private static final int CALL_DURATION_SECONDS = 10000;
    private static Set<Integer> set = new HashSet<>();


    public static void callTheClient() {
        try {
            File logFile = new File(LOGS);
            File callLogFile = new File(NEW_LOGS);

            if (!logFile.exists()) {
                System.out.println("Лог файл не найден.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(logFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(callLogFile, true));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] complaintData = line.split(", ");
                int id = Integer.parseInt(complaintData[0]);
                if (!set.contains(id)) {
                    String phoneNumber = complaintData[3];
                    callDispatch(id, phoneNumber);
                    writer.write(id + ", " + formatDate() + ", " + formatPhoneNumber(phoneNumber) + "\n");
                    set.add(id);
                }
            }
            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void callDispatch(int Id, String phoneNumber) {
        try {
            Thread.sleep(CALL_DURATION_SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Диспетчер звонит клиенту " + Id + " в " + formatDate() +
                " на номер телефона " + formatPhoneNumber(phoneNumber));
    }

    private static String formatDate() {
        LocalDateTime now = LocalDateTime.now();
        String format = "yyyy-MM-dd HH:mm";
        return now.format(DateTimeFormatter.ofPattern(format));
    }

    private static String formatPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("(\\+375|375)?\\s?\\(?([0-9]{2})\\)?\\s?([0-9]{3})\\s?([0-9]{2})\\s?([0-9]{2})");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            String countryCode = "+375";
            String firstPart = matcher.group(2);
            String secondPart = matcher.group(3);
            String thirdPart = matcher.group(4);
            String fourthPart = matcher.group(5);

            return String.format("%s (%s) %s-%s-%s", countryCode, firstPart, secondPart, thirdPart, fourthPart);
        }
        return "Неверный номер телефона";
    }
}
