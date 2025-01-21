package lindey.week1;

public class OddAndEvenNumbers_LS {
    public static void main(String[] args) {
        OddOrEven(5);
        OddOrEven(6);
        //OddOrEven(7);
    }


    public static void OddOrEven (int num){
        if (num % 2 == 1){
            System.out.println("Number is odd");
        }else System.out.println("Number is even");
    }
}
/*
    Numbers -- Odd & Even
    Write a method that identifies whether a given number is even or odd
    EX:
    identify(5) -> "Odd"
    identify(6) -> "Even"
 */