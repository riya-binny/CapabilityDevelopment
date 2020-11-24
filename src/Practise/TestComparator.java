package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Riya",23));
        students.add(new Student("Alisha",25));
        students.add(new Student("Alisha",23));
        Collections.sort(students, new NameComparator().thenComparing(new Comparator()));
        students.forEach(student -> System.out.println(student.name + " " + student.marks));
    }
}
