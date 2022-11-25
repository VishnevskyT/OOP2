package oop2.exercise_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2015);
        car1.setColour("almost black");

        Car car2 = new Car(2000);
        car2.setColour("incredible dark");

        Car car3 = new Car("red");
        car3.setYear(2011);

        Car car4 = new Car(2013, "yellow");

        System.out.println("Перший автомобіль:");
        car1.print();

        System.out.println("Другий автомобіль:");
        car2.print();

        System.out.println("Третій автомобіль:");
        car3.print();

        System.out.println("Четвертий автомобіль:");
        car4.print();

    }
}
