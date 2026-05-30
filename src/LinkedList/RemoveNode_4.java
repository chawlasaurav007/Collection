package LinkedList;

public class RemoveNode_4 {
    public static void main(String[] args) {
        CustomLinkedList l = new CustomLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insert(50);
        System.out.println("before removing "+l);
        l.remove(10);
        System.out.println("after removing "+l);

    }
}
