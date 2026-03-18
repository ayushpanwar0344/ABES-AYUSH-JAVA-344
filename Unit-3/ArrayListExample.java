import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);                                      //.add() method is used to add elements to the ArrayList
        numbers.add(20);
        numbers.add(30);
        System.out.println("ArrayList: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));     //.get() method is used to access the element at a specific index
        numbers.set(1, 100);                     //.set() method is used to update the element at a specific index
        System.out.println("Updated ArrayList: " + numbers);
        numbers.remove(0);                                  //.remove() method is used to remove the element at a specific index
        System.out.println("After removing element at index 0: " + numbers);
        System.out.println("Size of ArrayList: " + numbers.size());       //.size() method is used to get the number of elements in the ArrayList
    }
}
