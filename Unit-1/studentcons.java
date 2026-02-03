public class studentcons { //If we don't write public it will run because defalut is public
    int id;
    String name;

    //constructor

    studentcons() {       //This is default constructor
        id =10;
        name="abc";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] agrs) {
        studentcons s1 = new studentcons();          //Constructor is formed during compile time
        s1.display();
    }
}
