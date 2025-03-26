package xander.week9;

import java.util.Arrays;
import java.util.Scanner;

/*
    String -- Password Validation Task

    Write a return method that can verify if a password is valid or not.

    Requirements:

    Password MUST be at least have 6 characters and should not contain space

    Password should at least contain one upper case letter

    Password should at least contain one lowercase letter

    Password should at least contain one special character

    Password should at least contain a digit

    If all requirements above are met, the method returns true, otherwise returns false.
 */

public class PasswordValidationXS {
    public static void main(String[] args) {

        // For testing password combinations more efficiently
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//
//        scanner.close();

        String testPassword = "Hola%213";
        System.out.println(validatePassword(testPassword));

    }

    public static Boolean validatePassword(String str) {

        boolean pwUpper = false, pwLower = false, pwDigit = false, pwSpecial = false;

        // If the password is not at least 6 characters or has spaces, return false; no point checking other conditions
        if (str.contains(" ") || str.length() < 6) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) { // Checking whether the current character is uppercase
                pwUpper = true;
            } else if (Character.isLowerCase(ch)) { // Checking whether the current character is lowercase
                pwLower = true;
            } else if (Character.isDigit(ch)) { // Checking whether the current character is a numbers 0-9
                pwDigit = true;
            } else { // If the top conditions don't apply, it would have to be a special (unique) character
                pwSpecial = true;
            }
        }

        if (pwUpper && pwLower && pwDigit && pwSpecial) {
            return true;
        } else {
            return false;
        }

//         return (pwUpper && pwLower && pwDigit && pwSpecial); // Alternative one line return statement

    }

}
