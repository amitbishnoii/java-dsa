import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Student {
    public String name;
    public int Id;

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
}

public class HashMAP {
    public static void main(String[] args) {
        // HashMap<Integer, String> map = new HashMap<>();
        // map.put(1, "a");
        // map.put(2, "b");
        // map.put(3, "c");
        // System.out.println(map.get(1));
        // System.out.println(map.containsKey(21));

        // Set<Integer> keys = map.keySet();
        // for (Integer integer : keys) {
        // System.out.println(map.get(integer));
        // }

        // Set<Map.Entry<Integer, String>> entries = map.entrySet();
        // for (Map.Entry<Integer,String> entry : entries) {
        // System.out.println(entry.getKey() + " " + entry.getValue());

        /*
         * When we call:
         * 
         * s1.equals(s2);
         * 
         * Inside the equals method:
         * 
         * this → the object that called the method (s1)
         * 
         * obj → the object passed inside equals (s2), but its type is Object
         * 
         * First:
         * 
         * if (this == obj)
         * 
         * Here we are checking if both references point to the same object in memory.
         * Meaning something like:
         * 
         * s1.equals(s1);
         * 
         * If yes → return true immediately.
         * 
         * After that, obj is just an Object type.
         * But we know we are comparing Students.
         * So we cast it:
         * 
         * Student s = (Student) obj;
         * 
         * Now we are basically telling Java:
         * 
         * “This Object is actually a Student, treat it like one.”
         * 
         * After casting, we can access student methods like:
         * 
         * s.getId()
         * s.getName()
         * 
         * Then we compare the actual data:
         * 
         * return Id == s.getId() && Objects.equals(name, s.getName());
         */

        HashMap<Student, String> map = new HashMap<>();

        Student s1 = new Student("amit", 19);
        Student s2 = new Student("shyam", 20);
        Student s3 = new Student("amit", 19);

        map.put(s1, "backend");
        map.put(s2, "UI");
        map.put(s3, "manager");

        System.out.println(map.size());
        System.out.println(map.get(s1));
        System.out.println(map.get(s3));
    }
}
