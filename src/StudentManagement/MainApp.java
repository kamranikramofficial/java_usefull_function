package StudentManagement;

public class MainApp {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Adding students
        Student s1 = new Student("Kamran", 101, "A");
        Student s2 = new Student("Ayan", 102, "B");
        Student s3 = new Student("Sarah", 103, "A+");

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        // Remove one student
        manager.removeStudentByRoll(102);

        // Display remaining
        manager.displayAll();
    }
}
