package Maths;

public class PrimeorNot {
    public static void main(String[] args) {
        int n = 36;
        for(int i =2;i<=Math.sqrt(n);i++){
            if(i%n ==0){
                System.out.println(false);
            }
        }
        System.out.println("no");
    }
}
