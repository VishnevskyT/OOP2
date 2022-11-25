package oop2.exercise_3;

public class Main {
    public static void main(String[] args) {
        Car carMammy = new Car(2022);
        carMammy.setColour("червоненька");
        carMammy.setSpeed(49.9);
        carMammy.setWeight(100500);
        carMammy.show();

        Car carDaddy = new Car(299.00, 2000);
        carDaddy.setYear(1999);
        carDaddy.setColour("silver");
        carDaddy.show();

        Car carBrother = new Car(2010, 150.00, "green");
        carBrother.setWeight(1060);
        carBrother.show();

        Car carSister = new Car(150.00, 700, "pink");
        carSister.setYear(2017);
        carSister.show();

        Car carBaby = new Car(2030, 170,1000, "white");
        carBaby.show();
    }


}
