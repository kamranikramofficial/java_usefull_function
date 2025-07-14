package ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    char sym;

    Main(char sym) {
        this.sym = sym;
    }

    public Runnable task() {
        return () -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("This is thread " + sym);
            }
        };
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Main task1 = new Main('#');
        Main task2 = new Main('$');
        Main task3 = new Main('^');
        Main task4 = new Main('*');

        executor.submit(task1.task());
        executor.submit(task2.task());
        executor.submit(task3.task());
        executor.submit(task4.task());

        executor.shutdown();
    }
}
