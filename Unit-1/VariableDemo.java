public class VariableDemo {
    //instance variable (inside class outside method)

    int rollno = 101;
    char grade = 'A';
    String Name = "cse";

    //static

    static String college_name = "abc";

    void showdetails() {
        //local variable

        int marks = 65;

        System.out.println("Rollno: " + rollno);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + Name);
        System.out.println("College Name: " + college_name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        //TODO Auto-generated method stub

        VariableDemo obj = new VariableDemo();
        obj.showdetails();
        
    }
}
