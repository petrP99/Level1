package com.PetroP.Lesson6;

public class Star extends SpaceObject implements PrintableInfo {

    private int yearsToDie;

    public Star(String name, Weight weight, DistanceToSun distanceToSun) {
        super(name, weight, distanceToSun);
    }

    // рандомное условие высчитывание времени до смерти звезды
    public int getYearsToDie() {
        if (getDistanceToSun().getValue() > 1000)
            return (int) (getDistanceToSun().getValue() / 852);
        else return (int) (getDistanceToSun().getValue() / 507);
    }

    @Override
    public int calculateDiameter() {
        return super.calculateDiameter();
    }

    @Override
    public String toString() {
        return "Star {" +
                "yearsToDie = " + getYearsToDie() +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("Название объекта: " + getName() + ". Технические данные: "
                + " масса - " + getWeight().getValue()
                + ", расстояние до солнца - " + getDistanceToSun().getValue()
                + ", количество лет до угасания- " + getYearsToDie() + ".");
    }
}
