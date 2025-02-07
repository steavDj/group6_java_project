package zulhayat.week4;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        int result = reverseNegativeNumber(-214);
        System.out.println(result);
    }

    public static int reverseNegativeNumber(int num) {
        if (num < 0)
            num = -num;

        return num;

        }


    }
