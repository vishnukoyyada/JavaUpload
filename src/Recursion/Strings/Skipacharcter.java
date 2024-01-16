package Recursion.Strings;

public class Skipacharcter {
    public static void main(String[] args) {
        String input = "baccad";
        aremoval(input, "", 0);
        aremoval2(input,"");
        System.out.println(aremoval3(input));
    }

    private static String aremoval3(String input) {
        if(input.isEmpty()){
            return "";
        }
        if(input.charAt(0) != 'a'){
            return input.charAt(0)+ aremoval3(input.substring(1));
        }else{
            return aremoval3(input.substring(1));
        }
    }

    private static void aremoval2(String input,String output) {
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }

        char temp = input.charAt(0);
        if(temp != 'a'){
            aremoval2(input.substring(1),output+temp);
        }
        else{
            aremoval2(input.substring(1),output);
        }

    }


    private static void aremoval(String input, String s, int i) {
        if (i == input.length()) {
            System.out.println(s);
            return;
        }

        if (input.charAt(i) != 'a') {
            s += input.charAt(i);
            aremoval(input, s, i + 1);
        } else {
            aremoval(input, s, i + 1);
        }
    }
}
