package Threading.UsingImplenting;

class A implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }
}
class B implements Runnable {
    @Override
    public void run() {
        System.out.println("vishnu");
    }
}

public class Solution {
    public static void main(String[] args) {
        A obja = new A(); // Create an instance of class A
        B objb = new B();
        Thread thread = new Thread(obja);
        Thread thread2 = new Thread(objb);// Create a thread with obja as Runnable
        thread.start(); // Start the thread, which will execute the run() method of obja
        thread2.start();
    }
}
