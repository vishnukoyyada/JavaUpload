package Maths;

public class Squareroot {
    public static void main(String[] args) {
        int n = 36;
        int result1 = first(n);
        System.out.println(result1);
        int result2 = second(n,1,n);
        System.out.println(result2);
        double result3 = third(37,3);
        System.out.println(result3);
    }

    private static double third(int n, int p) {
       int low = 0;
       int high = n;
       double root =0.0;
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid ;
            } else if (mid * mid < n) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        double inc = 0.1;
        for(int i =0;i<p;i++){
            while(root*root <=n){
                root+=inc;
            }
            root-= inc;
            inc/=10;
        }

      return root;

    }

    private static int first(int n) {
        return (int)Math.sqrt(n);
    }

  private static int second(int n,int low,int high) {
        if(n ==1){
            return 1;
        }
        while(low<=high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {

                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
       return -1;
    }



}
