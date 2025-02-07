package irfan.week4;

import static java.lang.Integer.reverse;

// Write a return method that can reverse negative number and return it as int
public class ReverseNegativeNumbers_IT {
    public static void main(String[] args) {

        System.out.println("reverseIfNegative(4) = " + reverseIfNegative(4));
        System.out.println("reverseIfNegative(-5) = " + reverseIfNegative(-5));

    }

    private static int reverseIfNegative(int num) {

        return (num<0)? -reverse(-num): num;

    }

}
