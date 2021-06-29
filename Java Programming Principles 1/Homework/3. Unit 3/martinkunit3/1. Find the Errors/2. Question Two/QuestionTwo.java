/*
 * This program was written by Kyle Martin on 6/03/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix the errors in the example code of question 2
 * See Chapter 4 Find the Error Question 2
 */
public class QuestionTwo {
    public static void main(String[] args) {
        int count = 1, total = 0; // initialized total variable
        while (total <= 100) // changed condition statement from count to total
            total += count;
        System.out.print("The sum of the numbers 1 - 100 is ");
        System.out.println(total);
    }
}
