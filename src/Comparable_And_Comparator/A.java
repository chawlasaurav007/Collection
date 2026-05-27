package Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        System.out.println("sort the list of numbers ");
        List<Integer> l  = new ArrayList<>();
        l.add(3);
        l.add(6);
        l.add(2);
        l.add(1);
        l.add(9);
        Collections.sort(l);
        System.out.println(l);

        System.out.println("sort the employee based on id");

        Employee e = new Employee(1,"saurav");
        Employee e1 = new Employee(2,"goldy");
        Employee e2 = new Employee(3,"jassi");
        Employee e3 = new Employee(4,"shanky");
        Employee e4 = new Employee(5,"prince");

        List<Employee> l1 = new ArrayList<>();
        l1.add(e2);
        l1.add(e);
        l1.add(e1);
        l1.add(e3);
        l1.add(e4);
        System.out.println("Before Sorting");
        System.out.println(l1);//so it will follow the insertion order
        //now we need to sort

        // Collections.sort(l1) will give compilation error because Java does not know
        // on what basis Employee objects should be sorted.
        //
        // For Integer, String etc., sorting works internally because these classes
        // already implement Comparable interface.
        //
        // But for custom classes like Employee or Department,
        // we need to implement Comparable or provide Comparator logic.

        Collections.sort(l1);
        System.out.println("After sorting");
        System.out.println(l1);







    }
}
