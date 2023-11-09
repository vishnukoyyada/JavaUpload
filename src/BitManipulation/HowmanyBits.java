package BitManipulation;

public class HowmanyBits {
    public static void main(String[] args) {
        int n = 6;
        System.out.println((int)(Math.log(n)/Math.log(2))+1);
        System.out.println(usingtradational(n));
    }

     private static int usingtradational(int n) {
        int count =0;
        while(n>0){
            count++;
            n =n>>1;
        }
        return count;
    }
}
