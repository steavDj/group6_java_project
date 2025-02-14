package xander.week4;

/**
 * @author Xander Stone
 */

/*
    Numbers -- Reverse Negative Number

    Write a return method that can reverse a negative number and return it as an int

 */

public class NegativeNumberXS {
    public static void main(String[] args) {

        // Solution 1 Test Cases
        System.out.println("Results for solution without StringBuilder");
        System.out.println(reverseNum(-15));
        System.out.println(reverseNum(-57));
        System.out.println(reverseNum(-125));
        System.out.println(reverseNum(-10));

        System.out.println("-----");

        // Solution 2 Test Cases
        System.out.println("Results for solution using StringBuilder");
        System.out.println(reverseNumStringBuilder(-15));
        System.out.println(reverseNumStringBuilder(-57));
        System.out.println(reverseNumStringBuilder(-125));
        System.out.println(reverseNumStringBuilder(-10));

    }

    // Reversing a negative number without StringBuilder
    public static int reverseNum(int num) {

        String stringNum = "" + num;
        String stringNumReversed = "";

        if (num < 0) {
            for (int i = stringNum.length() - 1; i > 0; i--) {
                stringNumReversed = stringNumReversed + stringNum.charAt(i);
            }
            return Integer.parseInt("-" + stringNumReversed);
        }

        return num;
    }

    // Reversing a negative number using StringBuilder
    public static int reverseNumStringBuilder(int num) {

        if (num < 0) {
            StringBuilder sbNum = new StringBuilder(String.valueOf(-num));
            String stringNumReversed = sbNum.reverse().toString();
            return Integer.parseInt("-" + stringNumReversed);
        }
        return num;
    }

}
