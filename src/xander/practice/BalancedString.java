package xander.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {

        System.out.println(isBalanced("[{()}]"));        // true
        System.out.println(isBalanced("[({(})]"));       // false
        System.out.println(isBalanced("{[}"));           // false
        System.out.println(isBalanced("({}{}([{}]))"));  // true
        System.out.println(isBalanced("({"));            // false

        System.out.println("-----");

        System.out.println(isBalancedHashMap("[{()}]"));        // true
        System.out.println(isBalancedHashMap("[({(})]"));       // false
        System.out.println(isBalancedHashMap("{[}"));           // false
        System.out.println(isBalancedHashMap("({}{}([{}]))"));  // true
        System.out.println(isBalancedHashMap("({"));            // false

    }

    public static boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening Pairs
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            // Closing Pairs
            if (ch == '}' && ( stack.isEmpty() || stack.pop() != '{' )) {
                return false;
            } else if (ch == ']' && ( stack.isEmpty() || stack.pop() != '[' )) {
                return false;
            } else if (ch == ')' && ( stack.isEmpty() || stack.pop() != '(' )) {
                return false;
            }

        }

        return stack.isEmpty();

    }

    public static boolean isBalancedHashMap(String str) {

        Map<Character, Character> pairs = new HashMap<>();
        pairs.put('{', '}');
        pairs.put('[', ']');
        pairs.put('(', ')');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Opening Pairs
            if (pairs.containsKey(ch)) {
                stack.push(ch);
            }

            // Closing Pairs
            if (pairs.containsValue(ch) && ( stack.isEmpty() || (pairs.get(stack.pop()) != ch) )) {
                return false;
            }

        }
        
        return stack.isEmpty();

    }

}
