class Employee {

    private int empId;
    private String empName;
    private double salary;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpName() {
        return empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

public class Employee2{
    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmpId(101);
        e.setEmpName("Rahul");
        e.setSalary(35000);

        System.out.println("Employee ID: " + e.getEmpId());
        System.out.println("Employee Name: " + e.getEmpName());
        System.out.println("Salary: " + e.getSalary());
    }
}