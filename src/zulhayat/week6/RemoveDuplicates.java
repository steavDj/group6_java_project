package zulhayat.week6;


public class RemoveDuplicates {

    public static void main(String[] args) {

        String result = removeDuplicates("AAABBBCCC");
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}