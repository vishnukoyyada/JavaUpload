package BitManipulation;

public class Magicnumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(findnumber(n));
    }

    private static int findnumber(int n) {
        int ans = 0;
        int i =1;
        while(n>0){
            int last = n&1;
            ans = ans + (int)Math.pow(5,i)*last;
            i++;
            n =n>>1;
        }
        return ans;
    }
}
