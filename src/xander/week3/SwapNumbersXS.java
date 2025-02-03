package xander.week3;

public class SwapNumbersXS {
    public static void main(String[] args) {

        // Additional Test Cases
        numberSwapper(5, 10);
        System.out.println("---");
        numberSwapper(14, 56);
        System.out.println("---");
        numberSwapper(75, 90);
        System.out.println("---");
        numberSwapper(50, 100);

    }

    public static void numberSwapper(int num1, int num2) {

        System.out.println("Before the swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After the swap");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
