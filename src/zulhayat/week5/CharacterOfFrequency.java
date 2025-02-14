package zulhayat.week5;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOfFrequency {

    public static void main(String[] args) {
        String str = "AAABBCDD";

        String result = charFrequency(str);
        System.out.println(result);
    }


    public static String charFrequency(String str) {
        Map<Character, Integer> counter = new LinkedHashMap<>();


        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);

            if (!counter.containsKey(key)) {
                counter.put(key, 0);
            }
            counter.put(key, counter.get(key) + 1);
        }


        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }
        return result.toString();
    }


}
