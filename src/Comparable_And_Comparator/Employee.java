package Comparable_And_Comparator;

public class Employee implements Comparable<Employee>{
    int empId;
    String empName;

    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Employee(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public boolean equals(Object o) {
       Employee e = (Employee)o;
       if(e.empId==empId){
           return true;
       }else {
           return false;
       }
    }

    @Override
    public int hashCode() {
        return empId;
    }


    @Override
    public int compareTo(Employee emp) {

        return compare(this,emp);
    }
    public static int compare(Employee x,Employee y){
        return (x.getEmpId() < y.getEmpId()) ? -1 : ((x.getEmpId() == y.getEmpId()) ? 0 : 1);
    }
}
