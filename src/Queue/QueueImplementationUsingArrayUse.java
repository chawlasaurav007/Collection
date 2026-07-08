package Queue;

public class QueueImplementationUsingArrayUse {
    public static void main(String[] args) {
        QueueImplementationUsingArray a = new QueueImplementationUsingArray();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println(a);
        System.out.println(a.poll());
        System.out.println(a.poll());
        System.out.println(a.peek());
        System.out.println(a.peek());
        System.out.println(a);



    }
}
