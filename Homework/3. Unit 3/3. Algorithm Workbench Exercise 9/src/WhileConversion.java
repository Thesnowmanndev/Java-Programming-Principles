/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show I know how to convert a while loop to a for loop
 * See Chapter 4 Algorithm Workbench Question 9.
 */
public class WhileConversion {
    public static void main(String[] args) {
        /*
        * Convert:
        * int count = 0;
        * while (count < 50)
        * {
        *     System.out.println("count is " + count);
        *     count++;
        * }
        * */

        for (int count = 0; count < 50; count++) {
            System.out.println("count is " + count);
        }
    }
}
