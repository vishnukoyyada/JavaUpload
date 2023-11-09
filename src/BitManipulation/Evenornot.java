package BitManipulation;

public class Evenornot {
    public static boolean evenornot(int num){
        return (num&1)==1;
    }

    public static void main(String[] args){
        System.out.println(evenornot(3));

    }

}
