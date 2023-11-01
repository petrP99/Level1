package com.PetroP.MultiThread;

public class Planet {

    private int crystalCountRed;
    private int crystalCountWhite;

    public synchronized void growCrystals(int countRed, int countWhite) {
        crystalCountRed += countRed;
        crystalCountWhite += countWhite;
    }

    public synchronized void decrementCrystalCountRed(int value) {
        this.crystalCountRed -= value;
    }

    public synchronized void decrementCrystalCountWhite(int value) {
        this.crystalCountWhite -= value;
    }

    public synchronized int getCrystalCountRed() {
        return crystalCountRed;
    }

    public synchronized int getCrystalCountWhite() {
        return crystalCountWhite;
    }
}
