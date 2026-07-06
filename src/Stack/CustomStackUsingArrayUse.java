package Stack;

public class CustomStackUsingArrayUse {
    public static void main(String[] args) throws Exception {
        CustomStackUsingArray c = new CustomStackUsingArray();
        c.push(10);
        c.push(20);
        c.push(30);
        c.push(40);
        c.push(50);
        System.out.println(c);
        System.out.println(c.peek());
        c.pop();
        c.pop();
        c.push(60);
        System.out.println(c.peek());
        System.out.println(c);
        System.out.println(c.pop());
        System.out.println(c);



    }
}
