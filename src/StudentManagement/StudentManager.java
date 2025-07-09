package StudentManagement;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }
    public void removeStudentByRoll(int roll) {
        boolean removed = false;
        for (Student s : studentList) {
            if (s.getRollNumber() == roll) {
                studentList.remove(s);
                removed = true;
                System.out.println("Student with roll number " + roll + " removed.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with roll number " + roll + " not found.");
        }
    }

    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }
}
