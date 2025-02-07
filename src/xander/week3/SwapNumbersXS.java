package xander.week3;

/**
 * @author Xander Stone
 */

/*
    Numbers -- Swap Numbers

    Swap two variable values without using a third variable

 */

public class SwapNumbersXS {
    public static void main(String[] args) {

        // Test Cases
        numberSwapper(5, 10);
        System.out.println("---");
        numberSwapper(14, 56);
        System.out.println("---");
        numberSwapper(75, 90);
        System.out.println("---");
        numberSwapper(50, 100);

    }

    // Method that swaps the numbers without using a third variable
    public static void numberSwapper(int num1, int num2) {

        System.out.println("Before the swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After the swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
