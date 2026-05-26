package Set;

public class Employee {
    int empId;

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
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                '}';
    }
}
