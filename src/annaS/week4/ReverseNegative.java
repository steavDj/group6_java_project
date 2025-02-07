package annaS.week4;

public class ReverseNegative {

    public static void main(String[] args) {
        System.out.println("reverseNum(-22) = " + reverseNum(-22));
        System.out.println("reverseNum(-555) = " + reverseNum(-555));
    }

    public  static int reverseNum(int num){
        Math.abs(num);
        return -num;
    }

}
// Leetcode
