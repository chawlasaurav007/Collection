package Iterator;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        Iterator<Integer> itr1 = l.iterator();

       // so this will not give concurrent modification exception it is never ending loop
       // will get stack overflow
//        while(itr1.hasNext()){
//            l.add(70);
//        }

        //so what concurrent modification exception says that u need to call some method
        //and perform some structural changes then only it will give u
        //Concurrent modification exception where it will internally check weather
        // the variable modCount and expectedModCound are equal are not if not equal
        // it will throw concurrent modification exception
        // ex :
//        while(itr1.hasNext()){
//            Integer next = itr1.next();
//            System.out.println(next);
//            l.add(70);
//        }


        //so to resolve this concurrent modification exception will use copyOnWriteArraylist
        //like this :
        List<Integer> l1= new CopyOnWriteArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);

        Iterator<Integer> itr2 = l1.iterator();
        while (itr2.hasNext()){
            Integer next = itr2.next();
            l1.add(70);
            System.out.println(next);

        }

        // It prints 70 separately because CopyOnWriteArrayList creates a new copy of list on every modification.
        // Iterator reads the old copied list, while new 70 values are added to the original new list.
        System.out.println("Here it will print 70 six times " + l1);

        System.out.println("Concurrent Modification on set");
//        Set<Integer> s = new HashSet<>();
//        s.add(1);
//        s.add(2);
//        s.add(3);
//        s.add(4);
//        s.add(5);
//        s.add(6);
//
//        Iterator<Integer> iterator = s.iterator();
////        while(iterator.hasNext()){
////            s.add(7);//so this will go infinite loop
////        }
//
//        //this will give concurrent modification exception
//        while(iterator.hasNext()){
//            Integer next = iterator.next();
//            s.add(8);
//        }

//        System.out.println("this will resolve concurrent modification exception in hashset");
//        Set<Integer> s1 = new CopyOnWriteArraySet<>();
//        s1.add(1);
//        s1.add(2);
//        s1.add(3);
//        s1.add(4);
//        s1.add(5);
//        s1.add(6);
//
//        Iterator<Integer> iterator1 = s1.iterator();
//        while (iterator1.hasNext()) {
//            Integer next = iterator1.next();
//            System.out.println(next);
//            s1.add(7);
//        }
//        System.out.println(s1);


        System.out.println("Now we will see concurrent modification exception in hashmap");
//        HashMap<Integer,String> m = new HashMap<>();
//        m.put(1,"saurav");
//        m.put(2,"goldy");
//        m.put(3,"Jassi");
//
//        // Map does not directly support iterator because data is stored in key-value pairs.
//        // So we convert map into entrySet(), then apply iterator on each key-value entry.
//        Iterator<Map.Entry<Integer, String>> iterator = m.entrySet().iterator();
//
//        //so this will give concurrent modification exception
//        while(iterator.hasNext()){
//            Map.Entry<Integer, String> next = iterator.next();
//            System.out.println(next);
//            m.put(4,"shanky");
//        }


        //so to resolve this will use ConcurrentHashMap
        ConcurrentHashMap<Object, Object> o = new ConcurrentHashMap<>();
        o.put(1,"saurav");
        o.put(2,"jassi");
        o.put(3,"goldy");

        Iterator<Map.Entry<Object, Object>> iterator1 = o.entrySet().iterator();

        //so this will give concurrent modification exception
        while(iterator1.hasNext()){
            Map.Entry<Object, Object> next = iterator1.next();
            System.out.println(next);
            o.put(4,"shanky");
        }

        //by using for each loop we can iterate over hashmap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");


        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {//so here also we convert into set
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //by using another way in for each loop we can iterate over hashmap
        HashMap<Integer, String> map1 = new HashMap<>();

        map1.put(1, "A");
        map1.put(2, "B");

        for (Map.Entry<Integer,String> entry : map1.entrySet()) {//so here also we convert into set
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
