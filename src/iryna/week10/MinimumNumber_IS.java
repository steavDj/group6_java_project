package iryna.week10;

public class MinimumNumber_IS {

    public static void main(String[] args) {
        int[] numbers = {12, 2, 11, 23, 18, 87};
        System.out.println(minNumber(numbers));

        int[] numbers2 = {1,1, 22, 41, 3, 56, -9,10};
        System.out.println(minNumber(numbers2));

    }

    public static int minNumber(int[] nums){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
}

