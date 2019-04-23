import java.util.ArrayList;
import java.util.List;

public class Employee {
    private ArrayList<Employee> aide;
    private String dept;
    private String name;
    private int salary;

    public Employee(String name, String dept, int salary) {
        this.salary = salary;
        this.name = name;
        this.dept = dept;
        aide = new ArrayList<Employee>();
    }

    public void remove (Employee e) {
        aide.remove(e);
    }

    public void add (Employee e) {
        aide.add(e);
    }

    public List<Employee> getAide(){
        return aide;
    }

    public String toString() {
        return ("Employee: (Name: " + name + ", Department: " + dept + ", Salary: " + salary + " )");
    }
}
