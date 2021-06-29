/*
 * This program was written by Kyle Martin on 5/25/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to match conditional expressions related to if-else statements
 * See Chapter 3 Algorithm Workbench Question 11.
 */

public class MatchConditionalExpression {
    public static void main(String[] args) {
        /*
        * Chapter 3 Algorithm Workbench Question 11
        *
        * 11. Match the conditional expression with the if-else statement that performs the same operation.
        *   a.  q = x < y ? a + b : x * 2;
        *   b.  q = x < y ? x * 2 : a + b;
        *   c.  q = x < y ? 0 : 1;
        *
        *   _____   if (x < y)
        *               q = 0;
        *           else
        *               q = 1;
        *   _____   if ( x < y)
        *               q = a + b;
        *           else
        *               q = x * 2
        *   -----   if (x < y)
        *               q = x * 2;
        *           else
        *               q = a + b;
        * */



        // Test: x = 2 y = 1
        int x = 2;
        int y = 1;
        int a = 2;
        int b = 5;
        int q;

        // Answer to the statement below is option c.
        if (x < y)
            q = 0;
        else
            q = 1;
        System.out.println("Answer to question 1 is: " + q + " Which is answer 'c.'");

        // Conditional expression (c.)
        q = x < y ? 0 : 1;
        System.out.println("Answer to question 1 is: " + q + " Which is answer 'c.'");

        // Answer to the statement below is option a.
        if ( x < y)
            q = a + b;
        else
            q = x * 2;
        System.out.println("Answer to question 2 is: " + q + " Which is answer 'a.'");

        // Conditional expression (a.)
        q = x < y ? a + b : x * 2;
        System.out.println("Answer to question 2 is: " + q + " Which is answer 'a.'");

        // Answer to the statement below is option b.
        if (x < y)
            q = x * 2;
        else
            q = a + b;
        System.out.println("Answer to question 3 is: " + q + " Which is answer 'b.'");

        // Conditional expression (b.)
        q = x < y ? x * 2 : a + b;
        System.out.println("Answer to question 3 is: " + q + " Which is answer 'b.'");
    }
}
