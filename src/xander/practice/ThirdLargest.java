package xander.practice;

import java.util.*;

/*
    Given an unsorted array of integers, find the third-largest number in the array. If the array has less than 3 distinct numbers
    return the largest number ?
        Example
        Input:
        arr1=[2,4,1,5,3,6]
        arr2 = [10, 10, 20]
        arr3 = [5, 5, 5]
        Output1: 4
        Output2: 20
        Output3: 5
 */

public class ThirdLargest {
    public static void main(String[] args) {

        int[] arr = {2,4,1,5,3,6};
        int[] arr2 = {10, 10, 20};
        int[] arr3 = {5, 5, 5};
        int[] arr4 = {10, 10, 10, 50, 50,};
        int[] arr5 = {5, 20, 7, 0, 19, 0};

        System.out.println(thirdLargest2(arr2));
    }

    public static int thirdLargest(int[] arr) {

        Integer first = null, second = null, third = null;

        for (int num : arr) {
            // Skip duplicates
            Integer numInteger = num;
            if (numInteger.equals(first) || numInteger.equals(second) || numInteger.equals(third)) {
                continue;
            }

            if (first == null || num > first) {
                third = second;
                second = first;
                first = num;
            } else if (second == null || num > second) {
                third = second;
                second = num;
            } else if (third == null || num > third) {
                third = num;
            }
        }


        if (third != null) {
            return third;
        } else return Objects.requireNonNullElse(first, -1);

    }

    // TreeSet Solution -> Does not store duplicates (
    public static int thirdLargest2(int[] arr) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int num : arr) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst();
            }
        }

        if (set.size() >= 3) {
            return set.first();
        } else {
            return set.last();
        }

    }

    public static int thirdLargest3(int[] arr) {

        Arrays.sort(arr); // Sorts in ascending order

        int distinctCount = 0;
        int lastNum = Integer.MAX_VALUE;

        // Traverse from the end to find the third distinct number
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != lastNum) {
                distinctCount++;
                lastNum = arr[i];
            }
            if (distinctCount == 3) {
                return arr[i];
            }
        }

        // If there are less than 3 distinct numbers, return the largest
        return arr[arr.length - 1];
    }

}
