package filereader;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class filereader {

    Scanner input = new Scanner(System.in);

    public void start() {
        System.out.println("Enter the file name to read:");
        String filename = input.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("\nFile Contents:\n------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        filereader app = new filereader();
        app.start();
    }
}


