import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    float gpa;

    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }
}

public class ComparatorList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("a", 3.5f));
        students.add(new Student("b", 3.6f));
        students.add(new Student("c", 3.2f));
        students.add(new Student("d", 3.9f));

        students.sort((a, b) -> {
            if (a.getGpa() - b.getGpa() < 0) {
                return 1;
            } else if (a.getGpa() - b.getGpa() > 0) {
                return -1;
            } else {
                return 0;
            }
        });

        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }

        // List<Integer> list = new ArrayList<>();
        // list.add(4);
        // list.add(5);
        // list.add(2);
        // list.add(1);
        // list.add(3);
        // list.sort((a, b) -> b - a);
        // System.out.println(list);
    }
}
