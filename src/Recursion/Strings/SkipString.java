package Recursion.Strings;

public class SkipString {
    public static void main(String[] args) {
         String input = "bdeeapple";
        System.out.println(removeapple(input));

    }

    private static String removeapple(String input) {
        if(input.isEmpty()){
            return "";
        }
        if (input.startsWith("apple")){
             return removeapple(input.substring(5));

        }else{
           return input.charAt(0)+removeapple(input.substring(1));
        }
    }
}
