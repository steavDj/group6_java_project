package xander.practice;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseArrayInt(arr)));
        
    }
    
    public static int[] reverseArrayInt(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = start;
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    
}
