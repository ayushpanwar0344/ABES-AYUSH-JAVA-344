//Ayush Panwar (2400320100344)
class EvenThread extends Thread {
    public void run() {
        try {
            int i = 0;
            while (true) {
                System.out.println("Even: " + i);
                i += 2;
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        try {
            int i = 1;
            while (true) {
                System.out.println("Odd: " + i);
                i += 2;
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class MultithreadingExample {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }   }