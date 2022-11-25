package oop2.exercise_3;

//Завдання 3
//        Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int),
//        швидкість(double), вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1
//        параметром, 2-а, 3-я, 4-а. Перевантажити конструктори. Створити клас Main, де створити екземляри класу
//        Машина з різними параметрами.

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String colour;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(double speed) {
        this.speed = speed;
    }

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, int weight) {
        this.year = year;
        this.weight = weight;
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public Car(double speed, String colour) {
        this.speed = speed;
        this.colour = colour;
    }

    public Car(String colour, double speed) {
        this.speed = speed;
        this.colour = colour;
    }

    public Car(String colour, int year) {
        this.year = year;
        this.colour = colour;
    }

    public Car(double speed, int weight) {
        this.weight = weight;
        this.speed = speed;
    }

    public Car(double speed, int weight, String colour) {
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public Car(int year, int weight, String colour) {
        this.year = year;
        this.weight = weight;
        this.colour = colour;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, String colour) {
        this.year = year;
        this.speed = speed;
        this.colour = colour;
    }

    public Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void show() {
        System.out.print("\nРік: " + year + "\nШвидкість: " + speed + "\nВага: " + weight + "\nКолір: " + colour + "\n");
    }
}
