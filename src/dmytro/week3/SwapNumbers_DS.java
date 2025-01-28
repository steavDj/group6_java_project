package dmytro.week3;

public class SwapNumbers_DS {

    public static void main(String[] args) {

        // Declare & initialize our variables
        int first = 12;
        int second = 3;

        System.out.println("===== Solving the task without method =====\n");

        System.out.println("first = " + first);
        System.out.println("second = " + second);

        first += second;
        second = first - second;
        first -= second;

        System.out.println("\nfirst = " + first);
        System.out.println("second = " + second);

        System.out.println("\n===== Solving the task via the method =====\n");

        swap(first, second);
        swap(30,60);
        swap(12, 400);
        swap(-13, 12);
        swap(-2, -32);

    }

    public static void swap(int a, int b) {

        // Print out original values of two numbers before swapping
        System.out.println("Original value:");
        System.out.println("\t\t\t\t First number : " + a);
        System.out.println("\t\t\t\t Second number: " + b);

        // Re-assign "a" value. Adding value of the "b" to the "a" variable
        a = a + b;

        // Re-assigning "b" value. Subtract "b" from "a" variable
        b = a - b;

        // Re-assign "a" value. Subtract "b" from "a" variable
        a = a - b;

        // Print out values of two numbers after swapping
        System.out.println("After swapping:");
        System.out.println("\t\t\t\t First number : " + a);
        System.out.println("\t\t\t\t Second number: " + b);

    }

}
