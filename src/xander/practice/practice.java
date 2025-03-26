package xander.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class practice {
    public static void main(String[] args) {



    }

    public static void freq(String str) {

        HashMap<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

    }

}
