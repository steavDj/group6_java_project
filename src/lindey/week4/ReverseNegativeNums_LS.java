package lindey.week4;

public class ReverseNegativeNums_LS {
    public static void main(String[] args) {
        System.out.println("reverseNegativeNums(0) = " + reverseNegativeNums(0));
        System.out.println("reverseNegativeNums(-18) = " + reverseNegativeNums(-18));
        System.out.println("reverseNegativeNums(24) = " + reverseNegativeNums(24));

    }

    public static int reverseNegativeNums(int x){
        if (x<0){
            x = -(x);
        }return x;
    }
}
