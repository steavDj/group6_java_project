package iryna.week4;

public class NegativeToPositive {
    public static void main(String[] args) {

        System.out.println(negativeToPositive(-5));
        System.out.println(negativeToPositive(-10));
        System.out.println(negativeToPositive(-20));
        System.out.println(negativeToPositive(10));
    }

    public static int negativeToPositive(int num){
        if (num < 0){
            return -num;
        }
        return num;
    }
}
