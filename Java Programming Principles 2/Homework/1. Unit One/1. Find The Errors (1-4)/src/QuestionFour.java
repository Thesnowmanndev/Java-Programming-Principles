/*
 * This program was written by Kyle Martin on 7/8/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix the errors in question 4
 * See Chapter 10 Find the Error Question 4.
 */

public class QuestionFour {
    // Superclass
    public abstract class Vehicle // Made class abstract
    {
        public abstract double getMilesPerGallon();
    }
    // Subclass
    public class Car extends Vehicle
    {
        private double mpg; // double
        public double getMilesPerGallon() // removed semicolon & turned into double
        {
            return mpg;
        }
    }
}
