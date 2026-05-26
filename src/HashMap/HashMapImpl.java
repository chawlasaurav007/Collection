package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",56);
        m.put("B",57);
        System.out.println(m.size());//2
        System.out.println(m.get("A"));//56
        System.out.println(m);//{A=56, B=57}


        Map<String,Integer> m1 = new HashMap<>();
        m1.put("A",56);
        m1.put("A",57);
        m1.put("A",58);
        System.out.println(m1.size()); // 1 -> because HashMap does not allow duplicate keys. Same key "A" replaces (overrides) the old value.
        System.out.println(m1.get("A"));// 58 -> because the latest value replaces the previous values for key "A".(means it override)
        System.out.println(m1);//{A=58}


        Employee e = new Employee(123);//so here we are giving id as same
        Employee e1 = new Employee(123);
        Employee e2 = new Employee(124);


        System.out.println(e.hashCode());
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        Map<Employee,String> m2 = new HashMap<>();
        m2.put(e,"Saurav");
        m2.put(e1,"Goldy");
        m2.put(e2,"Jassi");

//        We override methods(hascode and equals ) to compare empId because empId is the value that identifies an employee.
//        If two objects have the same empId, HashMap treats them as the same key.
//        So when e1 is inserted, it overrides the value of e because both keys are considered equal.
//        That's why size becomes 1.
        System.out.println(m2.size());//why size 2 is because 1st 2 employee having same empId
        System.out.println(m2);
    }
}
