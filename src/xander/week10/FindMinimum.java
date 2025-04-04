package xander.week10;

/*
    Find Minimum
    Write a method that can find the minimum number from an int Array
 */

public class FindMinimum {
    public static void main(String[] args) {

        int[] arr = {-80, -40, 1, 4, 6, 7, 3, 2, 1, -95, 7, -1, 2, 4, -20};

        System.out.println(findMin(arr));

    }

    public static int findMin(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

}
