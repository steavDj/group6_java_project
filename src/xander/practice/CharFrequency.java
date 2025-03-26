package xander.practice;

/*
    Count the frequency of each character in a string input.
    "apple --> {a=1, p=2, l=1, e=1}
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//
//        scanner.close();
//        System.out.println("-----");
//
//        freqCounter(name);
        freqCounterArray("apple");

    }

    public static void freqCounter(String str) {

        HashMap<Character, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            mapCount.put(ch, mapCount.getOrDefault(ch, 0) + 1);
        }

        System.out.println(mapCount);

    }

    public static void freqCounterArray(String str) {

        int[] arrayCount = new int[256]; // -> 256 chars in java extended ASCII

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arrayCount[ch]++;
        }

        System.out.println(Arrays.toString(arrayCount));

        for (int i = 0; i < arrayCount.length; i++) {
            if (arrayCount[i] > 0) {
                System.out.println((char) i + " : " + arrayCount[i]);
            }
        }

    }

}
