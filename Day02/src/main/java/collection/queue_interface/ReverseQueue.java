package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return; // Base case: if queue is empty, return
        }

        // Step 1: Remove the front element
        int front = queue.remove();

        // Step 2: Recursively call the function for the remaining queue
        reverseQueue(queue);

        // Step 3: Add the removed element back at the end
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
