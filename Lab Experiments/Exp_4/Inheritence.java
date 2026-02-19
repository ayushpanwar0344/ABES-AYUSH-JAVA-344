//Ayush Panwar (2400320100344)
class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;
    void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ayush";
        s.age = 20;
        s.rollNo = 344;
        s.course = "B.Tech";
        s.displayPerson();
        s.displayStudent();
    }
}
