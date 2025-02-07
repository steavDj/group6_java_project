package xander.week4;

/**
 * @author Xander Stone
 */

/*
    Numbers -- Reverse Negative Number

    Write a return method that can reverse a negative number and return it as an int

 */

public class NegativeNumberXS {
    public static void main(String[] args) {

        // Test Cases
        System.out.println(reverseNum(-10));
        System.out.println(reverseNum(-50));
        System.out.println(reverseNum(-100));

    }

    // Method that returns -num if negative, num if the value is 0 or positive
    public static int reverseNum(int num) {

        if (num < 0) {
            return -num;
        }

        return +num;
    }

}
