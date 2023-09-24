package com.PetroP.Lesson6;

public class Saturn extends Earth implements PrintableInfo {

    private int numbersOfRings;

    public int getNumbersOfRings() {
        return (int) (Math.random() * 28 + 1);
    }

    public Saturn(String name, Weight weight, DistanceToSun distanceToSun) {
        super(name, weight, distanceToSun);
    }

    @Override
    public int calculateDiameter() {
        return super.calculateDiameter();
    }

    @Override
    public String toString() {
        return "Saturn {" +
                "numbersOfRings = " + getNumbersOfRings() +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("Название объекта: " + getName() + ". Технические данные: "
                + " масса - " + getWeight().getValue()
                + ", расстояние до солнца - " + getDistanceToSun().getValue()
                + ", количество колец - " + getNumbersOfRings() + ".");
    }
}
