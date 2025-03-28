package dmytro.week8;

public class ReverseStringDS {

    public static void main(String[] args) {

        String word = "Hello, World!";

        System.out.println("reverse(word) = " + reverse(word));

    }

    public static String reverse(String str) {

        StringBuilder reverse = new StringBuilder();

        for(int i = str.length()-1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        return reverse.toString();

    }

}
