/*
 * This program was written by Kyle Martin on 6/13/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix errors in pseudo code
 * See Chapter 5 Find the Error Questions 1 - 4
 */
public class FindTheErrors {
    // Question 1:
    public static void sayHello() // Removed semi-colon
    {
        System.out.println("Hello");
    }

    // Question 2:
    public static void showValue(int x) {
        System.out.println(x);
    }
    public static void callShowValueTest() {
        int x = 8;
        showValue(x);   // Removed data type as it cant be passed as a argument when calling a method
    }

    // Question 3:
    public static double timesTwo(double num)
    {
        double result = num * 2;
        return result; // Added return statement as this method is not a void
    }

    // Question 4:
    public static double half(double num) // Changed method data type from int to double as it returns a double
    {
        double result = num / 2.0;
        return result;
    }

    public static void main(String[] args) {
        sayHello();
        callShowValueTest();
        double numberTimesTwo = timesTwo(2.0);
        System.out.println(numberTimesTwo);
        double halfedNumber = half(4);
        System.out.println(halfedNumber);
    }
}
