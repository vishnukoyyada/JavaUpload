/*
*This file contains the usage of operators.
* '' char
* "" Strings generally storing the character in array.
* + works only for primitivie s.
 */
package Strings;

import java.util.Arrays;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+"b");
        System.out.println("a"+1);
        System.out.println("vishnu" + Arrays.toString(new int[]{1,2,3}));
        String ans = "";
        for(int i =0;i<26;i++){
            char ch = (char)('a'+i);
            ans+=ch;
        }
        System.out.println(ans);
    }

}
