package xander.week6;

/**
 * @author Xander Stone
 */

/*
    String - Remove Duplicates

    Write a return method that can remove the duplicated values from a given String

    Ex: removeDup("AAABBBCCC") -> ABC

 */

public class RemoveDuplicatesXS {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicatesStringBuilder("AAABBBCCC"));
        System.out.println(removeDuplicatesStringBuilderForeachLoop("AAABBBCCC"));

    }

    // Non-StringBuilder Solution
    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }

        return result;

    }

    // StringBuilder Solution without for each loop
    public static String removeDuplicatesStringBuilder(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        return result.toString();

    }

    // StringBuilder solution with for each loop
    public static String removeDuplicatesStringBuilderForeachLoop(String str) {

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch); // result += ch
            }
        }

        return result.toString();

    }

}
