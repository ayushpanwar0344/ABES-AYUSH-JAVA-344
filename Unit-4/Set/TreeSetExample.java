package Set;
import java.util.*;     

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();       //TreeSet is a class that implements the Set interface and uses a tree for storage. It maintains the elements in sorted order

        //add() method is used to add elements to the TreeSet
        s.add(50);
        s.add(20);
        s.add(40);
        s.add(10);
        System.out.println("TreeSet: " + s);

        //remove() method is used to remove an element from the TreeSet
        s.remove(20);
        System.out.println("TreeSet after removing 20: " + s);
        s.add(20);
        System.out.println("TreeSet after adding 20 again: " + s);

        //first() method is used to get the first (lowest) element in the TreeSet
        System.out.println("First element: " + s.first());

        //last() method is used to get the last (highest) element in the TreeSet
        System.out.println("Last element: " + s.last());

        //higher() method is used to get the least element in the TreeSet that is greater than the given element
        System.out.println("Higher element than 40: " + s.higher(40));


        //lower() method is used to get the greatest element in the TreeSet that is less than the given element
        System.out.println("Lower element than 40: " + s.lower(40));

        //pollFirst() method is used to retrieve and remove the first (lowest) element of the TreeSet
        System.out.println("Poll First: " + s.pollFirst());

        //pollLast() method is used to retrieve and remove the last (highest) element of the TreeSet
        System.out.println("Poll Last: " + s.pollLast());
        System.out.println("TreeSet after polling first and last: " + s);
    }
}
