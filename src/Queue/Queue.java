package Queue;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queue {
    public static void main(String[] args) {
        System.out.println("priority queue natural sorting");
        PriorityQueue<Integer> a = new PriorityQueue<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(05);
        a.add(14);
        a.add(03);
        a.add(1);
        a.add(13);
        a.add(12);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println(a);

        System.out.println("priority queue reverse sorting");
        PriorityQueue<Integer> a1 = new PriorityQueue<>(Collections.reverseOrder());
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(05);
        a1.add(14);
        a1.add(03);
        a1.add(1);
        a1.add(13);
        a1.add(12);
        System.out.println(a1);
        System.out.println(a1.poll());
        System.out.println(a1.poll());
        System.out.println(a1.peek());
        System.out.println(a1.peek());
        System.out.println(a1);

        System.out.println("linked blocking queue");
        LinkedBlockingDeque<Integer> l = new LinkedBlockingDeque<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        System.out.println(l);
        System.out.println(l.poll());
        System.out.println(l.poll());
        System.out.println(l.peek());
        System.out.println(l);


        System.out.println("Deque - Array Deque");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(104);
        ad.add(102);
        ad.add(13);
        ad.add(23);
        ad.add(15);
        ad.add(1);
        System.out.println(ad);
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollFirst());

        System.out.println(ad.pollLast());
        System.out.println(ad.pollLast());

        System.out.println(ad.peekFirst());
        System.out.println(ad.peekFirst());

        System.out.println(ad.peekLast());
        System.out.println(ad.peekLast());

        System.out.println(ad);
    }
}
