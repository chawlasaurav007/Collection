package Queue;

import Stack.CustomStackUsingLinkedList;

public class QueueImplementationUsingLinkedList {
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

    public Object peek() {
        if(head==null) {
            return null ;
        }
        return head.data;
    }

    public Object poll()  {
      Object obj = peek();
        if (obj == null) {
            return null;
        }
      Node temp = head.next;
      head.next = null;//suppose ll  is  10->20->30->40
                       //so we need to remove link between 10 and 20 so
                       //10.next = null (head.next = null;)
                       //by this link is removed
      head = temp;
      if (head == null) {
            last = null;
      }
      return obj ;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(head==null){
            return sb.toString().concat("]");
        }else{
            Node n = head;
            while(n.next!=null){
                sb.append(n.data+", ");
                n=n.next;
            }
            sb.append(n.data);
        }
        return sb.toString().concat("]");
    }

}
