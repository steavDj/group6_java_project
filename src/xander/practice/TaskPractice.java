package xander.practice;

import java.util.Scanner;

public class TaskPractice {
    public static void main(String[] args) {

        int[] exArray = {1, 2, 2, 4, 5, 6, 7, -1, 2, 3, -20, -20};
//        System.out.println(findMinimumTask10(exArray));

        Scanner scanner = new Scanner(System.in);

        int minInput = scanner.nextInt();
        //System.out.println();
        int maxInput = scanner.nextInt();

        scanner.close();

        valueMinMax(minInput, maxInput);

    }

    //    Task 10
    //    Find Minimum
    //    Write a method that can find the minimum number from an int Array

    // Initialize the first minimum value: either 32 bit max num or first index within array
    // Loop and iterate through the array; compare our current minimum to the current index
    // If the current index is smaller, re-assign the min value to the current array index
    // If not, leave the min as is
    // Return min

    public static int findMinimumTask10(int[] arr) {

//        int min = Integer.MAX_VALUE;
        int min = arr[0];

        if (arr.length < 2) {
            return min;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

//    Additional Practice Task (Alvin)
//    Please write a function with two parameters as min_value and max_value
//    which displays all odd numbers & even numbers between these values including themselves
//    Please consider input data controls as well.

    // Create a for loop that iterates from the min value to the max value
    // For numbers that are divisible by 2, display as an even number
    // For numbers that are not divisible by 2, display as an odd number

    public static void valueMinMax(int min_value, int max_value) {

        if (min_value < max_value) {
            for (int i = min_value; i <= max_value; i++) {

                if (i == 0) {
                    System.out.println(i + " zero");
                } else if (i % 2 == 0) {
                    System.out.println(i + " even");
                } else {
                    System.out.println(i + " odd");
                }
            }

        } else {
            System.out.println("Invalid Range");
        }

    }
}
