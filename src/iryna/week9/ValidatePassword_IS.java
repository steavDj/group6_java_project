package iryna.week9;

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
public class ValidatePassword_IS {
    public static void main(String[] args) {
        System.out.println(validatePassword("253Sparta!"));
        System.out.println(validatePassword("Lviv324!*"));
        System.out.println(validatePassword("fd"));
        System.out.println(validatePassword("hahah1"));
    }

    //1. Scanner
    //Check if contains 6 chars password.length
    //check if contains spaces password.contains (" ")
    //check if have has Upper case Character - isUpperCase/isLoweCase
    //check if have Character
    public static boolean validatePassword(String password) {
        boolean lowerCase = false;
        boolean upperCase = false;
        boolean specialChar = false;
        boolean digit = false;

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isLowerCase(ch)) {
                lowerCase = true;
            } else if (Character.isUpperCase(ch)) {
                upperCase = true;
            } else if (Character.isDigit(ch)) {
                digit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                specialChar = true;
            }

        }
        return (lowerCase && upperCase && digit && specialChar);
    }
}