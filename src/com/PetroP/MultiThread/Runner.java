package com.PetroP.MultiThread;

import java.util.Random;

/**
 * Существует две постоянно соревнующиеся расы: маги огня и маги воздуха.
 * Их задача - как можно быстрее набрать 500 красных и 500 белых кристаллов.
 * <p>
 * Кристаллы растут на другой планете с рандомной скоростью от 2 до 5 рандомных
 * кристаллов в сутки (может быть 1 красный и 2 белых, а может и вовсе все 4 кристалла красного цвета).
 * <p>
 * Маги огня и маги воздуха отправляют раз в сутки по ракете за добычей кристаллов.
 * Каждая ракета может погрузить на борт от 2 до 5 рандомных кристаллов.
 * Если кристаллов нет - ракета улетает пустой.
 * <p>
 * Написать программу, которая симулирует процесс заполнения кристаллов у магов огня и воздуха.
 * Для симуляции принять, что и кристаллы создаются, и ракеты прилетают в одно и то же время - полночь.
 * <p>
 * Соревнование заканчивается, когда какая-то раса соберет необходимые кристаллы.
 */


public class Runner {

    public static final int VALUE = 500;


    public static void main(String[] args) throws InterruptedException {

        Planet planet = new Planet();
        CrystalGrowing crystalGrowing = new CrystalGrowing(planet);

        Rocket rocket1 = new Rocket(planet, new Mage("Mage of Fire"), new Random());
        Rocket rocket2 = new Rocket(planet, new Mage("Mage of Air"), new Random());

        Thread thread1 = new Thread(rocket1);
        Thread thread2 = new Thread(rocket2);
        Thread thread3 = new Thread(crystalGrowing);

        ThreadUtil.startThreads(thread1, thread2, thread3);
        ThreadUtil.joinThreads(thread1, thread2, thread3);
//        ThreadUtil.interruptThreads(thread1,thread2,thread3);
    }
}



