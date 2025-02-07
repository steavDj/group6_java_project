package lindey.week4;

public class ReverseNegativeNums_LS {
    public static void main(String[] args) {
        System.out.println("reverseNegativeNums(0) = " + reverseNegativeNums(0));
        System.out.println("reverseNegativeNums(-18) = " + reverseNegativeNums(-18));
        System.out.println("reverseNegativeNums(24) = " + reverseNegativeNums(24));


    }

    public static int reverseNegativeNums(int x){
        //-123
        String str = new StringBuilder(x+"").reverse().toString(); //321-

        if (x<0){
            str = str.substring(0,str.length()-1); //321
            str =  "-" + str; //-321
            x = Integer.valueOf(str);

        }
            return x;
    }
}
