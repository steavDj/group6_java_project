package xander.week1;

/**
 * @author Xander Stone
 */

/*
    Numbers -- Odd & Even

    Write a method that identifies whether a given number is even or odd
    EX:
        identify(5) -> "Odd"
        identify(6) -> "Even"
 */

public class OddAndEvenNumberXS {
    public static void main(String[] args) {

        System.out.println("Hi from Xander :P");

        System.out.println("-----");

        // Test Cases
        System.out.println(identify(5)); // Odd
        System.out.println(identify(6)); // Even
        System.out.println(identify(9)); // Odd
        System.out.println(identify(10)); // Even

    }

    // method that takes integer, returns "Even" or "Odd"
    public static String identify(int num) {

        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

}
