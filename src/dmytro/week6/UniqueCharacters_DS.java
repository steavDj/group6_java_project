package dmytro.week6;

public class UniqueCharacters_DS {

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";
        System.out.println("AAABBBCCCDEF = " + uniqueChars(str));

        System.out.println("\nuniqueChars:");
        System.out.println("AAaBBcCCF\t\t\t\t= \t" + uniqueChars("AAaBBcCCF"));
        System.out.println("AAABBBCCCDEeFFGgLKk\t\t= \t" + uniqueChars("AAABBBCCCDEeFFGgLKk"));

        System.out.println("\nuniqueCharsIgnoreCase:");
        System.out.println("AAaBcDdEE\t\t\t\t= \t" + uniqueCharsIgnoreCase("AAaBcDdEE"));
        System.out.println("AAABBBCCCDEeFFGgLKkz\t= \t" + uniqueCharsIgnoreCase("AAABBBCCCDEeFFGgLKkz"));

    }

    // This method CASE SENSITIVITY returns unique characters (AAaBBcCCF --> acF)
    public static String uniqueChars(String str) {
        StringBuilder result = new StringBuilder(); // Creating empty StringBuilder object to append all unique characters

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);                // Store our character, which goes throw the loop

            if (str.indexOf(ch) == str.lastIndexOf(ch))
                result.append(ch);                  // Append character to result if it is unique
        }
        return result.toString();                   // using toString() method to return regular String as a result
    }

    // This method CASE INSENSITIVITY and returns unique characters as is (AAaBcDdEE --> Bc)
    public static String uniqueCharsIgnoreCase(String str) {

        StringBuilder result = new StringBuilder(); // Creating empty StringBuilder object to append all unique characters

        for (int i = 0; i < str.length(); i++) {

            char ch = str.toLowerCase().charAt(i);  // Store our character with lower case, which goes throw the loop
            char ch2 = str.charAt(i);               // This char will append to the result if it is unique

            if (str.toLowerCase().indexOf(ch) == str.toLowerCase().lastIndexOf(ch))
                result.append(ch2);
        }
        return result.toString();                   // using toString() method to return regular String as a result
    }


}
