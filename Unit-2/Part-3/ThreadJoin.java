public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Child Thread Executing");
        });
        t.start();         //Start new thread
        t.join();          //Wait for child thread to complete
        System.out.println("Main Thread Executing");
    }
}
