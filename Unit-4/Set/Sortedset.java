package Set;
import java.util.SortedSet;
import java.util.TreeSet;

import Set.Sortedset;

public class Sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> s = new TreeSet<>();       //SortedSet is an interface that extends Set and maintains the 
                                                        //elements in sorted order
        s.add(40);
        s.add(10);
        s.add(30);
        s.add(20);
        System.out.println("SortedSet: " + s);
        System.out.println("First element: " + s.first());  //.first() method is used to get the first (lowest) element in the
        System.out.println("Last element: " + s.last());    //.last() method is used to get the last (highest) element in the SortedSet
        System.out.println(s.headSet(30));    //.headSet() method is used to get a view of the portion of the SortedSet whose elements are less than the specified element
        System.out.println(s.tailSet(30));    //.tailSet() method is used to get a view of the portion of the SortedSet whose elements are greater than or equal to the specified element
        System.out.println(s.subSet(10, 30));  //.subSet() method is used to get a view of the portion of the SortedSet whose elements are within the specified range
    }
}
