package zulhayat.week4;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
       reverseNegativeNumber(-12345);

    }

    public static int reverseNegativeNumber(int num) {

        String str = new StringBuilder(num + "").reverse().toString();

        if (num < 0) {
            str.substring(0, str.length() - 1);
            str = "-" + str;
        num= Integer.valueOf(str);

        }
      return  num ;
    }
}