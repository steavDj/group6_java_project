package oleksandr.week01;

public class OddAndEvenNumberOB {
    public static void main(String[] args) {
        System.out.println("Hello team and let's go!");

        System.out.println("---------");
        System.out.println("oddOrEven(1) = " + oddOrEven(1));
        System.out.println("oddOrEven(2) = " + oddOrEven(2));
        System.out.println("oddOrEven(3) = " + oddOrEven(3));
        System.out.println("oddOrEven(0) = " + oddOrEven(0));


    }

    public static String oddOrEven(int num){
        if (num == 0 ){
            return "number is zero";
        } else if (num % 2 == 0) {
            return "even" ;
        }
        return "odd";
    }
}
