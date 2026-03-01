import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComparableClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("b", 2));
        list.add(new Student("d", 4));
        list.add(new Student("a", 1));
        list.add(new Student("c", 3));
        list.sort(null);
        System.out.println(list);
    }
}

class Student implements Comparable<Student>{
    public String name;
    public int Id;

    @Override
    public int compareTo(Student o) {
        return o.getId() - this.getId();
    }

    public Student(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Student s = (Student) obj;
        return Id == s.getId() && Objects.equals(name, s.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id);
    }

    public int getId() {
        return Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", Id=" + Id + "]";
    }

    
}

