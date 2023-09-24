package com.PetroP.Lesson6;

/**
 * Создать иерархию классов, описывающих объекты в космосе.
 * Например, планета, спутник, звезда, астероид и т.д. У каждого есть набор методов и характеристик-свойств,
 * как общих (масса), так и присущих только этому типу космического объекта.
 * <p>
 * Необходимо учесть следующее:
 * В иерархии должно быть минимум 10 классов/интерфейсов
 * Обязательно использовать наследование (достаточно 1-2 уровней)
 * Использовать полиморфизм и продемонстрировать переопределение методов в иерархии
 * Продемонстрировать добавление собственных методов в классах-наследниках (можно с помощью интерфейсов)
 * При разработке иерархии держать в уме принцип инкапсуляции, выбирать корректные имена классов,
 * их полей и методов, пользоваться преимуществами полиморфизма
 * Отдавайте предпочтение интерфейсам, а не абстрактным классам
 * При переопределении методов обязательно использовать аннотацию @Override
 * Не создавать лишних классов в системе (полностью дублирующих или не содержащих назначения)
 * Каждый класс должен выполнять своё назначение
 * <p>
 * Для каждого не абстрактного класса переопределить метод toString() класса для представления информации
 * о классах в строковой форме
 * <p>
 * <p>
 * Создать общие методы:
 * - Рассчитывающие диаметр космического объекта
 * - Сравнивающий массы 2 космических объектов (метод не статический!)
 * <p>
 * <p>
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними
 * (можно придумать любую формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 * <p>
 * Создать класс SpaceRunner, где протестировать написанный функционал
 */


abstract public class SpaceObject {

    private final String name;
    private final Weight weight;
    private DistanceToSun distanceToSun;

    public SpaceObject(String name, Weight weight, DistanceToSun distanceToSun) {
        this.name = name;
        this.weight = weight;
        this.distanceToSun = distanceToSun;
    }

    public SpaceObject(String name, Weight weight) {
        this.name = name;
        this.weight = weight;
    }

    public DistanceToSun getDistanceToSun() {
        return distanceToSun;
    }

    public String getName() {
        return name;
    }

    public Weight getWeight() {
        return weight;
    }

    public int calculateDiameter() {
        return Math.abs(((distanceToSun.getValue() * 140) / weight.getValue() * 12));
    }


    static void printDiam(SpaceObject... spaceObjects) {
        for (SpaceObject spaceObject : spaceObjects) {
            System.out.println(spaceObject.calculateDiameter());
        }
    }

    static void printToString(SpaceObject... spaceObjects) {
        for (SpaceObject spaceObject : spaceObjects) {
            System.out.println(spaceObject.toString());
        }
    }

    public void compareWeight(SpaceObject spaceObjects, SpaceObject spaceObjects1) {
        if (spaceObjects.weight.getValue() > spaceObjects1.getWeight().getValue())
            System.out.println("Масса объекта " + spaceObjects.getName() + " больше, чем у объекта "
                    + spaceObjects1.getName());
        else System.out.println("Масса объекта " + spaceObjects1.getName() + " больше, чем у объекта "
                + spaceObjects.getName());
    }
}





