package annaS.week3;

public class Swap2VariablesANS {

    //1.Swap two variable values without using a third variable by using Arithmetic Operators(addition and subtraction)
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

          a= a+b;
          b= a-b;
          a= a-b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //2. 2nd Approach -> With a third variable
        //3. 3rd Approach ->  Swap two variable values by using Arithmetic Operators( multiplication and division )

    }


   /*
   2. With a third variable
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temporary = a; //Declaring a Third temporary variable


        a = b;
        b = temporary;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
    */

}
/*
Swap = exchanging values of two variables
 */