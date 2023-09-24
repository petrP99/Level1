package com.PetroP.Lesson3;

/*Представить в виде классов и их композиции следующую модель.
- Каждый дом содержит свой номер (int), и множество этажей (массив).
- Каждый этаж содержит номер этажа (int), и множество квартир (массив).*/
//- Каждая квартира содержит свой номер (int), и множество комнат (массив).
/*- Каждая комната содержит поле проходная она или нет (boolean).
 В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
 (должны присутствовать все поля объекта!).
 Например, метод print класса этаж должен выводить на консоль:
 “Этаж 2, количество квартир 18”
 Создание всех объектов вынести в отдельный класс с методом main.
 Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
 и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.*/

public class Apartaments {

    private int apartCurrentNum;
    private int amountRoomInApart;
    private final int[] roomInApart = new int[amountRoomInApart];

    public Apartaments(int apartCurrentNum, int amountRoomInApart) {
        this.apartCurrentNum = apartCurrentNum;
        this.amountRoomInApart = amountRoomInApart;
    }

    public int getApartCurrentNum() {
        return apartCurrentNum;
    }

    public void setApartCurrentNum(int apartCurrentNum) {
        this.apartCurrentNum = apartCurrentNum;
    }

    public int getAmountRoomInApart() {
        return amountRoomInApart;
    }

    public void setAmountRoomInApart(int amountRoomInApart) {
        this.amountRoomInApart = amountRoomInApart;
    }

    void printState() {
        System.out.println("Номер квартиры: " + getApartCurrentNum() +
                ", количество комнат в квартире: " + getAmountRoomInApart());
    }

}