package iryna.week5;
//Write a return method that can find the frequency of characters
//Ex: FrequencyOfChars("AAABBCDD") -> A3B2C1D2

public class CharFrequency_IS {
    public static void main(String[] args) {

    }

    public static void frequency(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            int count = 0;
            boolean IsExist = false;
            char letter = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if(letter == str.charAt(j) && !result.contains(String.valueOf(letter)))
                {
                    count++;
                }
            }

        }

    }
}
