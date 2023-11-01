package com.PetroP.MultiThread;


public class Mage {
    private String name;
    private int numbersOfCrystalRed = 0;
    private int numbersOfCrystalWhite = 0;

    public Mage(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println(name + " красных - " + getNumbersOfCrystalRed()
                + ", белых - " + getNumbersOfCrystalWhite());
    }

    public int getNumbersOfCrystalRed() {
        return numbersOfCrystalRed;
    }

    public void setNumbersOfCrystalRed(int value) {
        if (getNumbersOfCrystalRed() <= Runner.VALUE)
            numbersOfCrystalRed += value;
    }

    public int getNumbersOfCrystalWhite() {
        return numbersOfCrystalWhite;
    }

    public void setNumbersOfCrystalWhite(int value) {
        if (getNumbersOfCrystalWhite() <= Runner.VALUE)
            numbersOfCrystalWhite += value;
    }

    public boolean checkWinner() {
        if (this.getNumbersOfCrystalRed() >= 500 && this.getNumbersOfCrystalWhite() >= 500) {
            System.out.println(name + " выиграли");
            return false;
        } else return true;
    }
}
