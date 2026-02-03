public class studentc {

    int id;
    String name;

    //constructor

    studentc(int i, String n) {       //This is default constructor
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] agrs) {
        studentc s1 = new studentc(100 , "vikas");          //Constructor is formed during compile time
        s1.display();
    }
}
