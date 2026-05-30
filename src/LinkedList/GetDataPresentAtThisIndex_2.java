package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class GetDataPresentAtThisIndex_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("we use get method to fetch the data this is for inbuilt in linkedlist class");
        List<Integer> l = new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        System.out.println(l.get(1));//20

        System.out.println("we will call through our own custome linked list get method");
        CustomLinkedList c = new CustomLinkedList();
        c.insert(1);
        c.insert(12);
        c.insert(24);
        c.insert(27);
        System.out.println(c.get(1));//12
        // System.out.println(c.get(11));//index not found
        // System.out.println(c.get(-1));//index not found
    }
}
