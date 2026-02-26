class MyThread extends Thread {
    public void run() {
        System.out.println("This is a thread");
    }
}
public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread, which will call the run() method
    }
}
