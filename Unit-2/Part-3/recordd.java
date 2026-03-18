record Student(String name, int age) {}

public class recordd {
    public static void main(String[] args) {
        Student s = new Student("Ayush", 20);
        System.out.println(s.name());
        System.out.println(s.age());
        System.out.println(s);
    }
}