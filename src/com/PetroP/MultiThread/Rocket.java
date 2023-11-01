package com.PetroP.MultiThread;

import java.util.Random;

public class Rocket implements Runnable {


    private final Planet planet;
    private final Mage mage;
    private int RedCrystalsOnRocket;
    private int WhiteCrystalsOnRocket;
    private Random random;

    public Rocket(Planet crystalCount, Mage mage, Random random) {
        this.planet = crystalCount;
        this.mage = mage;
        this.random = random;
    }

    @Override
    public void run() {
        while (mage.checkWinner()) {
            RedCrystalsOnRocket = random.nextInt(4);
            WhiteCrystalsOnRocket = random.nextInt(3 - RedCrystalsOnRocket + 2);
            if (RedCrystalsOnRocket == 0) {
                WhiteCrystalsOnRocket = random.nextInt(3) + 2;
            }

            if (planet.getCrystalCountRed() >= RedCrystalsOnRocket) {
                mage.setNumbersOfCrystalRed(RedCrystalsOnRocket);
                planet.decrementCrystalCountRed(RedCrystalsOnRocket);
            } else {
                mage.setNumbersOfCrystalRed(RedCrystalsOnRocket);
            }

            if (planet.getCrystalCountWhite() >= WhiteCrystalsOnRocket) {
                mage.setNumbersOfCrystalRed(WhiteCrystalsOnRocket);
                planet.decrementCrystalCountRed(WhiteCrystalsOnRocket);
            } else {
                mage.setNumbersOfCrystalWhite(WhiteCrystalsOnRocket);
            }

            mage.getInfo();

            try {
                Thread.sleep((3));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}



