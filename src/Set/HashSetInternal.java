package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetInternal {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        s.add("F");
        s.add("A");

        System.out.println(s);
        //for the above code add methods check duplicate values butand handle by own
        //but when u are using generic classes like employee , department ...etc then u need
        //check duplicate by your own


        Employee e = new Employee(123);
        Employee e1 = new Employee(123);
        Employee e2 = new Employee(124);

        Employee[] employees = new Employee[3];
        employees[0] = e ;
        employees[1] = e1 ;
        employees[2] = e2 ;

        Set<Employee> emp = new HashSet<>();


        for (int i = 0 ; i< employees.length;i++){
//      one way to check duplicate
//            if(emp.contains(employees[i])){
//                System.out.println("ID found duplicate");
//            }else{
//                emp.add(employees[i]);
//            }

//      another way to check duplicate
            if(emp.add(employees[i])){

            }else{
                System.out.println("Id found duplicate");
            }
        }



    }
}
