package Exceptions;

public class Execp {
    public static void main(String[] args) {
        int[] mynum = {1,2,3,4};
        try{
            //System.out.println(mynum[10]);
            int ans = mynum[10];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("out of");
        }finally{
            System.out.println("simply");
        }
    }
}
