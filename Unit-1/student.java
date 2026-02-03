public class student {
    int id;
    String name;
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] agrs) {
        student s1 = new student();          //Constructor is formed during compile time
        s1.display();
    }
}
