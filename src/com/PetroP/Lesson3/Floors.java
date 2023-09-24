package com.PetroP.Lesson3;
/**Представить в виде классов и их композиции следующую модель.
 - Каждый дом содержит свой номер (int), и множество этажей (массив).*/
 // Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 /**- Каждая квартира содержит свой номер (int), и множество комнат (массив).
 - Каждая комната содержит поле проходная она или нет (boolean).
 В каждом классе реализовать метод print, который на консоль выводит информацию об объекте
  (должны присутствовать все поля объекта!).
 Например, метод print класса этаж должен выводить на консоль:
 “Этаж 2, количество квартир 18”
 Создание всех объектов вынести в отдельный класс с методом main.
 Там же реализовать метод printAllInformation, который на вход принимает объект типа дом,
  и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.*/

public class Floors {

    private int floorCurrentNum;
    private int amountApartInFloor;
    private final int[] ApartInFloor = new int[amountApartInFloor];

     public Floors(int floorCurrentNum, int amountApartInFloor) {
         this.floorCurrentNum = floorCurrentNum;
         this.amountApartInFloor = amountApartInFloor;
     }

     public int getFloorCurrentNum() {
         return floorCurrentNum;
     }

     public void setFloorCurrentNum(int floorCurrentNum) {
         this.floorCurrentNum = floorCurrentNum;
     }

     public int getAmountApartInFloor() {
         return amountApartInFloor;
     }

     public void setAmountApartInFloor(int amountApartInFloor) {
         this.amountApartInFloor = amountApartInFloor;
     }

     void printState () {
        System.out.println("Номер этажа: " + getFloorCurrentNum() +
                ", количество квартир на этаже: " + getAmountApartInFloor());
    }

}
