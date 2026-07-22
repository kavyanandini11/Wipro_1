import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentStreamDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ravi", 82));
        students.add(new Student(2, "Meena", 91));
        students.add(new Student(3, "Suresh", 68));
        students.add(new Student(4, "Latha", 74));
        students.add(new Student(5, "Kiran", 88));

        System.out.println("Students who passed (mark >= 75):");
        students.stream()
                .filter(s -> s.getMark() >= 75)
                .forEach(s -> System.out.println("  " + s));

        Student topper = students.stream()
                .max(Comparator.comparingInt(Student::getMark))
                .orElse(null);
        System.out.println("Topper: " + topper);

        double average = students.stream()
                .mapToInt(Student::getMark)
                .average()
                .orElse(0);
        System.out.println("Average mark: " + average);
    }
}
