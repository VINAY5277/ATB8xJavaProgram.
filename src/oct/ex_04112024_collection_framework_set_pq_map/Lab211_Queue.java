package oct.ex_04112024_collection_framework_set_pq_map;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {
        // q - < 0.01% in automation
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.offer("3");
        pq.offer("4");
        pq.offer("2");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
