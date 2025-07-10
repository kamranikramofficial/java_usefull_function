package TaskQueueSystem;

import java.util.List;
import java.util.LinkedList;

public class TaskQueueManager {

    private List<task> cheak= new LinkedList<>();

    public void addchek (task t){
         cheak.add(t);
    }
    public void removeProductid(int id) {
        boolean removed = false;
        for (task t : cheak) {
            if (t.id == id) {
                cheak.remove(t);
                removed = true;
                System.out.println("Student with Product id " + id + " removed.");
                break;
            }
        }
        if (!removed) {
            System.out.println("Student with product id  " + id + " not found.");
        }
    }
    public void displayAll() {
        if (cheak.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            for (task t : cheak) {
                System.out.println(t);
            }
        }
    }


    public static void main(String[] args) {
        TaskQueueManager manager = new TaskQueueManager();

        // Adding students
        task s1 = new task(1, "This is a product 1");
        task s3 = new task(3, "This is product 3");
        task s2 = new task(2, "this is product 2");

        manager.addchek(s1);
        manager.addchek(s2);
        manager.addchek(s3);

        // Remove one student
        manager.removeProductid(6);

        // Display remaining
        manager.displayAll();
    }
}
