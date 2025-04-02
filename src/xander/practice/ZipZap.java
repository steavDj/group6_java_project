package xander.practice;

import java.util.Scanner;

/*
    Look for patterns like "zip" and "zap" in the string -- length-3,
    // starting with 'z' and ending with 'p'. Return a string where for all such words,
    // the middle letter is gone, so "zipXzap" yields "zpXzp".

    //zipZap("zipXzap") → "zpXzp"
    //zipZap("zopzop") → "zpzp"
    //zipZap("zzzopzop") → "zzzpzp"
 */

public class ZipZap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        scanner.close();

        System.out.println(zipZap(input));
        System.out.println(zipZapRegex(input));
        System.out.println(zipZapTest(input));

    }

    public static String zipZap(String str) {

        StringBuilder result = new StringBuilder();

        if (str.length() < 3) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {
            if ( (i + 2 < str.length()) && ( (str.charAt(i) == 'z') && (str.charAt(i + 2) == 'p')) ) {
                result.append(str.charAt(i)).append(str.charAt(i + 2));
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();

    }

    public static String zipZapRegex(String str) {

        if (str.length() < 3) {
            return str;
        }

        return str.replaceAll("z.p", "zp");

    }

    public static String zipZapTest(String str) {

        String result = "";

        if (str.length() < 3) {
            return str;
        }

        for (int i = 0; i < str.length(); i++) {

            if (i + 2 < str.length()) {

                char each = str.charAt(i);
                char eachTwo = str.charAt(i + 2);

                if (each == 'z' && eachTwo == 'p') {
                    result += each;
                    result += eachTwo;
                    i += 2;
                } else {
                    result += each;
                }
            } else {
                result += str.charAt(i);
            }

        }

        return result;

    }

}
