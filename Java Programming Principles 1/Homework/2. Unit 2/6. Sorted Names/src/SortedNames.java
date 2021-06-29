/*
 * This program was written by Kyle Martin on 5/27/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program takes three names that the user inputs and then sorts them in alphabetical order.
 */
import java.util.Scanner;

public class SortedNames {
    public static void main(String[] args) {
        // Scanner
        Scanner userInput = new Scanner(System.in);

        // Initial Declarations
        final int NUMBER_OF_NAMES_INPUTTED = 3;
        String namePlaceHolder;
        String[] names = new String[NUMBER_OF_NAMES_INPUTTED];

        // Questionnaire
        System.out.println("""
                Welcome to the Name Sorter Application!\s
                Please enter up to three names to be sorted\s
                Example: Jim, Bob, Jeff""");

        // Logic for sorting Names
        for (int i = 0; i < NUMBER_OF_NAMES_INPUTTED; i++) {
            names[i] = userInput.nextLine();
        }
        for (int i = 0; i < NUMBER_OF_NAMES_INPUTTED; i++) {
            for (int j = i + 1; j < NUMBER_OF_NAMES_INPUTTED; j++) {
                if (names[i].compareTo(names[j])>0) {
                    namePlaceHolder = names[i];
                    names[i] = names[j];
                    names[j] = namePlaceHolder;
                }
            }
        }

        // Output
        System.out.println("Names are now sorted: ");
        for (int i = 0; i < NUMBER_OF_NAMES_INPUTTED - 1; i++) {
            System.out.print(names[i] + ", ");
        }
        System.out.println(names[NUMBER_OF_NAMES_INPUTTED - 1]);
    }
}
