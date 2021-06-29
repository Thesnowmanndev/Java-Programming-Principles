/*
 * This program was written by Kyle Martin on 5/27/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program calculates the total amount of points a book club member earns this month.
 */
import java.util.Scanner;

public class BookClub {
    public static void main(String[] args) {
        // Scanner
        Scanner userInput = new Scanner(System.in);

        // Declarations
        final int ONE_BOOK = 5, TWO_BOOKS = 15, THREE_BOOKS = 30, FOUR_PLUS_BOOKS = 60;
        int totalBookClubPoints = 0;

        // Questionnaire
        System.out.println( "Welcome to Serendipity Booksellers Book Club! \n" +
                            "Lets calculate your points this month!");
        System.out.println("How many books did you purchase this month? Example: 2 for 2 books.");
        int booksPurchased = userInput.nextInt();
        
        // Calculation
        if (booksPurchased >= 4) {
            totalBookClubPoints = FOUR_PLUS_BOOKS;
        } else if (booksPurchased == 3) {
            totalBookClubPoints = THREE_BOOKS;
        } else if (booksPurchased == 2) {
            totalBookClubPoints = TWO_BOOKS;
        } else if (booksPurchased == 1) {
            totalBookClubPoints = ONE_BOOK;
        }
        
        // Output
        System.out.println("You have earned " + totalBookClubPoints + " points this month!");
    }
}
