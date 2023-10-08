package com.PetroP.InputOutputStream;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task {
    public static void main(String[] args) throws IOException {
        String itemsPrice = "items-price.csv";
        String itemsName = "items-name.csv";
        String result = "result.csv";
        String errors = "errors.csv";
        Map<Integer, Double> map = new HashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(itemsPrice))) {
            String currentLine = bufferedReader.readLine();
            while ((currentLine = bufferedReader.readLine()) != null) {
                String[] itemsPriceArray = currentLine.split(",");
                int id = Integer.parseInt(itemsPriceArray[0]);
                double price = Double.parseDouble(itemsPriceArray[1]);
                map.put(id, price);
            }
        }

        try (BufferedReader bufferedReader2 = new BufferedReader(new FileReader(itemsName))) {
            FileWriter writerResult = new FileWriter(result);
            FileWriter writerError = new FileWriter(errors);
            writerResult.write("ID,NAME,PRICE" + "\n");
            writerError.write("ID" + "\n");
            String currentLine2 = bufferedReader2.readLine();

            while ((currentLine2 = bufferedReader2.readLine()) != null) {
                String[] itemsNameArray = currentLine2.split(",");
                int id = Integer.parseInt(itemsNameArray[0]);
                String name = itemsNameArray[1];

                if (map.containsKey(id)) {
                    double price = map.get(id);
                    writerResult.write(id + "," + name + "," + price + "\n");
                } else writerError.write(id + "\n");
            }
            writerResult.close();
            writerError.close();
        }

    }
}





