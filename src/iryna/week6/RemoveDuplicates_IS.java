package iryna.week6;

public class RemoveDuplicates_IS {
    public static void main(String[] args) {
        System.out.println(removeDuplicatesMethod("ADDDBBBAAACCC"));

    }

    public static String removeDuplicatesMethod(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(String.valueOf(each))){
                //if (!result.contains("" + each)){ - other way to do it
                result += each;
            }
        }

        return result;
    }
}
