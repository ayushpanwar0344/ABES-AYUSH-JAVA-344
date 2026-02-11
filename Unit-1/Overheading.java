public class Overheading {
    
    //This runs at run time

    void disp(int a , double b) {
        System.out.println(a + b);
    }

    void disp(int a, int b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        Overheading add = new Overheading();
        add.disp(10 , 10);
    }
}
