package sanat.week01;

import java.util.Scanner;

public class OddAndEvenNumber2S {
    public static void main(String[] args) {

        System.out.println("Week 1 Odd or Even Project Test");

        Scanner scanner = new Scanner(System.in);
        int Number = 0;
        boolean ValidInput = false;

        while (!ValidInput) {

            System.out.print("Enter a Number: ");
            if (scanner.hasNextInt()) {
                Number = scanner.nextInt();
                ValidInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid Number.");
                scanner.next();
            }
        }

        if (Number % 2 == 0) {
            System.out.println(Number + " is even.");
        } else {
            System.out.println(Number + " is odd.");
        }

        scanner.close();
    }
}