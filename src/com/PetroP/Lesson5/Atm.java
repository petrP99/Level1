package com.PetroP.Lesson5;

/**
 * Создать класс, описывающий банкомат.
 * <p>
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: принимает сумму денег, а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма. Сначала банкомат
 * будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10 (не нужно рассматривать более сложные
 * варианты выдачи наличных, чтобы не усложнять алгоритм).
 */
public class Atm {

    private int balance = 0;
    private int countBanknote10 = 0;
    private int countBanknote20 = 0;
    private int countBanknote50 = 0;
    private final int NOMINAL10 = 10;
    private final int NOMINAL20 = 20;
    private final int NOMINAL50 = 50;


    void addCash(int addCash) {

        if (addCash > 0) {

            balance += addCash;
            int tempCash = 0;  // переменная, для хранения значения средств, после обмена каждого номинала купюр

            int currentCountBanknote50 = addCash / NOMINAL50; // счетчик купюр только в методе
            if (currentCountBanknote50 > 0) {
                countBanknote50 = countBanknote50 + currentCountBanknote50;
            }
            tempCash = addCash - currentCountBanknote50 * NOMINAL50;


            int currentCountBanknote20 = tempCash / NOMINAL20;
            if (currentCountBanknote20 > 0) {
                countBanknote20 = countBanknote20 + currentCountBanknote20;
            }
            tempCash = tempCash - currentCountBanknote20 * NOMINAL20;


            int currentCountBanknote10 = tempCash / NOMINAL10;
            if (currentCountBanknote10 > 0) {
                countBanknote10 = countBanknote10 + currentCountBanknote10;
            }
            tempCash = tempCash - currentCountBanknote10 * NOMINAL10;

        } else System.out.println("Сумма должна быть больше нуля!");
    }


    boolean withdrawCash(int drawCash) {
        if (drawCash > balance || drawCash <= 0) {
            System.out.println("Сумма для снятия превышает баланс!" + "\n");
            return false;
        } else if (drawCash % 10 != 0) {
            System.out.println("Введите сумму для снятия, кратную 10!");
            return false;
        } else {
            balance -= drawCash;
            int tempCash = 0;

            int currentCountBanknote50 = drawCash / NOMINAL50; // счетчик купюр только в методе
            if (currentCountBanknote50 > 0 && currentCountBanknote50 <= countBanknote50) {
                countBanknote50 = countBanknote50 - currentCountBanknote50;
            } else currentCountBanknote50 = 0;
            tempCash = drawCash - currentCountBanknote50 * NOMINAL50;


            int currentCountBanknote20 = tempCash / NOMINAL20;
            if (currentCountBanknote20 > 0 && currentCountBanknote20 <= countBanknote20) {
                countBanknote20 = countBanknote20 - currentCountBanknote20;
            } else currentCountBanknote20 = 0;
            tempCash = tempCash - currentCountBanknote20 * NOMINAL20;


            int currentCountBanknote10 = tempCash / NOMINAL10;
            if (currentCountBanknote10 > 0 && currentCountBanknote10 <= countBanknote10) {
                countBanknote10 = countBanknote10 - currentCountBanknote10;
            } else currentCountBanknote10 = 0;
            tempCash = tempCash - currentCountBanknote10 * NOMINAL10;

            if (tempCash > 0) {
                System.out.println("Операция не успешна, недостаточно купюр для снятия.");
                return false;
            }
        }
        System.out.println("Операция успешна");
        return true;
    }

    void printInfo() {
        System.out.println("Баланс: " + getBalance());
        System.out.println("Количество купюр в банкомате номиналом 50: " + getCountBanknote50());
        System.out.println("Количество купюр в банкомате номиналом 20: " + getCountBanknote20());
        System.out.println("Количество купюр в банкомате номиналом 10: " + getCountBanknote10() + "\n");
    }

    public int getCountBanknote10() {
        return countBanknote10;
    }

    public void setCountBanknote10(int countBanknote10) {
        this.countBanknote10 = countBanknote10;
    }

    public int getCountBanknote20() {
        return countBanknote20;
    }

    public void setCountBanknote20(int countBanknote20) {
        this.countBanknote20 = countBanknote20;
    }

    public int getCountBanknote50() {
        return countBanknote50;
    }

    public void setCountBanknote50(int countBanknote50) {
        this.countBanknote50 = countBanknote50;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
