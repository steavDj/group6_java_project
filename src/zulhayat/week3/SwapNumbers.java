package zulhayat.week3;

public class SwapNumbers {

    // Swap two varible values without using a third variable



        public static void main(String[] args) {
            int a = 10;
            int b = 8;

            System.out.println("Before Swap : a = " +  a  +  " , b = " + b);


            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("After Swap : a = " + a + " , b = " + b);
        }
    }

