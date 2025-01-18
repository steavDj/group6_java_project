package sanat.week2;

import java.util.Scanner;

public class FINRASSS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter numbers between 1 and 30 :");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0 && number < 31) {
                    validInput = true;
                } else {
                    System.out.println("The number is not between 1 and 30 :");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 30 :");
                scanner.next();
            }
        }

        if (number % 15 == 0) {
            System.out.println("FINRA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else {
            System.out.println("Number doesn't meet conditions.");
            System.out.println(number);
        }
        scanner.close();
    }

}