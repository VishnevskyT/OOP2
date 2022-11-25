package oop2.exercise_2;

//Завдання 2
//        Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Машина з полями рік(int), колір(String).
//        Створити конструктор за замовчуванням, конструктор з одним і 2 параметрами. Створити клас Main в якому
//        створити екземпляри, викликаючи різні конструктори.

public class Car {
    private int year;
    private String colour;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void print() {
        System.out.println("Рік випуск: " + year + ";\nКолір: " + colour + ".\n");
    }
}
