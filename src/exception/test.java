package exception;

import java.io.*;

public class test{
    public static void main(String[] args) throws IOException {
        // Writing with BufferedWriter
        BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
        writer.write("Hello, Java !");
        writer.close();

        // Reading with BufferedReader
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line = reader.readLine();
        System.out.println(line); // Output: Hello, Java!
        reader.close();
    }
}


