package xander.week5;

import java.util.HashMap;

/**
 * @author Xander Stone
 */

/*
    Write a return method that can find the frequency of characters
        Ex: FrequencyOfChars("AAABBCDD") -> A3B2C1D2

 */

public class CharFrequencyXS {
    public static void main(String[] args) {

        System.out.println(charFrequencyNestedForLoop("AAABBCDD"));
        System.out.println(charFrequencyHashMap("AAABBCDD"));
        System.out.println(charFrequencyFixedArray("AAABBCDD"));
    }

    // Solution 1 with nested for loops; Time Complexity: O(n^2) Space Complexity: O(n)
    public static String charFrequencyNestedForLoop(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            char currChar = str.charAt(i);

            for (int j = i + 1; j < str.length() && str.charAt(j) == currChar; j++, i++) {
                count++;
            }

            result += currChar + String.valueOf(count);
        }

        return result;
    }

    // Solution 2 using Hash Map; Time Complexity: O(n) Space Complexity: O(n)
    public static String charFrequencyHashMap(String str) {
        String result = "";

        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (freqMap.containsKey(str.charAt(i))) {
                freqMap.put(str.charAt(i), freqMap.get(str.charAt(i)) + 1);
            } else {
                freqMap.put(str.charAt(i), 1);
            }
        }

        for (char ch : freqMap.keySet()) {
            result += ch + Integer.toString(freqMap.get(ch));
        }

        return result;
    }

    // Solution 3 using fixed Array for all possible ASCII combinations; Time Complexity: O(n) Space Complexity: O(1)
    public static String charFrequencyFixedArray(String str) {
        String result = "";
        int[] freqArray = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freqArray[str.charAt(i)]++;
        }

        for (int i = 0; i < freqArray.length; i++) {
            if (freqArray[i] > 0) {
                result += (char) i + Integer.toString(freqArray[i]);
            }
        }

        return result;
    }

}
