package xander.practice;

public class Palindrome {
    public static void main(String[] args) {

        palBothEnds("madam");
        palReverse("madam");

    }

    public static void palBothEnds(String str) {

        // replaceAll Character class [] for only numbers and characters to be included during the comparisons
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // included/excluded depending on need of case sensitivity

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str + " is not a palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println(str + " is a palindrome");
    }

    public static void palReverse(String str) {

        StringBuilder strRev = new StringBuilder();

        // Include or exclude depending on whether you need case sensitivity and extra characters or not
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            strRev.append(str.charAt(i));
        }

        // Could also use .equals(strRev.toString())
        if (str.contentEquals(strRev)) {
            System.out.println(str + " is a palindrome");
        } else  {
            System.out.println(str + " is not a palindrome");
        }

    }

}
