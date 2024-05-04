package Threading.UsingExtending;



class A extends Thread{
    public void run(){
        for(int i =0;i<=100;i++){
        System.out.println("hello world");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i =0;i<=100;i++) {
            System.out.println("vishnu");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Solution {
    public static void main(String[] args) {
        A obja = new A();
        B objb = new B();
        obja.start();
        objb.start();
    }

}
