/*

 */

package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n =  4;
        for(int i = 0;i<n;i++){
            for(int spaces =1;spaces <n-i;spaces++ ){
                System.out.print(" ");
            }
            for(int stars =1;stars <=(2*i+1) ;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--){
            for(int spaces =1;spaces <=n-i;spaces++ ){
                System.out.print(" ");
            }
            for(int stars =1;stars <=(2*i-1) ;stars++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
