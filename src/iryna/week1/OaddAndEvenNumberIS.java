package iryna.week1;

public class OaddAndEvenNumberIS {
    public static void main(String[] args) {
        // Numbers -- Odd & Even
        //    Write a method that identifies whether a given number is even or odd
        //    EX:
        //        identify(5) -> "Odd"
        //        identify(6) -> "Even"

        identify(5);
        identify(6);
        identify(11);
    }

    public static void identify(int number){
        if (number % 2 == 0){
            System.out.println("Even1");
        }else {
            System.out.println("Odd");
        }

    }
}
