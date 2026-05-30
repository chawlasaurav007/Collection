package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddElementBeforeHead_1 {
    public static void main(String[] args) {
        System.out.println("in Arraylist we do like this ");
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(0,100);
        System.out.println(l);

        System.out.println("this we are using by inbuilt linked list class");
        List<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(0,100);
        System.out.println(l2);


        System.out.println("Now we are using by our custom linked list class");
        CustomLinkedList l3 = new CustomLinkedList();
        l3.insertBeforeHead(2000);
        l3.insert(200);
        l3.insert(201);
        l3.insert(202);
        l3.insert(203);
        l3.insertBeforeHead(1000);
        System.out.println(l3);


    }
}
