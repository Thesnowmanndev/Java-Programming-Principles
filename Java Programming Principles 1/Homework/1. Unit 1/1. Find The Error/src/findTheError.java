/*
 * This program was written by Kyle Martin on 5/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This app is written to help its users calculate the area of a room.
 * */

// The error in the book was width x length = area when it needs to be width * length = area. Here is the code:

import java.util.Scanner;

public class findTheError {
    public static void main(String[] args) {
        // Declarations
        float width;
        float length;
        float area;

        // Create a scanner to scan for user input
        Scanner appScanner = new Scanner(System.in);

        // Ask what the rooms width is, store as a variable, convert to a string, display user input to the user
        System.out.println("What is the room's width? Example '25.0'.");
        width = appScanner.nextFloat();
        String w = String.valueOf(width);
        System.out.println("You input " + w);

        // Ask what the rooms length is, store as a variable, convert to a string, display user input to the user
        System.out.println("What is the room's length? Example '22.0'.");
        length = appScanner.nextFloat();
        String l = String.valueOf(length);
        System.out.println("You input " + l);

        // Perform calculation, convert to a string, display calculations value to the user as the rooms area.
        area = width * length;
        String a = String.valueOf(area);
        System.out.println("Your rooms area is " + a);
    }
}
