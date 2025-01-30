package hanna.week3;

public class SwapNumbers_HL {

    private static void swapNumbers(int x, int y) {

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Method Swap : " + x + " " + y);

    }

    public static void main(String[] args) {



        int a = 10;
        int b = 20;

        System.out.println("Before swap: " + "a is -> " + a + " and b is -> " + b);

        a = a + b; // 10 + 20 =30
        b = a - b; //30 - 20 = 10
        a = a - b;  //30 -10 = 20

        System.out.println("After swap: " + "a is -> " + a + " and b is -> " + b);

        swapNumbers(100, 200);




    }
}
