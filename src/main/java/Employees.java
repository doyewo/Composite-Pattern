import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employees> aide;
    private String dept;
    private String name;
    String int salary;

    public Employees(String name, String dept, int salary) {
        this.salary = salary;
        this.name = name;
        this.dept = dept;
        aide = new ArrayList<Employees>();
    }

    public void remove (Employees e) {
        aide.remove(e);
    }

    public void add (Employees e) {
        aide.add(e);
    }

    public List<Employees> getAide() {
        return ("Employees: (Name: " + name + "Department: " + dept + "Salary: " + salary + ")");
    }
}
