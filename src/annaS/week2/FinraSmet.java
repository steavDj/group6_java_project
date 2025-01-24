package annaS.week2;

public class FinraSmet {
    public static void main(String[] args) {

        int num = 30;

        finraMethod(33);


    }

    private static void finraMethod(int num) {
        for (int i = 1; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("FINRA ");
            else if (i % 5 == 0)
                System.out.print("RA ");
            else if (i % 3 == 0)
                System.out.print("FIN ");
            else
                System.out.print(i + " ");

        }

    }
}
/*
Java Coding Tasks - Week2- Task Requirements
FINRA:
Write a function that prints out the numbers from 1 to 30 but
for numbers that are a multiple of 3, print "FIN" instead of the number, and
for numbers that are a multiple of 5, print "RA" instead of the number.
For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */