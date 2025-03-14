package iryna.week7;
/*
String - Find Unique
Write a return method that can find the unique characters from the String
ex: unique("AAABBBCCCDEF")==> "DEF"";
 */
public class FindUnique_IS {
    public static void main(String[] args) {

        String letters = "AAABBBCCCDEF";
        String letters2 = "AAABBBSGFDSGDGDFFGDCCCDEF";
        System.out.println(returnUnique(letters));
        System.out.println(returnUnique(letters2));

    }
    public static String returnUnique(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (str.indexOf(each) == str.lastIndexOf(each)){
                result += each;
            }
        }
        return result;
    }
}
