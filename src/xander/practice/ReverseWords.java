package xander.practice;

/*
    Reverse words
    Write a method that will take a string as an argument.
    The method will reverse the position of words and return it.

    Reverse words
    Write a method that will take a string as an argument.
    The method will reverse the position of characters and return it.
 */

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("Hello My Name is Xander"));
        System.out.println(reverseWord("Xander Stone"));

    }

    public static String reverseWords(String str) {

        StringBuilder result = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        return result.toString();
    }

    public static String reverseWord(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

}
