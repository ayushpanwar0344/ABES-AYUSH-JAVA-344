record Student(String name, int age) {}           //record is using immutable data class. Immutable data class is created outside
                                                  //and is accessed using object.

public class RecordExample {
    public static void main(String[] args) {
        Student s = new Student("Vikas", 25);

        System.out.println(s.name());
        System.out.println(s.age());
    }
}
