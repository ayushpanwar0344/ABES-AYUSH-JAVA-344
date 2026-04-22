package Map;
import java.util.*;

public class MapExample {        //we can use HashMap instead of Map also, but is is not safe for thread.
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); //HashMap is a class that implements the Map interface and uses a hash table for storage. It allows null values and keys and does not maintain any order of the elements

        //put() method is used to add key-value pairs to the HashMap

        //get() method is used to retrieve the value associated with a key

        //remove() method is used to remove a key-value pair from the HashMap

        //containsKey() method is used to check if a key exists in the HashMap

        //containsValue() method is used to check if a value exists in the HashMap

        //keySet() method is used to get a set of all the keys in the HashMap

        //values() method is used to get a collection of all the values in the HashMap

        //entrySet() method is used to get a set of all the key-value pairs in the HashMap

        //size() method is used to get the number of key-value pairs in the HashMap

        //clear() method is used to remove all the key-value pairs from the HashMap

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");

        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("b"));
        System.out.println(map.size());

        //entryset()

        for(Map.Entry<Integer, String> e:map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }

    }
}
