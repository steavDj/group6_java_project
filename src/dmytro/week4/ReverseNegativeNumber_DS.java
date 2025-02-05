package dmytro.week4;

public class ReverseNegativeNumber_DS {

    public static void main(String[] args) {

        int num1 = -223;
        int reversedNum = reverseNegative(num1);

        System.out.println("Original int value \t\t= " + num1);
        System.out.println("Value after calling\nreverseNegative method \t= " + reversedNum);

        System.out.println("\nSolving the task throw the method:\n");

        System.out.println("reverseNegative(-2) = " + reverseNegative(-2));
        System.out.println("reverseNegative(2) = " + reverseNegative(2));

    }

    public static int reverseNegative(int num) {

        // Check if number is negative
        if (num < 0)
            // Make the number positive
            num = -num;

        // Returning reversed negative number or original positive number
        return num;
    }

}
