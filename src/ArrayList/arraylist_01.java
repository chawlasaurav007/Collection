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

    }
}
