package oleksandr.week02;


import java.util.Scanner;

public class FINRA_OB {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       System.out.println("Please input your number: ");

        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
