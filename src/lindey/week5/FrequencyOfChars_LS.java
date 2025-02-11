package lindey.week5;

import java.util.*;

public class FrequencyOfChars_LS {
    //write a return method that can find the frequency of chars
    //ex: AABCCCDDDDD => A2B1C3D5

    public static void main(String[] args) {
        String str = "AABCCCDDDDD";
        System.out.println("frequencyOfChars(str) = " + frequencyOfChars(str));
        System.out.println("charFreqAsString(frequencyOfChars(str)) = " + charFreqAsString(frequencyOfChars(str)));

        String str2 = "SUPERCALIFRAGILISTICEXPIALIDOCIOUS";
        System.out.println("frequencyOfChars(str2) = " + frequencyOfChars(str2));
        System.out.println("charFreqAsString(frequencyOfChars(str2)) = " + charFreqAsString(frequencyOfChars(str2)));
        System.out.println("charFreqAsStringInAlphaOrder(frequencyOfChars(str2)) = " + charFreqAsStringInAlphaOrder(frequencyOfChars(str2)));
    }

    public static Map frequencyOfChars(String str) {
        if (str.isEmpty()) {
            System.err.println("Value entered is null or empty");
        }

        Map<Character, Integer> counter = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (counter.containsKey(key)) {
                counter.put(key, counter.get(key) + 1);
            } else counter.put(key, 1);

        }
        return counter;


    }

    public static String charFreqAsString(Map<Character, Integer> counter) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }

    public static String charFreqAsStringInAlphaOrder(Map<Character, Integer> counter) {
        List<Character> keys = new ArrayList<>(counter.keySet());
        Collections.sort(keys);
        StringBuilder result = new StringBuilder();

        for (Character eachKey : keys) {
            result.append(eachKey).append(counter.get(eachKey));
        }
        return result.toString();
    }
}
