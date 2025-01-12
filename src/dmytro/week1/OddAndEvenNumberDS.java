package dmytro.week1;

public class OddAndEvenNumberDS {

    public static void main(String[] args) {

        System.out.println("Hello Best Team Ever!!");

        identify(5);

        identify(22);

    }

    public static void identify(int num) {

        // Check if number has a remainder after dividing and print out result
        if (num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

}
