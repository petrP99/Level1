package com.PetroP.Lesson5;

public class AtmRunner {
    public static void main(String[] args) {
        Atm atm = new Atm();
        System.out.println(atm.getBalance());
        atm.addCash(530);
        atm.printInfo();
        atm.withdrawCash(140);
        atm.printInfo();

    }
}
