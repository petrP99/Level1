package com.PetroP.Lesson6;

public class Sun extends SpaceObject implements PrintableInfo {

    private int illumination;

    public Sun(String name, Weight weight) {
        super(name, weight);
    }

    public int getIllumination() {
        return getWeight().getValue() + 105;
    }

    @Override
    public int calculateDiameter() {
        return (int) Math.abs(getWeight().getValue() * Math.PI * 2);

    }


    @Override
    public String toString() {
        return "Sun {" +
                "illumination = " + getIllumination() +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("Название объекта: " + getName() + ". Технические данные: "
                + " масса - " + getWeight().getValue()
                + ", яркость освещения - " + getIllumination() + ".");
    }
}
