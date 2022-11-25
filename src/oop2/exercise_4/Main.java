package oop2.exercise_4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("Car 1\nРік: " + car1.getYear() + "\nШвидкість: " + car1.getSpeed() + "\nВага: " + car1.getWeight() + "\nКолір: " + car1.getColour());

        Car car2 = new Car(2012);

        System.out.println("\nCar 2\nРік: " + car2.getYear() + "\nШвидкість: " + car2.getSpeed() + "\nВага: " + car2.getWeight() + "\nКолір: " + car2.getColour());

        Car car3 = new Car(2013, 333.99);
        System.out.println("\nCar 3\nРік: " + car3.getYear() + "\nШвидкість: " + car3.getSpeed() + "\nВага: " + car3.getWeight() + "\nКолір: " + car3.getColour());

        Car car4 = new Car(2014,444.99, 4_000);
        System.out.println("\nCar 4\nРік: " + car4.getYear() + "\nШвидкість: " + car4.getSpeed() + "\nВага: " + car4.getWeight() + "\nКолір: " + car4.getColour());

        Car car5 = new Car(2015,555.99, 5_000, "Sorta Sunny");
        System.out.println("\nCar 5\nРік: " + car5.getYear() + "\nШвидкість: " + car5.getSpeed() + "\nВага: " + car5.getWeight() + "\nКолір: " + car5.getColour());
    }



}
