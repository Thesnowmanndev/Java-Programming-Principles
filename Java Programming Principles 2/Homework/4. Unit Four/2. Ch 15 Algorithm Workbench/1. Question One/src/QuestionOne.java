/*
 * This program was written by Kyle Martin on 7/31/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to print each character of a string
 * See Chapter 15 Algorithm Workbench  - Question One.
 */
public class QuestionOne {
    public static void displayCharacter(String s) {
        if (s.length() == 0) {
            return;
        } else {
            System.out.println(s.charAt(0));
            displayCharacter(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String string = "Test String!";
        System.out.println("Given String: " + string);
        System.out.println("Printing each character in the string: ");
        displayCharacter(string);
    }
}
