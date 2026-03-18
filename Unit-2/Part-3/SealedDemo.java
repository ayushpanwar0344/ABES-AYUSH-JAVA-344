
sealed class Shape permits Circle, Rectangle {}

final class Circle extends Shape {}
final class Rectangle extends Shape {}

public class SealedDemo {
    public static void main(String[] args) {
        Shape s = new Circle();

        System.out.println("sealed class demo running");
    }
}
