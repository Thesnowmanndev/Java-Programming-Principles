/*
 * This program was written by Kyle Martin on 6/13/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix errors in pseudo code
 * See Chapter 7 Find the Error Questions 1 - 5
 */
public class FindTheErrors {
    // Question One:
    int [] collection = new int[20]; // Removed negative sign as the size of the array cannot be negative

    // Question Two:
    int [] hours = { 8, 12, 16 }; // Corrected the Syntax by adding {}s

    // Question Three:
    public static void testMethodOne() {
        int[] table = new int[10];

        for (int x = 0; x <= 9; x++) // Changed to match array size
        {
            table[x] = 99;
        }
    }

    // Question Four:
    public static void testMethodTwo() {
        String[] names = { "George", "Susan" };

        int totalLength = 0;
        for (int i = 0; i < names.length; i++) // Removed ()s from .length()
            totalLength += names[i].length(); // Added ()s to .length
    }

    // Question Five:
    public static void testMethodThree() {
        String[] words = { "Hello", "Goodbye" };

        String wordOne = words[0], wordTwo = words[1];
        System.out.println(wordOne.toUpperCase());
        System.out.println(wordTwo.toUpperCase());
        // Added subscript to fix the incorrect syntax of System.out.println(words.toUpperCase());
    }

    public static void main(String[] args) {
        testMethodThree();
    }
}
