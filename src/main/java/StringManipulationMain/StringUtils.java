package StringManipulationMain;

public class StringUtils {

    public static String reverseString(String str){
//        return "";
        if (str == null){

            return null;
        }
        else if (str.isEmpty()){
            throw new NullPointerException("String should not be empty");
        }
        else {
            StringBuilder revStr = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--){
                revStr.append(str.charAt(i));
            }
            return revStr.toString();
        }
    }

    public static String toUpperCase(String str){
//        return "";
        if (str == null){

            return null;
        }
        else if (str.isEmpty()){
            throw new NullPointerException("String should not be empty");
        }
        else {
            return str.toUpperCase();
        }
    }

    public static Boolean isPalindrome(String str) {
//        return "";
        if (str == null){

            return null;
        }
        else if (str.isEmpty()){
            throw new NullPointerException("String should not be empty");
        }
        else {
            String rev = reverseString(str);
            if (str.equalsIgnoreCase(rev)) {
                return true;
            } else{
                return false;
            }
        }
    }

//    public static void main(String[] args) {
//        String rev = reverseString("  Hello  ");
//        System.out.println(rev);
//    }

}
