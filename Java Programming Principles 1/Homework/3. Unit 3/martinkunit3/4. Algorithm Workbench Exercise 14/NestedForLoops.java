/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show I know how to use nested loops to print a defined pattern
 * See Chapter 4 Algorithm Workbench Question 14.
 */
public class NestedForLoops {
    public static void main(String[] args) {
        final int NUM_STEPS = 6;

        for (int i = 0; i < NUM_STEPS; i++) {
            System.out.print("#");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }
}
