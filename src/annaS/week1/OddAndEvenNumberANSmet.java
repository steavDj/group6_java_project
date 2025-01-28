package annaS.week1;

public class OddAndEvenNumberANSmet {
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
//Task Requirements
// Numbers -- Odd & Even
//    Write a method that identifies whether a given number is even or odd
