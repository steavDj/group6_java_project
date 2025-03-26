package xander.practice;

public class MinMaxArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 8, 3, 6,};
        System.out.println(maxArray(arr));
        System.out.println(minArray(arr));

    }

    public static int maxArray(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minArray(int[] arr) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}
