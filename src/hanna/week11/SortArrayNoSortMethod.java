package hanna.week11;

public class SortArrayNoSortMethod {

    public static int[] sort(int[] arr) {
        //Loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to compare and swap
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        arr = sort(arr);

        //Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
