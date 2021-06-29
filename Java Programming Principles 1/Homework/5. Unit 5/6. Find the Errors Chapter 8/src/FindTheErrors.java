/*
 * This program was written by Kyle Martin on 6/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix errors in pseudo code
 * See Chapter 8 Find the Error Questions 1 - 2
 */

public class FindTheErrors {
    // Question One:
    public class MyClass
    {
        private static int x; // Added static modifier
        private static double y;// Added static modifier

        public static void setValues(int a, double b)
        {
            x = a;
            y = b;
        }
    }

    // Question Two:
    public class Enumerator {
        enum Coffee { MEDIUM, DARK, DECAF }

    }

    // Main to Test:
    public static void main(String[] args) {
        Enumerator.Coffee myCup = Enumerator.Coffee.DARK;

        switch (myCup) {
            case MEDIUM :
                System.out.println("Mild flavor.");
                break;
            case DARK :
                System.out.println("Strong flavor.");
                break;
            case DECAF :
                System.out.println("Won't keep you awake.");
                break;
            default:
                System.out.println("Never heard of it.");
        }
    }
}
