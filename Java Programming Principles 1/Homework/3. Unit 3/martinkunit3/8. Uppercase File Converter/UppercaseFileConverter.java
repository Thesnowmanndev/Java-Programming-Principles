/*
 * This program was written by Kyle Martin on 6/06/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to convert lines in a file to uppercase.
 * See Chapter 4 Programming Challenge 15 Uppercase File Converter.
 */
import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter {
    /*
    Write a program that asks the user for the names of two files. The first file should be opened for reading and the
    second file should be opened for writing. The program should read the contents of the first file, change all
    characters to uppercase, and store the results in the second file. The second file will be a copy of the first file,
    except that all the characters will be uppercase. Use Notepad or another text editor to create a simple file that
    can be used to test the program.
    */
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String userFileRead;
        String userFileWritten;

        // Question for Files
        System.out.println("Please enter the name of the file you want to read from. Locate content-read.txt file.");
        userFileRead = keyboard.nextLine();
        File fileRead = new File(userFileRead);
        System.out.println("Please enter the name of the file you want to write to. Locate content-written.txt file.");
        userFileWritten = keyboard.nextLine();
        File fileWritten = new File(userFileWritten);

        // Validate File input
        while (!fileRead.exists()) {
            System.out.println("Please input the proper path to the file. ");
            userFileRead = keyboard.nextLine();
            fileRead = new File(userFileRead);
        }
        while (!fileWritten.exists()) {
            System.out.println("Please input the proper path to the file. ");
            userFileWritten = keyboard.nextLine();
            fileRead = new File(userFileWritten);
        }

        // Convert to UpperCase
        Scanner fileToScan = new Scanner(fileRead);
        PrintWriter fileToWrite = new PrintWriter(fileWritten);

        while (fileToScan.hasNext()) {
            fileToWrite.println(fileToScan.nextLine().toUpperCase());
            System.out.println("Line converted.");
        }

        System.out.println("Conversion Complete.");

        // Close Files
        fileToWrite.close();
        fileToScan.close();
    }
}
