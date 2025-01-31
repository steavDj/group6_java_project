package irfan.week1;

public class OddAndEvenNumberIT {
    public static void main(String[] args) {

        System.out.println("Hello Team Let's Do it!");
        System.out.println(verifyOddOrEven(10));
        System.out.println(verifyOddOrEven(5));

    }

    public static String verifyOddOrEven(int num){

        return num%2==0?"Even":"Odd";

    }

}
