package com.PetroP.Function.ArrayTask2;


public class Tas1k3 {
        public static void main(String[] args) {

            int currentZP = 600; //текущая зп
            int timeOfWork = 5; // количество отработанных месяцев
            int tratyFoodInMonth = 300; // траты на еду каждый месяц
            printInfo(currentZP, timeOfWork, tratyFoodInMonth);
        }

        private static void printInfo(int currentZP, int timeOfWork, int tratyFoodInMonth) {
            int finalZP = 0; // итоговая запрплата
            double invest = 0;
            for (int i = 1; i <= timeOfWork; i++) {
                if (i % 6 == 0) {
                    currentZP = currentZP + 400;  // текущая зп
                }
                finalZP = finalZP + currentZP;
                invest = (invest + (currentZP / 10)) * 1.02;

            }
            int toInvestDeposit = (int) (finalZP * 0.10);
            int tratyAllTime = (timeOfWork * tratyFoodInMonth) + toInvestDeposit;
            int finalDepo = finalZP - tratyAllTime;
            System.out.println("Vsego polucheno: " + finalZP);
            System.out.println("Vsego rashodov: " + tratyAllTime);
            System.out.println("Итоговый счет программиста: " + finalDepo);
            System.out.println("Итоговый инвест-счет: " + invest);
        }
    }