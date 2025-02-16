// Lea Trueworthy
// February 14, 2025
// M9 Programming assignment
// Description: Create a program that creates a file called `data.file` if it
// doesn't exist. Write 10 random numbers to the file (or append if it exists),
// separating them by spaces. Close the file, reopen it, and display the
// contents.

import java.io.*;
import java.util.Random;

public class trueworthy_FileExample {
    public static void main(String[] args) {
        File file = new File("data.file");
        Random random = new Random();

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("New file created: data.file");
            }

            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            System.out.println("Now adding 10 random numbers to the file...");
            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                bufferedWriter.write(randomNumber + " ");
            }

            // Close the writer
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            System.out.println("\nReading data from the file:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
