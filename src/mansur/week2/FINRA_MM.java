package mansur.week2;

public class FINRA_MM {

    public static void main(String[] args) {
            for (int i = 1; i <= 30; i++) {
                if (i % 15 == 0) {
                    System.out.println("FINRA");
                } else if (i % 5 == 0) {
                    System.out.println("RA");
                } else if (i % 3 == 0) {
                    System.out.println("FIN");
                } else System.out.println(i);
            }
        }
    }


