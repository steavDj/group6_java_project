package hanna.week4;

public class ReverseNegativeNumber_HL {
    public static int reverseNegative(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }

        // Convert the number to positive, reverse it, and add the negative sign back
        int reversed = 0;
        num = -num;  // Make the number positive for reversal

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return -reversed;  // Add the negative sign back
    }

    public static void main(String[] args) {
        int num = -56789;
        int reversedNum = reverseNegative(num);
        System.out.println("Original " + num);
        System.out.println("Reversed Number: " + reversedNum);
    }
}





