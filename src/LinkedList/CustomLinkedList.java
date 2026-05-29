package LinkedList;

public class CustomLinkedList {
    //here we are creating head
    CustomeNode head;//its having value null

    class CustomeNode{
         Object data;//initially value of data will be null
         CustomeNode next;//value will be null initially

        CustomeNode(Object data){
             this.data = data; //here we insert the data
         }
    }

    public void insert(Object obj){
        //so internally Custom linked list will use CustomeNode to store the data
        CustomeNode cl = new CustomeNode(obj);
        if(head==null){
            head = cl ;
        }else{
            CustomeNode n = head;// We store head in n because we want to traverse the linked list.
                                 // If we directly move head using head = head.next,
                                 // we may lose the starting node of the linked list.
                                 // So we use a temporary reference variable n.
                                 // n can move from one node to another while head remains unchanged.
                                 // so by this what we understand is head is still pointing to starting node 10
                                 // Create a temporary pointer for traversal.
                                 // This allows us to move through the list without changing head.
                                 // so in this code the head is still pointing to starting node 10

            while(n.next!=null){
                  n = n.next; // iss line ka matlab hai maine n ke ander ab 20(suppose kro 2nd node hai) ka address store kr diya hai
                              // iska matlb hai 10.next = 20 that or n = n.next matlb  20 = 10.next ab tumhara n 20 hai
            }                 // matlb simple hai 10.next = 20 so 20 = 20
                              // 10.next will give u the addresss of 20 and u are pointing it to 20 so n is 20
                              // 10.next will give the address of 20
                              // We store that address in n
                              // Now n is pointing to 20 node
                              //then we will do while(20.next!=null)

            //when while loop breaks then we are coming to this line and where ever we get null we link with next node
            n.next = cl;//this line means linking up to nodes (10.next = 20)
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        CustomeNode n = head;
        sb.append("[");
        while (n != null) {
            sb.append(n.data);
            if (n.next != null) {
                sb.append(", ");
            }
            n = n.next;
        }
         sb.append("]");
        return sb.toString();
    }


}
