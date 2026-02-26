public class WithoutJoin {
     public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("Child Thread Executing");
        });
        t.start();         //Start new thread
        System.out.println("Main Thread Executing");
    }
}
