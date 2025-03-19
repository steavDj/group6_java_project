package xander.week8;

/**
 * @author Xander Stone
 */

/*
    String - Reverse String

    Write a return method that can reverse a String

    Ex: Reverse("ABCD") -> DCBA

 */

public class ReverseStringXS {
    public static void main(String[] args) {

        System.out.println(stringReverse("ABCD"));
        System.out.println(stringReverseSB("ABCD"));

    }

    public static String stringReverseSB(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static String stringReverse(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

}
