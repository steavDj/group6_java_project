package iryna.week12;

import java.util.Arrays;
import java.util.Random;

public class ArraySumIsZero {
    public static void main(String[] args) {
        System.out.println("(sumIsZero(3)) = " + Arrays.toString(sumIsZero(3)));
        System.out.println("(sumIsZero(4)) = " + Arrays.toString(sumIsZero(4)));
        System.out.println("(sumIsZero(6)) = " + Arrays.toString(sumIsZero(6)));
        System.out.println("(sumIsZero(7)) = " + Arrays.toString(sumIsZero(7)));

    }

    public static int[] sumIsZero(int num) {

        int[] numbers = new int[num];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            // numbers[i] = random.nextInt(20) -40;
            numbers[i] = random.nextInt(num * 2 + 1) - num;
            numbers[i] = random.nextInt(20) - 40;
            sum += numbers[i];
        }

        numbers[num - 1] = -sum;

        return numbers;
    }
}
