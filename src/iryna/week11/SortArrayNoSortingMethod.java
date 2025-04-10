package iryna.week11;

import java.util.Arrays;

public class SortArrayNoSortingMethod {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortingArrayBubble(arr);

        sortingArrayBubbleBoolean(arr);

        sortingSelectionSort(arr);
    }

    public static void sortingArrayBubble(int[] list){
        //1. counter -1
        //while counter is !=0
        //iterate

        int counter = -1;

        while (counter != 0){

            counter = 0;

            for (int i = 0; i < list.length-1; i++) {
              if (list[i] > list[i+1]){
                  int temp = list[i];
                  list[i] = list[i+1];
                  list[i+1] = temp;
                  counter++;

              }
            }

        }
        System.out.println(Arrays.toString(list));
    }

    public static void sortingArrayBubbleBoolean(int[] list){
        //1. counter -1
        //while counter is !=0
        //iterate

        boolean swapped = true;

        while (swapped){
            swapped = false;

            for (int i = 0; i < list.length-1; i++) {
                if (list[i] > list[i+1]){
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    swapped = true;
                }
            }

        }
        System.out.println(Arrays.toString(list));
    }

    public static void sortingSelectionSort(int[] list){
        //1. find the smallest number
        //swap min places with current i

        for (int i = 0; i < list.length -1; i++) {
            int min = list[i];
            int minIndex = i;

            for (int j = i +1; j <list.length; j++) {
               if (min > list[j]){
                 min = list[j];
                 minIndex = j;
               }
            }

            int temp = list[i];
            list[i] = min;
            list[minIndex] = temp;
        }

        System.out.println(Arrays.toString(list));
    }

}
