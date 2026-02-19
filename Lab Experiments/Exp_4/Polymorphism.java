//Ayush Panwar (2400320100344)
class Shape {
    void area() {
        System.out.println("Area of Shape");
    }
}
class Circle extends Shape {
    void area() {
        double radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle extends Shape {
    void area() {
        int length = 10;
        int width = 5;
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Shape ref;
        ref = new Circle();
        ref.area();
        ref = new Rectangle();
        ref.area();
    }
}
