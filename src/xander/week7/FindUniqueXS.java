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

        for (char ch : str.toCharArray()) {

        }

        return "";

    }

}


