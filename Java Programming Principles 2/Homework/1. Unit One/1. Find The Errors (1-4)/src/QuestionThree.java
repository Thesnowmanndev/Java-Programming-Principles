/*
 * This program was written by Kyle Martin on 7/8/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix the errors in question 3
 * See Chapter 10 Find the Error Question 3.
 */

public class QuestionThree {
    /* Question 3 */
    // Superclass
    public class Vehicle
    {
        private double cost;
        public Vehicle(double c)
        {
            cost = c;
        }

        public Vehicle() {
            // added constructor to fix errors on line 20
        }
    }
    // Subclass
    public class Car extends Vehicle
    {
        private int passengers;
        public Car(int p) // added Vehicle constructor above
        {
            passengers = p; // changed c to p
        }
    }
}
