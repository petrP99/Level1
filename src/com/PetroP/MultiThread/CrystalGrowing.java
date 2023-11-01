package com.PetroP.MultiThread;

import java.util.Random;

public class CrystalGrowing implements Runnable {

    private Planet planet;
    private Random random;


    public CrystalGrowing(Planet crystalCount) {
        this.planet = crystalCount;
        random = new Random();
    }

    @Override
    public void run() {
        int redCount = random.nextInt(4);
        int whiteCount = random.nextInt(4 - redCount + 1);
        if (redCount == 0) {
            whiteCount = random.nextInt(3) + 2;
        }

        System.out.println("Выращено красных кристаллов: " + redCount);
        System.out.println("Выращено белых кристаллов: " + whiteCount);

        try {
            Thread.sleep(random.nextInt(40)); // Случайная задержка от 0 до 3 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        planet.growCrystals(redCount, whiteCount);

    }
}


