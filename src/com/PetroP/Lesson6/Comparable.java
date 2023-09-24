package com.PetroP.Lesson6;

public interface Comparable {
    default void compareWeight(SpaceObject spaceObjects, SpaceObject spaceObjects1) {
        if (spaceObjects.getWeight().getValue() > spaceObjects1.getWeight().getValue())
            System.out.println("Масса объекта " + spaceObjects.getName() + " больше, чем у объекта "
                    + spaceObjects1.getName());
        else System.out.println("Масса объекта " + spaceObjects1.getName() + " больше, чем у объекта "
                + spaceObjects.getName());
    }
}
