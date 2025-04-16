package xander.week11;

import java.util.Arrays;

public class SortArrayXS {
    public static void main(String[] args) {

        int[] testArrSelectionSort = {3, 6, 23, 2, 5, 1};
        System.out.println("Unsorted Array: " + Arrays.toString(testArrSelectionSort));
        System.out.println("Selection Sort" + Arrays.toString(selectionSort(testArrSelectionSort)));

        System.out.println("-----");

        int[] testArrBubbleSort = {3, 6, 23, 2, 5, 1};
        System.out.println("Unsorted Array: " + Arrays.toString(testArrBubbleSort));
        System.out.println("Bubble Sort" + Arrays.toString(bubbleSort(testArrBubbleSort)));

    }

    public static int[] selectionSort(int[] arr) {

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
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {

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
        return arr;
    }

}
