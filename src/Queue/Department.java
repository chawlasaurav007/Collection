package Queue;

public class Department implements Comparable<Department>{
    int deptId;
    String DeptName;

    public Department(int deptId) {
        super();
        this.deptId = deptId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return DeptName;
    }

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        DeptName = deptName;
    }

    public void setDeptName(String deptName) {
        DeptName = deptName;
    }

    public int compare(Department o1, Department o2){
        return Integer.compare(o1.getDeptId(), o2.getDeptId());
    }

    @Override
    public int compareTo(Department o) {
        return compare(this,o);
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", DeptName='" + DeptName + '\'' +
                '}';
    }
}
