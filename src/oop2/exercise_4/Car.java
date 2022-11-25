package oop2.exercise_4;

//Завдання 4
//        Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int),
//        швидкість(double), вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1
//        параметром, 2-а, 3-а, 4-а. Перевантажити конструктори викликаючи конструктор із конструктора.
//        Створити клас Main, де створити екземляри класу Машина з різними параметрами.

public class Car {

    private int year;
    private double speed;
    private int weight;
    private String colour;


    public Car() {
        this (2011, 111.99, 1_000, "Kinda Coral");
    }

    public Car(int year) {
        this (year, 222.99, 2_000, "Sorta Seafoam");
    }

    public Car(int year, double speed) {
        this (year, speed, 3_000, "Stormy Black");
    }

    public Car(int year, double speed, int weight) {
        this(year, speed, weight, "Cloudy White");
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

}
