package lesson_eight;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "Ivanov", "Group1", 4.5);
        Student student2 = new Student("Petr", "Petrov", "Group2", 5.0);
        Aspirant aspirant1 = new Aspirant("Anna", "Sidorova", "Group3", 4.9, "Some Work");
        Aspirant aspirant2 = new Aspirant("Elena", "Smirnova", "Group4", 5.0, "Another Work");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student student : students) {
            System.out.println("Scholarship: " + student.getScholarship());
        }
    }
}

