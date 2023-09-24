package com.PetroP.Lesson6;

public class Asteroid extends SpaceObject implements PrintableInfo, Comparable {

    private int timeToImpact;
    private double speed;


    public Asteroid(String name, Weight weight, DistanceToSun distanceToSun) {

        super(name, weight, distanceToSun);
    }

    // рандомное условие высчитывание скорости астероида
    public double getSpeed() {
        return (Math.cos((getWeight().getValue()))) * 100 + 10;
    }

    // рандомное условие высчитывание времени до столкновения
    public int getTimeToImpact() {
        if (getDistanceToSun().getValue() > 1000)
            return (int) (getDistanceToSun().getValue() / getSpeed());
        else return (int) (getDistanceToSun().getValue() / getSpeed() + 100);
    }


    @Override
    public int calculateDiameter() {
        return super.calculateDiameter();
    }

    @Override
    public String toString() {
        return "Asteroid {" +
                "timeToImpact = " + getTimeToImpact() +
                ", speed = " + getSpeed() +
                '}';
    }

    void countTimeToDie() {
        timeToImpact = getTimeToImpact();
        while (timeToImpact > 0) {
            for (int i = 0; i < timeToImpact; i++) {
                System.out.println("Время до столкновения с землей: " + timeToImpact);
                timeToImpact /= 2;

            }
        }
        System.out.println("Астероид столкнулся с землей!");

    }

    @Override
    public void printInfo() {
        System.out.println("Название объекта: " + getName() + ". Технические данные: "
                + " масса - " + getWeight().getValue()
                + ", расстояние до солнца - " + getDistanceToSun().getValue()
                + ", время до столкновения - " + getTimeToImpact()
                + ", скорость - " + getSpeed() + ".");
    }

    @Override
    public void compareWeight(SpaceObject spaceObjects, SpaceObject spaceObjects1) {
        super.compareWeight(spaceObjects, spaceObjects1);
    }
}

