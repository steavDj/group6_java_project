package mansur.week1;

public class OddAndEvenNumberMM {

    public static void main(String[] args) {

        System.out.println("Hello team");


        String result = identify(2);
        String result2 = identify(3);
        System.out.println(result);
        System.out.println(result2);

    }

    public static String identify(int num){
        if (num % 2 != 0){
            return "odd1";
        }
        return "even";
    }
}
