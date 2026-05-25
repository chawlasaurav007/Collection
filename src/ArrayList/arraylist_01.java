package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class arraylist_01 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
//      In Java, when you print an array using System.out.println(arr), Java prints the memory reference like
//      [I@27716f4 because arrays do not override the toString() method, so the default Object.toString() is used
        System.out.println(arr);

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

//      But ArrayList overrides the toString() method, which loops through the elements and returns them in a readable
//      format like [1, 2, 3, 4, 5]. That is why arrays show an address while ArrayList prints the actual values.
        System.out.println(l);


        //To make the list heterogeneous (store different types) in Java, use Object as the type.
        List<Object> l1 = new ArrayList<>();
        l1.add(1);
        l1.add("saurav");
        l1.add(3.2);
        l1.add('a');
        l1.add(5);
        System.out.println(l1);

        //Suppose iam using ArrayList like this just to print the data
        List<Integer> l2 = new ArrayList<>();
        l2.add(11);
        l2.add(22);
        l2.add(12);
        l2.add(21);

        //so it is just printing the data because here toString() method is already been overridden
        //in arraylist class because we use to create a list using arraylist
        System.out.println("l2 "+l2);


        //now suppose i use custom arraylist and then print data it will give me the reference value
        Custom_ArrayList c1 = new Custom_ArrayList(5);
        c1.add(10);
        c1.add(11);
        c1.add(12);
        c1.add(13);
        c1.add(14);

        //so here we have not overridden toString method in Custom_ArrayList class so that is why its giving the output
        // as reference address
        System.out.println(c1);//Output : ArrayList.Custom_ArrayList@2a84aee7

    }
}
