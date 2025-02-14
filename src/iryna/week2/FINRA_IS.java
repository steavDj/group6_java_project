package iryna.week2;

public class FINRA_IS {
    public static void main(String[] args) {

        int num = 30;
        finraNumber(num);

    }

    private static void finraNumber(int num) {
        for (int i = 1; i<=num; i++){
            if (i % 3 == 0 && i % 5 == 0 ){
                System.out.print("FINRA ");
            } else if (i % 3 == 0){
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
