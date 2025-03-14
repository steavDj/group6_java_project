package annaS.week4;

public class ReverseNegative {

    public static void main(String[] args) {
        System.out.println("reverseNum = " + reverseNegativeNumbers(-25));
        System.out.println("reverseNum = " + reverseNegativeNumbers(-123));
        System.out.println("reverseNum = " + reverseNegativeNumbers(123));
        System.out.println("reverseNum = " + reverseNegativeNumbers(-10));
    }

    // Solving with ready Method
    public  static int reverseNegativeNumbers(int num) {
        String str = new StringBuilder(num+ "").reverse().toString();// 321-


        if (num<0){
            str = str.substring(0,str.length()-1); // 321
            str = "-"+ str;
        }

        return Integer.valueOf(str);

    }

}
// Leetcode

/* reverse from Negative to Positive!
 public  static int reverseNegativeNums(int num) {

        if (num < 0) {
            num = -(num);
        }
        return num;

    }
 */