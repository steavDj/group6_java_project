package xander.practice;

import java.util.Arrays;
import java.util.Random;

// BUBBLE SORT (ALGORITHM)
// Space Complexity: O(1) : in-place sorting
// Runtime Complexity: O(n) -> O(n^2) : Optimized for when majority is sorted

// More swaps than Selection Sort
// Stable (Preserves order of equal elements)
// Small Data-Sets + Nearly Sorted Arrays + Educational Purposes :P

public class BubbleSort {
    public static void main(String[] args) {

        // Fixed small scale data for runtime test
        int[] numbers = {10, 5, 2, 90, 2, 15};

        // Random scalable scale date for runtime test
        int[] numbersRandom = randomArray(10);

        // Printing before and after Bubble Sort to see runtime (Random Large Data)
        runtimeCalculation(numbersRandom);

        System.out.println("-----");

        // Printing before and after Bubble Sort to see runtime (Fixed Data)
        runtimeCalculation(numbers);

    }

    public static void bubbleSortAscending(int[] arr) {

        boolean swapped = true;
        while (swapped) {

            // Default value false until something is changed/swapped
            swapped = false;

            // Outer Loop, no need to compare last element
            for (int i = 0; i < arr.length - 1; i++) {

                // Inner Loop, Check if the first value is greater or not
                if (arr[i] > arr[i + 1]) {

                    // Swap Elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // If changes were made, set swapped true
                    swapped = true;

                }
            }
        }

    }

    public static void bubbleSortDescending(int[] arr) {

        boolean swapped = true;
        while (swapped) {

            // Default value false until something is changed/swapped
             swapped = false;

            // Outer Loop, no need to compare last element
            for (int i = 0; i < arr.length - 1; i++) {

                // Inner Loop, Check if the first value is greater or not
                if (arr[i] < arr[i + 1]) {

                    // Swap Elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // If changes were made, set swapped true
                    swapped = true;

                }
            }
        }

    }

    public static void runtimeCalculation(int[] arr) {

        System.out.println("Start: " + Arrays.toString(arr));
        long startTime = System.currentTimeMillis();

        bubbleSortAscending(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        bubbleSortDescending(arr);
        System.out.println("Descending: " + Arrays.toString(arr));

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + " ms");
    }

    public static int[] randomArray(int size) {

        Random random = new Random();
        int[] randomArray = new int[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(10);
        }

        return randomArray;
    }

}
