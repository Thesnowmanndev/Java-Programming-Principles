/*
 * This program was written by Kyle Martin on 5/25/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show I know how to convert if-else-if statements to switch statements
 * See Chapter 3 Algorithm Workbench Question 10.
 */
import java.util.Scanner;

public class ConvertIfStatement {
    public static void main(String[] args) {
        // Declarations for testing if functional
        int choice;
        Scanner userinput = new Scanner(System.in);

        // If Else-If statements from Ch. 3 Algorithm Workbench pg. 156 Question 10
        System.out.println("/// Entering If-Else Statements ///");
        System.out.println("Type 1, 2, 3, or 4");
        choice = userinput.nextInt();

        if (choice == 1)
        {
            System.out.println("You selected 1.");
        }
        else if (choice == 2 || choice == 3)
        {
            System.out.println("You selected 2 or 3.");
        }
        else if (choice == 4)
        {
            System.out.println("You selected 4.");
        }
        else
        {
            System.out.println("Please select again.");
        }

        // My conversion of the statements above
        System.out.println("/// Entering Switch Statements ///");
        System.out.println("Type 1, 2, 3, or 4");
        choice = userinput.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("You selected 1.");
                break;
            case 2:
            case 3:
                System.out.println("You selected 2 or 3.");
                break;
            case 4:
                System.out.println("You selected 4.");
                break;
            default:
                System.out.println("Please select again.");
        }

        // My conversion of the if statements above to a enhanced switch statement (Extra Credit?)
        System.out.println("/// Entering Enhanced Switch Statements ///");
        System.out.println("Please type 1, 2, 3, or 4");
        choice = userinput.nextInt();

        switch (choice) {
            case 1 -> System.out.println("You selected 1.");
            case 2, 3 -> System.out.println("You selected 2 or 3.");
            case 4 -> System.out.println("You selected 4.");
            default -> System.out.println("Please select again.");
        }
    }
}
