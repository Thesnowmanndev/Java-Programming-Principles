/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to encrypt a file.
 * See Chapter 11 Program Challenge 7 - File Encryption.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileEncryption {
    public static void main(String[] args) throws IOException {
        // Declarations
        File givenFile = new File("src/InputFile.txt");
        Scanner scanner = new Scanner(givenFile);
        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        // Loop for converting ASCII value to +10 of value
        while (scanner.hasNext()) {
            String textString = scanner.nextLine();

            // Add 10 to the ASCII value of each character
            for (int i = 0; i < textString.length(); i++) {
                char textFileChar = textString.charAt(i);
                char storedChar = (char) ((int) textFileChar + 10);

                outputFile.print(storedChar);
            }
            outputFile.println();
        }

        // Close unneeded resources
        scanner.close();
        outputFile.close();
    }
}
