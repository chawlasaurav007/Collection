package LinkedList;

public class CustomLinkedList {
    //here we are creating head
    CustomeNode head;//its having value null
    int index = 0 ;

    class CustomeNode{
        //in internal linkedlist u can see we have index also we use like this l.get(3) which means
        // at 3rd node or index what ever data is present give me that
        //so like this we will make our own customelinked list which have index in it

         Object data;//initially value of data will be null
         CustomeNode next;//value will be null initially
         int CustomNodeIndex;
        CustomeNode(Object data,int in){
             this.data = data; //here we insert the data
             this.CustomNodeIndex =  in;
        }
    }

    //at the end it will add ex : 10->20->30
    //now u want to add 40 so it will add at the end
    //10->20->30->40 like this
    public void insert(Object obj){
        //so internally Custom linked list will use CustomeNode to store the data
        CustomeNode cl = new CustomeNode(obj,index);
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
        index++;
    }

    // we need to add before the starting point so suppose there is already linked list
    // present 10->20->30
    // so we need to add at starting
    // 100->10->20->30 like this
    public void insertBeforeHead(Object obj){
        CustomeNode cl = new CustomeNode(obj,index);
        if(head==null){
            head = cl;
        } else {
            CustomeNode temp = head;
            cl.next = temp;
            head = cl;
        }
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if(head==null){
            return sb.toString().concat("]");
        }else{
            CustomeNode n = head;
            while(n.next!=null){
                sb.append(n.data+", ");
                n=n.next;
            }
            sb.append(n.data);
        }
        return sb.toString().concat("]");
    }

    //now suppose at this node we want to retrieve the data so we will create a method for this
    //ex : at two index what is the data we want to retrive
    //10->20->30
    //output is 30

    public Object get(int indexPassed) throws Exception {
        if(indexPassed<0 || indexPassed>=index){
            throw new Exception("index not found");
        }else{
             if (head==null){
                 throw new Exception("Linked List Empty");
             }else {
                 CustomeNode temp =head;
                 while(temp.next!=null){
                     if(temp.CustomNodeIndex==indexPassed){
                          return temp.data;
                     }else{
                         temp= temp.next;
                     }
                 }
                 //this is for last index get(lastIndex)
                 if(temp.CustomNodeIndex==indexPassed){
                     return temp.data;
                 }
             }
        }
        return null;
    }

    //10->20->30->40
    //after 20 i want to add 25
    //output - 10->20->25->30->40
    public void insertAtSpecifiedPosition(Object newData, Object AfterNode) {
        CustomeNode cl  = new CustomeNode(newData,index);
        if(head!=null){
            CustomeNode temp = head;
            while(temp.next!=null){
                if(temp.data.equals(AfterNode)){
                    CustomeNode cn = temp.next;
                    temp.next = cl ;
                    cl.next = cn;
                    break;
                }else{
                    temp= temp.next;
                }
            }
            if(temp.next.equals(AfterNode)){
                temp.next = cl;
            }
        }
    }

    // in this code(remove) we use flag
    // boolean flag = false;
    // We use flag to track whether the node was found and removed.
    // If flag becomes true, it means the node was already deleted
    // (either from the head or middle of the list).
    // If flag remains false after the loop, it means the node was
    // not found in the head or middle, so we check whether the
    // last node contains the value to be removed.
    public void remove(Object obj) {
       if(head!=null){
           CustomeNode temp = head;// temp = 10
           CustomeNode previous=null;
           boolean flag = false;

           //removing the node from starting
           //40->10->20->30  --- remove(40)
           if(head.data.equals(obj)){
               flag = true;
               CustomeNode tempHead = head.next;
               head.next = null ;
               head = tempHead;
               return;
           }

           //removing the node from the middle
           //10->20->30->40->50  --- remove(40)
           while(temp.next!=null){
               if(temp.data.equals(obj)){ // 40.data == 40
                   CustomeNode nextAdd=temp.next;
                   previous.next = nextAdd;
                   temp.next = null;
                   flag = true;
                   break;
               }
               else{
                   previous = temp; // previous = 30
                   temp = temp.next;//temp = 40
               }
           }

           //suppose if we want to remove the last node
           //10->20->30->40  --- remove(40)
           if(flag==false){
               if(temp.data.equals(obj)){
                   previous.next = null;
                   temp = null;
               }
           }
       }
    }
}
