package Exceptions;

public class UsingThrow {
    public static void main(String[] args) {
        int age =5;
        if(age <10){
            throw new ArithmeticException ("too kid");
        }
    }
}
