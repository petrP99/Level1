package com.PetroP.Lesson6;

public class SpaceRunner {
    public static void main(String[] args) {
        Earth earth = new Earth("Земля",new Weight(1255),new DistanceToSun(5000));
        Star star = new Star("Звезда",new Weight(105),new DistanceToSun(800));
        Sun sun = new Sun("Солнце",new Weight(10015));
        Asteroid asteroid = new Asteroid("Астероид",new Weight(10015), new DistanceToSun(5000));
        Saturn saturn  = new Saturn("Сатурн", new Weight(12215),new DistanceToSun(154));
        earth.compareWeight(earth,star);






    }

}
