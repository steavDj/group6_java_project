package iryna.week8;
/*
String - Reverse String
    Write a return method that can reverse a String
    Ex: Reverse("ABCD") -> DCBA
 */
public class ReverseString_IS {
    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));
        System.out.println(reverseString2("FGJKLL"));
    }

    public static String reverseString(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            result += ch;
        }

        return result;
    }

    public static String reverseString2(String str){
        StringBuilder result = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {
           char ch = str.charAt(i);
           result.append(ch);
        }

        return result.toString();
    }

    public static String reverseString3(String str){
        StringBuilder result = new StringBuilder(str);

        return result.reverse().toString();
    }

}
