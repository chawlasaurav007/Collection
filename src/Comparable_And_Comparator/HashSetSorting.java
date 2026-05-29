package Comparable_And_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetSorting {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(3, "jassi"));
        set.add(new Employee(1, "saurav"));
        set.add(new Employee(5, "prince"));
        set.add(new Employee(2, "goldy"));
        set.add(new Employee(4, "shanky"));

        System.out.println("Before Sorting:");
        System.out.println(set);

        // HashSet cannot be sorted directly because Collections.sort()
        // works only with List.
        // So first we convert the HashSet into an ArrayList,
        // then we can use Collections.sort().
        List<Employee> list = new ArrayList<>(set);

        Collections.sort(list); // uses compareTo()

        System.out.println("After Sorting By Id:");
        System.out.println(list);

        Collections.sort(list, new SortEmployeeByName());

        System.out.println("After Sorting By Name:");
        System.out.println(list);
    }
}
