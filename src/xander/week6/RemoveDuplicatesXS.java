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

        removeDuplicates("AAABBBCCC");
        removeDuplicatesStringBuilder("AAABBBCCC");
        removeDuplicatesStringBuilderForeachLoop("AAABBBCCC");

    }

    // Non-StringBuilder Solution
    public static void removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(String.valueOf(ch))) {
                result += ch;
            }
        }

        System.out.println(result);

    }

    // StringBuilder Solution without for each loop
    public static void removeDuplicatesStringBuilder(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());

    }

    // StringBuilder solution with for each loop
    public static void removeDuplicatesStringBuilderForeachLoop(String str) {

        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch); // result += ch
            }
        }

        System.out.println(result.toString());

    }

}
