package xander.practice;

import java.util.Arrays;
import java.util.Random;

// SELECTION SORT (ALGORITHM)
// Space Complexity: O(1) : in-place sorting
// Runtime Complexity: O(n^2): no optimization for best cases

// Fewer swaps/steps than Bubble Sort
// Unstable (May change relative order of equal elements)
// Small Data-Sets + Memory Constrained + Minimizing swaps is priority

public class SelectionSort {
    public static void main(String[] args) {

        // Fixed small scale data for runtime test
        int[] numbers = {10, 5, 2, 90, 2, 15};

        // Random scalable scale date for runtime test
        int[] numbersRandom = randomArray(10_000);

        System.out.println(Arrays.toString(numbersRandom));

        // Printing before and after Selection Sort to see runtime (Random Large Data)
        runtimeCalculation(numbersRandom);

        System.out.println("-----");

        // Printing before and after Selection Sort to see runtime (Fixed Data)
        runtimeCalculation(numbers);
    }

    public static void selectionSort(int[] arr) {

        // Outer loop to iterate through sorted partitions within the array
        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];
            int minIndex = i;

            // Inner loop to find the lowest num in the unsorted partition
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // Swap the values for the current iteration of outer loop
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;

        }

    }

    public static void runtimeCalculation(int[] arr) {

        System.out.println(Arrays.toString(arr));
        long startTime = System.currentTimeMillis();

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime + " ms");
    }

    public static int[] randomArray(int size) {

        Random random = new Random();
        int[] randomArray = new int[size];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt();
        }

        return randomArray;
    }

}
