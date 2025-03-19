package xander.week7;

import java.util.HashMap;

/**
 * @author Xander Stone
 */

/*
    String - Find the unique set of characters

    Write a return method that can find the unique characters from the String

    Ex: unique("AAABBBCCCDEF") -> "DEF"

 */

public class FindUniqueXS {
    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));
        System.out.println(uniqueStringBuilder("AAABBBCCCDEF"));
        System.out.println(uniqueHashMap("AAABBBCCCDEF"));
        System.out.println(uniqueHashMapSB("AAABBBCCCDEF"));

    }

    public static String unique(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }
        }
        return result;
    }

    public static String uniqueStringBuilder(String str) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String uniqueHashMap(String str) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        String result = "";

        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                result += ch;
            }
        }

        return result;

    }

    public static String uniqueHashMapSB(String str) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (charCount.containsKey(ch)) {
                charCount.put(ch, charCount.get(ch) + 1);
            } else {
                charCount.put(ch, 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) == 1) {
                result.append(ch);
            }
        }

        return result.toString();
    }

}


