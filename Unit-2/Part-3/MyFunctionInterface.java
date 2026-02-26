@FunctionalInterface
interface My_Function_Interface {
    void sayhello();     //abstract method
}
public class MyFunctionInterface {
    public static void main(String[] args) {
        My_Function_Interface obj = () -> {
            System.out.println("Hello World");
        };
        obj.sayhello();
    }
}
