import java.util.SortedMap;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {

    public String name;
    public int Salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public Employee(String name, int Salary) {
        this.name = name;
        this.Salary = Salary;
    }

    @Override
    public int compareTo(Employee o) {
        return o.getSalary() - this.getSalary();
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", Salary=" + Salary + "]";
    }
}

public class Sortedmap {
    public static void main(String[] args) {
        // SortedMap<Employee, Integer> map = new TreeMap<>();
        SortedMap<String, Integer> map = new TreeMap<>();        

        // map.put(new Employee("c", 50000), 3);
        // map.put(new Employee("d", 11000), 4);
        // map.put(new Employee("a", 10000), 1);
        // map.put(new Employee("e", 15000), 5);
        // map.put(new Employee("b", 12000), 2);

        map.put("shyam", 104);
        map.put("ram", 101);
        map.put("aman", 102);
        map.put("babar azam", 103);

        System.out.println(map);
    }
}
