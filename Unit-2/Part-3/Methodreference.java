import java.util.Arrays;
import java.util.List;
public class Methodreference {
    public static void main(String[] args) {
        // Using method reference to print a message
        List<String> names = Arrays.asList("Ayush", "Aryan", "Avi", "Avanya");

        //Lambda expression
        names.forEach(name->System.out.println(name));

        //Method reference

        //system.out.println(names);
        //name(system.out::println);
        //names.forEach(name->System.out.println(name));
        names.forEach(System.out::println);        //classname::methodreference
    }
}
