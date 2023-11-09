package BitManipulation;

public class powerof2 {
    public static void main(String[] args) {
     int n =8;
     firstmethod(n);
     secondmethod(n);
    }

    private static void secondmethod(int n) {

        //0 is an exceptional
        if((n&n-1) != 0){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }

    }

    private static void firstmethod(int n) {
        int c = 0;
        while (n > 0) {
            if(((n&1)==1)) c++;
            n=n>>1;
        }
        if(c>1){
            System.out.println("no");
        }else{
            System.out.println("yes");
        }
    }

}
