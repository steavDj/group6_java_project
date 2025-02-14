package irfan.week3;

// Let's say we have a = 7, b = 10, swap a with b
public class SwapNumbers_IT {
    public static void main(String[] args) {
        // Swapping numbers by creating another variable
        int a = 7, b = 10;
        int c;

        c = a; // c = 7 a = 7
        a = b; // a = 10
        b = c; // b = 7

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");
        // Swapping number without creating another variable
        int a1 = 7, b1 = 10;

        a1 = a1 + b1; // a1 = 17
        b1 = a1 - b1; // b1 = 17 - 10 => 7
        a1 = a1 - b1; // a1 = 17 - 7 => 10

        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);

        System.out.println("----------------------------");
        // We can only use this solution when variable is not zero
        int a2 = 7, b2 = 10;
        a2 = a2 * b2; // a2 = 7 * 10 => 70
        b2 = a2 / b2; // b2 = 70 / 10 => 7
        a2 = a2 / b2; // a2 = 70 / 7 => 10

        System.out.println("a2 = " + a2);
        System.out.println("b2 = " + b2);

    }

}
