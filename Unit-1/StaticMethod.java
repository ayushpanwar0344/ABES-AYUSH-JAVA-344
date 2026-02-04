public class StaticMethod {
    
    static void display(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        StaticMethod.display();          //We can write display(); also instead of StaticMethod.display();
    }
}
