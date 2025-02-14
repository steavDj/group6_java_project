package annaS.week2;

public class FinraANS {
    public static void main(String[] args) {

       finraMethod(40);
        System.out.println();
        finraMethodBoolean(50);

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

    private static void finraMethodBoolean(int num) {
        for (int i = 1; i <= num; i++) {

            boolean divBy3 = i%3==0;
            boolean divBy5 = i%5==0;

            String result ="";

            if (divBy3 && divBy5) {
                result = "FINRA";
            }else if (divBy3) {
                result = "FIN";
            }else if (divBy5) {
                result = "RA";
            }else {
                result = i + "";
            }

           System.out.print(result + " ");
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