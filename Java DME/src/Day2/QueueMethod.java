package Day2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethod {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);

        System.out.println("Peek : " + queue.peek());

        int removed = queue.poll();
        System.out.println("Removed : " + removed);
        System.out.println(queue);
    }
}
