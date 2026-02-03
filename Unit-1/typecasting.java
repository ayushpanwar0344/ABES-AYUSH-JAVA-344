public class typecasting {
    public static void main(String[] args) {
        int myint = 15;
        double mydouble = myint; // Automatic casting: int to double

        double g = 90.0;
        int myint1 = (int) g; // Manual casting: double to int

        System.out.println(myint);
        System.out.println(mydouble);
        System.out.println(g);
        System.out.println(myint1);
    }
}
