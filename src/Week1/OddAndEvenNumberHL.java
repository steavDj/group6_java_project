package Week1;

public class OddAndEvenNumberHL {

    public static void main(String[] args) {
        System.out.println("Hello Guys!");

        int num = 10;

        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " is even ");
            } else {
                System.out.print(i + " is odd ");
            }
        }
    }
}
