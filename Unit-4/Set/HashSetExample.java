package Set;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();       //HashSet is used to store unique elements, it does not maintain any order
        set.add(10);                                  //.add() method is used to add elements to the HashSet
        set.add(20);
        set.add(30);
        set.add(10);                                  //Duplicate elements are not added to the HashSet
        System.out.println("HashSet: " + set);
        set.remove(20);                               //.remove() method is used to remove an element from the HashSet
        System.out.println("HashSet after removing 20: " + set);
        System.out.println("Does the HashSet contain 30? " + set.contains(30));  //.contains() method is used to check if an element is present in the HashSet
        Iterator<Integer> it = set.iterator();                          //.iterator() method is used to get an iterator for the HashSet
        System.out.println("Size of HashSet: " + set.size());  //.size() method is used to get the number of elements in the HashSet
    }
}
