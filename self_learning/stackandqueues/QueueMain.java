package stackandqueues;

import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(23);
        queue.insert(34);
        queue.insert(45);
        queue.insert(76);
        queue.insert(87);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
