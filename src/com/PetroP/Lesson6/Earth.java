package com.PetroP.Lesson6;

import java.util.Random;

public class Earth extends SpaceObject implements PrintableInfo{

    private int gravity;

    public Earth(String name, Weight weight, DistanceToSun distanceToSun) {
        super(name, weight, distanceToSun);
    }

    // рандомное условие высчитывание гравитации
    public double getGravity() {
        return (int)(Math.max(getWeight().getValue(), getDistanceToSun().getValue()) /
                Math.min(getWeight().getValue(), getDistanceToSun().getValue()));
    }

    @Override
    public int calculateDiameter() {
        return super.calculateDiameter();
    }

    @Override
    public String toString() {
        return "Earth {" +
                "gravity = " + getGravity() +
                "}";
    }

    @Override
    public void printInfo() {
        System.out.println("Название объекта: " + getName() + ". Технические данные: "
                + " масса - " + getWeight().getValue()
                + ", расстояние до солнца - " + getDistanceToSun().getValue()
                + ", сила притяжения на планете - " + getGravity() + ".");
    }

    public void compareWeight(SpaceObject spaceObjects, SpaceObject spaceObjects1) {
        if (spaceObjects.getWeight().getValue() > spaceObjects1.getWeight().getValue())
            System.out.println("Масса объекта " + spaceObjects.getName() + " больше, чем у объекта "
                    + spaceObjects1.getName());
        else System.out.println("Масса объекта " + spaceObjects1.getName() + " больше, чем у объекта "
                + spaceObjects.getName());
    }

    }

