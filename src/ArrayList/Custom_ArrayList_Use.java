package ArrayList;

public class Custom_ArrayList_Use {
    public static void main(String[] args) throws Exception {
        Custom_ArrayList c = new Custom_ArrayList(5);

        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add(7);
        c.add(3);
        c.add(14);
        c.add(14);

        System.out.println(c);

        System.out.println(c.get(5));

        System.out.println("size is " + c.size());

        c.remove(2);

        System.out.println(c);

        System.out.println("size is " + c.size());

        System.out.println(c.get(5));

        c.add(10);
        c.add(12);

        System.out.println(c);

        System.out.println("size is " + c.size());
    }
}
