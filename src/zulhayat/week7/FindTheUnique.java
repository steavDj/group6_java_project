package zulhayat.week7;

import java.util.HashMap;

public class FindTheUnique {

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = findUniqueCharacters(input);
        System.out.println("Unique characters: " + result);  // Output: "DEF"
    }



    // Method to find unique characters in a string
    public static String findUniqueCharacters(String str) {
        // HashMap to store the frequency of each character
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Loop through each character in the string and populate the map
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Variable to store the unique characters
        String result = "";

        // Loop through the map and append characters that appear only once
        for (char ch : charFrequencyMap.keySet()) {
            if (charFrequencyMap.get(ch) == 1) {
                result += ch;  // Concatenate unique characters to result
            }
        }

        // Return the string with unique characters
        return result;
    }


}
