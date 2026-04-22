public class DependencyIOC {
    // M m;


    int id;
    String name;
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        DependencyIOC d = new DependencyIOC();
        d.id = 1;
        d.name = "abc";
        d.display();
    }
}
