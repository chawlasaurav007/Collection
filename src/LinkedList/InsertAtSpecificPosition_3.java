package LinkedList;

public class InsertAtSpecificPosition_3 {
    public static void main(String[] args) {
        CustomLinkedList l = new CustomLinkedList();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.insert(40);
        l.insertAtSpecifiedPosition(25,20);//after 20 node we will add 25 and 25 will be before 30
        System.out.println(l);//[10, 20, 25, 30, 40]

        //suppose there isa linked list like this
        // 10->20->30->20->40
        //now i want to add 25 after 20
        // so how should i know after which 20 i should add
        // so if u want to add after first 20 then traverse from start
        // and if u want to add 2nd 20 then traverse from last

        //or

        // 10 -> 20 -> 30 -> 20 -> 40
        // If duplicate values exist, we must specify
        // whether to insert after the first occurrence,
        // second occurrence, etc.
        // In a singly linked list, we always traverse
        // from the head and count occurrences.


    }
}
