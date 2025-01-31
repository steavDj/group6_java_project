package iryna.week3;

public class SwapNumbers_IS {

    public static void main(String[] args) {
        swapNumbers(11,22);
        swapNumbers(3, 42);
        swapNumbers(5, 14);

    }

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping variables: ");
        System.out.println("num1 = " + num1 + ", \tnum2 = " + num2);

    }

}
