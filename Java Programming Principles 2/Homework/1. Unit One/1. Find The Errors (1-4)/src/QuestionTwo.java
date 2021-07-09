/*
 * This program was written by Kyle Martin on 7/8/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix the errors in question 2
 * See Chapter 10 Find the Error Question 2.
 */

public class QuestionTwo {
    // Superclass
    public class Vehicle
    {
        public double cost; // changed to public as private variables can not be inherited
    }
    // Subclass
    public class Car extends Vehicle
    {
        public Car(double c)
        {
            cost = c;
        }
    }
}
