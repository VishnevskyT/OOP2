package oop2.exercise_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть значенння радіусу R: _");
        double radius = scanner.nextDouble();
        System.out.println("Площа кола = " + MyArea.areaOfCircle(radius));

    }
}
