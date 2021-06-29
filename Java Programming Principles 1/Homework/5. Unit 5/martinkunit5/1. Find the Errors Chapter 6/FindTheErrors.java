/*
 * This program was written by Kyle Martin on 6/18/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix errors in pseudo code
 * See Chapter 6 Find the Error Questions 1 - 5
 */
import java.awt.*;

public class FindTheErrors {
    // Question One:
    public static class MyClass // made static as its a inner class (not really an error if made it a stand alone Java file
    {
        private final int x; // made final
        private final double y; // made final
        public MyClass(int a, double b) // made it a constructor as its method is the same name as its class
        {
            x = a;
            y = b;
        }

        public void testQuestionOne() {
            System.out.println("x = " + x + " y = " + y);
        }
    }

    // Question Two:
    public static int total(int value1, int value2, int value3) // Transformed method into static int, added int to value arguments
    {
        return value1 + value2 + value3;
    }

    // Question Three:
    Rectangle box = new Rectangle(); // Added () to Rectangle Creation

    // Question Four:
    public class TwoValues
    {
        private int x, y;
        public void OneValues() // Changed name of method and assigned it as a void
        {
            x = 0;
        }
        public TwoValues()
        {
            x = 0;
            y = 0;
        }
    }

    // Question Five:
    public class FindTheError
    {
        public int square(int number)
        {
            return number * number;
        }
        public double square(double number) //Changed argument variable from int to double
        {
            return number * number;
        }
    }

    // Main to test questions:
    public static void main(String[] args) {
        // Q1:
        MyClass questionOne = new MyClass(4, 5.0);
        questionOne.testQuestionOne();

        //Q2:
        int value4 = total(2,3,4);
        System.out.println(value4);
    }
}
