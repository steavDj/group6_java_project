package anna.week1;

public class OddAndEvenNumberAN {
    public static void main(String[] args) {

       identifyOddOrEven(-23);


    }

    public static void identifyOddOrEven(int number){
        if (number%2 == 0){
            System.out.println("This number -> "+ number+" is Even.");
        }else if (number%2 == 1){
            System.out.println("This number -> "+ number+" is Odd.");
        }else{
            System.out.println("This number is negative or zero");
        }
    }

}
