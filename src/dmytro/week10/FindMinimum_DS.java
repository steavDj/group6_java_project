package dmytro.week10;

import java.util.Arrays;

public class FindMinimum_DS {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 8, 0, 15, 22, 100};
        int[] arr2 = {1, 36, 8, 15, 15, 21, -5, 120};

        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("findMinimumNumber(arr) = " + findMinimumNumber(arr));

        System.out.println("\narr2 = " + Arrays.toString(arr2));
        System.out.println("findMinimumNumber(arr2) = " + findMinimumNumber(arr2));


    }

    //Write a method that can find the minimum number from an int Array
    public static int findMinimumNumber(int[] nums) {

        // 1. Initialize an int with value of maximum int value
        int min = Integer.MAX_VALUE;

        // 2. Creating forEach loop to iterate through each index of the array
        for (int num : nums) {
            // 3. Compare if our min value is greater than num from the array
            if (min > num)
                // 4. Re-assign min to num, if our min is greater than num
                min = num;
        }

        // 5. Return minimum num from the array
        return min;
    }

}
