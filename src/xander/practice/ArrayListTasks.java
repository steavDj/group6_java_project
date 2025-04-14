package xander.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/*
Problem 1: Find the Most Frequent Element in an ArrayList

Write a Java program that finds the most frequent element in an ArrayList<Integer>.
If there are multiple elements with the same frequency, print the one that appears first in the list. If the list is empty, return.
 */

/*
Problem: Find the Second-Largest Element in an ArrayList

Write a Java program that finds the second-largest element in an ArrayList<Integer>.
If the list has fewer than two unique elements, return. If there is a tie for the largest element, return the second-largest distinct value.
 */

public class ArrayListTasks {
    public static void main(String[] args) {

        ArrayList<Integer> list = randomArrayList(10);
        ArrayList<Integer> freqList = new ArrayList<>();
        freqList.add(1);
        freqList.add(5);
        freqList.add(5);
        freqList.add(6);
        freqList.add(10);
        freqList.add(6);


        System.out.println(freqList);
        mostFrequent(freqList);

        System.out.println("-----");

        System.out.println(list);
        secondLargest(list);

    }

    public static void mostFrequent(ArrayList<Integer> list) {

        // Check if the list is null or empty first
        if (list == null || list.isEmpty()) {
            return;
        }

        // Create Hash Map to store values and their frequency within the Array List
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Integer maxFreq = 0;
        Integer maxFreqElement = null;

        for (int i = 0; i < freqMap.size(); i++) {
            int num = list.get(i);
            if (freqMap.get(num) > maxFreq) {
                maxFreq =freqMap.get(num);
                maxFreqElement = num;
            }
        }

        System.out.println(maxFreqElement);

    }

    public static void secondLargest(ArrayList<Integer> list) {

        // Check if the Array List is at least 2 elements before proceeding
        if (list == null || list.size() < 2) {
            return;
        }

        // Use HashSet to get rid of duplicates (does not store duplicates) -> can pass list into it
        HashSet<Integer> uniqueList = new HashSet<>(list);

        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer num : uniqueList) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && !num.equals(largest)) {
                secondLargest = num;
            }
        }

        System.out.println(secondLargest);

    }

    public static ArrayList<Integer> randomArrayList(int size) {

        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }

        return list;
    }


}
