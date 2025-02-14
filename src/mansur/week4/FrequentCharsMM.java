package mansur.week4;

public class FrequentCharsMM {

    // Write a return method that can find the frequency of characters
    // ex frequencyOfChars(AAABBCDD) ==> A3B2C1D2

    public static void main(String[] args) {


       String chars =  FrequencyOfChars("");
       System.out.println(chars);

    }

    public static String FrequencyOfChars(String str) {

        String result = "";

        while (!str.isEmpty()) {

            char ch = str.charAt(0); // get the first char
            int count = 0; // holds the frequency

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch) { // if char is the same as before, it gets added to count
                    count++;
                }

            }

            result += ch + String.valueOf(count); // here we get A + 3
            str = str.replace(String.valueOf(ch), ""); // this happens so it doesnt get counted again
        }

        return result;


    }
}
