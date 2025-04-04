package zulhayat.week10;

public class FindMinNumber {


    public static void main(String[] args) {

        int[] numbers = {14, 3, 7, 1, 15, 8};

        System.out.println( findMinimum(numbers));
    }


    public static int findMinimum(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


}

