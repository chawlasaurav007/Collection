package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class DepartmentPriorityQueue {
    public static void main(String[] args) {

        System.out.println("sort by dept id ");
        PriorityQueue<Department> depQueue = new PriorityQueue<>();
        depQueue.add(new Department(123));
        depQueue.add(new Department(121));
        depQueue.add(new Department(122));
        depQueue.add(new Department(125));
        System.out.println(depQueue);//so here also it is not garuntee that it will print the data in sorted order but
                                     //but the methods (peek and poll ) will work on  ascending order (sorted order)

        System.out.println("sort by dept name ");
        PriorityQueue<Department> depQueue1 = new PriorityQueue<>(new Comparator<Department>() {
            public int compare(Department o1, Department o2) {
                return o1.getDeptName().compareTo(o2.getDeptName());
            }
        });

        depQueue1.add(new Department(123,"a"));
        depQueue1.add(new Department(121,"A"));
        depQueue1.add(new Department(122,"b"));
        depQueue1.add(new Department(125,"B"));

        System.out.println(depQueue1);//so here it is aslo not garunteed that it will give u code in ascending order by name
                                     //but internally if u use peek and poll method it will work according to
                                     //ascending order
        System.out.println(depQueue1.poll());
    }
}
