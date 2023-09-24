package com.PetroP.Lesson3;

/**
 * Представить в виде классов и их композиции следующую модель.
 * <p>
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * <p>
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 * (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * <p>
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 * и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class House {

    private int houseCurrentNum;
    private int amountFloorInHouse;
    private final int[] FloorInHouse = new int[amountFloorInHouse];

    private Floors floors = new Floors(25, 6);
    private Apartaments apartaments = new Apartaments(111, 4);
    private Rooms rooms = new Rooms(false);

    public House(int houseCurrentNum, int amountFloorInHouse) {
        this.houseCurrentNum = houseCurrentNum;
        this.amountFloorInHouse = amountFloorInHouse;
    }

    public House(int houseCurrentNum, int amountFloorInHouse, Floors floors, Apartaments apartaments, Rooms rooms) {
        this.houseCurrentNum = houseCurrentNum;
        this.amountFloorInHouse = amountFloorInHouse;
        this.floors = floors;
        this.apartaments = apartaments;
        this.rooms = rooms;
    }

    void printState() {
        System.out.println("Дом № " + getHouseCurrentNum() + ", количество этажей: " + getAmountFloorInHouse());
    }

    void printAllInfo(House house) {
        printState();
        floors.printState();
        apartaments.printState();
        rooms.printState();
    }


    public int getHouseCurrentNum() {
        return houseCurrentNum;
    }

    public void setHouseCurrentNum(int houseCurrentNum) {
        this.houseCurrentNum = houseCurrentNum;
    }

    public int getAmountFloorInHouse() {
        return amountFloorInHouse;
    }

    public void setAmountFloorInHouse(int amountFloorInHouse) {
        this.amountFloorInHouse = amountFloorInHouse;
    }


}
