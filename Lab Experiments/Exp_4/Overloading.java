//Ayush Panwar (2400320100344)
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int sum1 = obj.add(10, 20);
        double sum2 = obj.add(10.5, 20.5);
        int sum3 = obj.add(10, 20, 30);
        System.out.println("Addition of 2 integers: " + sum1);
        System.out.println("Addition of 2 floating numbers: " + sum2);
        System.out.println("Addition of 3 integers: " + sum3);
    }
}
