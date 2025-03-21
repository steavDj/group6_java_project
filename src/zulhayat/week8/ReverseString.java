package zulhayat.week8;

public class ReverseString {

    public static void main(String[] args) {

        String reversed = reverseString("ABCD");
        System.out.println(reversed);
    }

    public static String reverseString(String input) {
        String reversedStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr += input.charAt(i);
        }
        return reversedStr;
    }
}
