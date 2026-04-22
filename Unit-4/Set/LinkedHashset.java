package Set;
import java.util.*;

public class LinkedHashset {                //Used to maintain insertion order and duplicates are not allowed
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);

        //toArray() method is used to convert the LinkedHashSet to an array
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));

        //.clone() method is used to create a shallow copy of the LinkedHashSet
        LinkedHashSet<Integer> clonedSet = (LinkedHashSet<Integer>) set.clone();
        System.out.println("Cloned LinkedHashSet: " + clonedSet);

        //.size() method is used to get the number of elements in the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + set.size());

        //.clear() method is used to remove all elements from the LinkedHashSet
        set.clear();
        System.out.println("LinkedHashSet after clearing: " + set);
    }
}
