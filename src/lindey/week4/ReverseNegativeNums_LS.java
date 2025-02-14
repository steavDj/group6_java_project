package lindey.week4;

public class ReverseNegativeNums_LS {
    public static int originalInput;
    public static void main(String[] args) {
        System.out.println("reverseNegNums(-123) = " + reverseNegNums(-123));
        System.out.println("---------------------");
        System.out.println("reverseNegNums(123) = " + reverseNegNums(123));
        System.out.println("---------------------");
        System.out.println("reverseNegNums(-300) = " + reverseNegNums(-300));
        System.out.println("---------------------");

        System.out.println(showLeadingZeros(reverseNegNums(-2500)));
    }



    public static int reverseNegNums(int x){ //x= -200
        if (x >= 0) {
            System.out.print("Invalid entry; number must be negative. You entered: ");
        }

        originalInput = x;

        if (x < 0) {
            String str = new StringBuilder(String.valueOf(-x)).reverse().toString(); //002
            x = -(Integer.parseInt(str)); //-2
        }

        return x;
    }


    public static String showLeadingZeros (int x){
        String str = new StringBuilder(String.valueOf(-originalInput)).reverse().toString(); //002
        if (str.charAt(0) == '0'){
            System.out.println("Integer value of reversed negative num= "+ x);
            str = "String value showing leading zeros= -" + str;
        }return str;
    }



}
