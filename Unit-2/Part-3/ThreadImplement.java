class MyThread implements Runnable {
    public void run() {
        System.out.println("This is a thread");
    }
}

public class ThreadImplement {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }
}