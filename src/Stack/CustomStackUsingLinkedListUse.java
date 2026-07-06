package Stack;

public class CustomStackUsingLinkedListUse {
    public static void main(String[] args) throws Exception {
        CustomStackUsingLinkedList c = new CustomStackUsingLinkedList();
        c.push(10);
        c.push(20);
        c.push(30);
        c.push(40);
        c.push(50);
        System.out.println(c);
        System.out.println(c.peek());
        c.pop();
        c.pop();
        System.out.println(c);
        c.push(60);
        System.out.println(c);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c);

    }
}
