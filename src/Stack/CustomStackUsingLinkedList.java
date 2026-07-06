package Stack;

import LinkedList.CustomLinkedList;

public class CustomStackUsingLinkedList {

    Node head = null;
    Node last = null;
    class Node {
       Object data;
       Node next;

       Node(Object obj){
           this.data = obj;
       }
    }

    public Object push(Object obj){
        Node n = new Node(obj);
        if(head==null){
            head = n ;
            last = n ;
        }else {
            last.next = n ;
            last = n ;
        }
        return obj;
    }

    public Object peek() throws Exception {
        //one way is
        //return last.data;
        if(head==null) {
            throw new Exception("Stack is empty");
        }
        return last.data;
    }

    public Object pop() throws Exception {

       //this is my way of implementing the code of pop method
        if (head == null) {
            throw new Exception("Stack is empty");
        }

        // Only one node
        if (head.next == null) {
            Object data = head.data;
            head = null;
            last = null;
            return data;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        Object data = temp.next.data;
        temp.next = null;
        last = temp;

        return data;

        //another way of implementing the pop method code
//        if (head == null) {
//            throw new Exception("Stack is empty");
//        }
//
//        // Only one node
//        if (head == last) {
//            Object obj = head.data;
//            head = null;
//            last = null;
//            return obj;
//        }
//
//        Node temp = head;
//        Node previous = null;
//
//        while (temp.next != null) {
//            previous = temp;
//            temp = temp.next;
//        }
//
//        Object obj = temp.data;
//        previous.next = null;
//        last = previous;
//
//        return obj;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(head==null){
            return sb.toString().concat("]");
        }else{
            CustomStackUsingLinkedList.Node n = head;
            while(n.next!=null){
                sb.append(n.data+", ");
                n=n.next;
            }
            sb.append(n.data);
        }
        return sb.toString().concat("]");
    }
}
