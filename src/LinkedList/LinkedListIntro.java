package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIntro {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(2);
        l.add(1);
        l.add(43);
        l.add(25);
        l.add(28);
        System.out.println(l);
        System.out.println(l.get(4));

        System.out.println("now we will use custom linked list");

        //through customLinkedList we will create a list
        CustomLinkedList c1 = new CustomLinkedList();
        c1.insert(10);
        c1.insert(20);
        c1.insert(15);
        c1.insert(20);
        System.out.println(c1);//LinkedList.CustomLinkedList@4a574795 but we want actual data


    }
}
