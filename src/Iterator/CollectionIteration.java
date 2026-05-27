package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CollectionIteration {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        //this is iterator
        Iterator<Integer> itr = l.iterator();
        System.out.println("Iterator");
        while(itr.hasNext()){
            Integer next = itr.next();
            System.out.println(next);
        }

        //this is list iterator
       // System.out.println("List Iterator");
        ListIterator<Integer> itr1 = l.listIterator();
        int i = 0 ;
        while (itr1.hasNext()){
            i++;
            Integer next = itr1.next();
            if(i==2){
                if(itr1.hasPrevious()){
                    Integer previous = itr1.previous();
                    System.out.println(previous);
                }
            }
            System.out.println(next);
        }
    }
}
