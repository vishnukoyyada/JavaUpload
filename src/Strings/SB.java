/*
It will not create  a new  reference.
space complexity will be reduced.

 */
package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder ans  = new StringBuilder();
        for(int i =0;i<26;i++){
            ans.append((char)('a'+i));
        }
        System.out.println(ans);
    }
}
