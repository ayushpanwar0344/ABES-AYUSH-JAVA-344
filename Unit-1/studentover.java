public class studentover {
    int id;
    String name;

    //constructor overloading

     studentover() {       //This is default constructor
        id =10;
        name="abc";
    }

    studentover(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] agrs) {
        studentover s1 = new studentover(100 , "vikas");          //Constructor is formed during compile time
        s1.display();
        s1.display();
        studentover s2 = new studentover();       //This will give the default values as we are not passing any parameters
        s2.display();
    }
}