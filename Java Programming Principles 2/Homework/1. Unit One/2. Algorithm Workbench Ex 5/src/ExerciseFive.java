/*
 * This program was written by Kyle Martin on 7/10/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show how to pass a value from a subclass to a superclass.
 * See Chapter 10 Algorithm Workbench Exercise 5.
 */

public class ExerciseFive {
    public class SuperClass {
        private int value;

        public void setValue(int v)
        {
            value = v;
        }
    }

    public class SubClass extends SuperClass {
        public void myValue() {
            super.setValue(10);
        }
    }
}
