package dmytro.week9;

public class PasswordValidationDS {

    public static void main(String[] args) {

        String password = "g$sa1%LJd";      // should     pass --> 9 chars: 2 special, 4 lowerCase, 2 upperCase, 1 digit
        String password1 = "g$sa1% LJd";    // should NOT pass --> 9 chars: 1 space, 2 special, 4 lowerCase, 2 upperCase, 1 digit
        String password2 = "g$sa1";         // should NOT pass --> 5 chars: 1 special, 3 lowerCase, 1 digit
        String password3 = "glasrssa1";     // should NOT pass --> 9 chars: 8 lowerCase, 1 digit

        System.out.println("password = " + password);
        System.out.println("isValid(password) = " + isPasswordValid(password));

        System.out.println();

        System.out.println("password1 = " + password1);
        System.out.println("isValid(password1) = " + isPasswordValid(password1));

        System.out.println();

        System.out.println("password2 = " + password2);
        System.out.println("isValid(password2) = " + isPasswordValid(password2));

        System.out.println();

        System.out.println("password3 = " + password3);
        System.out.println("isValid(password3) = " + isPasswordValid(password3));


    }

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

    public static boolean isPasswordValid(String password) {

        boolean
                upperCase = false,
                lowerCase = false,
                specialChar = false,
                digit = false;

        if (password.length()>5 && !password.contains(" ")) {
            for (int i = 0; i < password.length(); i++) {

                if ( Character.isDigit(password.charAt(i)) )
                    digit = true;
                if ( Character.isUpperCase(password.charAt(i)) )
                    upperCase = true;
                if ( Character.isLowerCase(password.charAt(i)) )
                    lowerCase = true;
                if ( !Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i)) )
                    specialChar = true;

            }
        } else {
            return false;
        }

        return (upperCase && lowerCase && specialChar && digit);
    }

}
