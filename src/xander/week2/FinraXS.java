package xander.week2;

/**
 * @author Xander Stone
 */

/*

    FINRA:

    Write a function that prints out the numbers from 1 to 30 but for numbers that are a multiple of 3,
    print "FIN" instead of the number, and for numbers that are a multiple of 5, print "RA" instead of the number.
    For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.

 */

public class FinraXS {
    public static void main(String[] args) {

        // Original Question Solution
        finraSorter(1, 30);

        // Additional Test Cases
        System.out.println("-----");
        finraSorter(30, 50);
        System.out.println("-----");
        finraSorter(75, 100);
    }

    // Method that take the start and end input for printing FINRA and sorts the numbers accordingly to the task
    public static void finraSorter(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);

            }

        }

    }



}
