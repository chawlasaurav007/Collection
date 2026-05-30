package LinkedList;

public class CustomLL {
    Node head;
     static class Node{
         Object data;
         Node next;

         Node(Object data){
             this.data = data;
         }
     }

     public void add(Object obj){
         Node n = new Node(obj);
         if(head==null){
             head = n ;
         } else{
             Node temp = head;
             while(temp.next!=null){
                 temp=temp.next;
             }
             temp.next = n ;
         }
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
