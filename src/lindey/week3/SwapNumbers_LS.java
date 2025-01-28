package lindey.week3;

public class SwapNumbers_LS {
    public static void main(String[] args) {
        //Swap two variables’ values without a third variable
        int x = -15;
        int y = 2;
        System.out.println("Before Method");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y = x + y; // x=9, y=15
        x = y - x; //x=7, y=15
        y = y - x; //x==7 y==9
        System.out.println("After Method");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
