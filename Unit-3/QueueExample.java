import java.util.*;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();       //LinkedList is used to implement the Queue faster
        q.add(10);                                  //.add() method is used to add elements to the Queue
        q.add(20);
        q.add(30);
        System.out.println("Queue: " + q);
        System.out.println("Head of Queue: " + q.peek());  //.peek() method is used to access the head of the Queue without removing it
        System.out.println("Removed element: " + q.poll());  //.poll() method is used to remove and return the head of the Queue
        System.out.println("Queue after removing head: " + q);
        q.offer(40);                                //.offer() method is used to add an element to the Queue, returns false if the Queue is full
        System.out.println("Queue after adding 40: " + q);
        q.remove();                                //.remove() method is used to remove the head of the Queue, throws an exception if the Queue is empty
        System.out.println("Queue after removing head: " + q);
        q.contains(20);                            //.contains() method is used to check if an element is present in the Queue
        System.out.println("Does the Queue contain 20? " + q.contains(20));
        System.out.println("Size of Queue: " + q.size());  //.size() method is used to get the number of elements in the Queue

    }
}
