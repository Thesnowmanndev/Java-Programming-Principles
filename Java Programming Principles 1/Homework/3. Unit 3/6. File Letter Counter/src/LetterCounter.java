/*
 * This program was written by Kyle Martin on 6/06/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was to count how many times a character appears in a given file.
 * See Chapter 4 Programming Challenge 6 File Letter Counter.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) throws FileNotFoundException {


        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // Get the file name.
        System.out.print("Enter the name of a file: ");
        String filename = keyboard.nextLine();

        // Open the file.
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        // Ensure Exists
        if (!file.exists()) {
            System.out.println("The file " + filename + ".txt does not exist.");
            System.exit(0);
        }

        //Enter a Character
        System.out.println("Enter a character to be read.");
        String charInput = keyboard.nextLine();
        char userChar = charInput.charAt(0);

        // Count and display the number of times that char appears in the file
        int count = 0;
        String line;
        while (inputFile.hasNext()) {
            line = inputFile.nextLine();
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == userChar) {
                    count++;
                }
            }
        }

        System.out.println("The number of times " + userChar + " was found in the file was "  + count + " times.");

        // Close the file.
        inputFile.close();
    }
}
