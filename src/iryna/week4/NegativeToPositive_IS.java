package iryna.week4;

public class NegativeToPositive_IS {
    public static void main(String[] args) {

        System.out.println(negativeToPositive(-5));
        System.out.println(negativeToPositive(-10));
        System.out.println(negativeToPositive(-20));
        System.out.println(negativeToPositive(10));
        System.out.println(reverseNegativeNum(-23));
    }

    public static int negativeToPositive(int num){
        if (num < 0){
            return -num;
        }
        return num;
    }

    public static int reverseNegativeNum(int num){
        String stringNum = "" + num;
        String stringNumReversed = "";

        if (num < 0) {
            for (int i = stringNum.length() - 1; i > 0; i--) {
                stringNumReversed = stringNumReversed + stringNum.charAt(i);
            }
            return Integer.parseInt("-" + stringNumReversed);
        }

        return num;
    }

}
