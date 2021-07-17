/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This class file was written to show a method of searching an array for a specified value.
 * See Chapter 11 Algorithm Workbench Question 3.
 */
public class AlgorithmWorkbenchThree {
    public static int numericArraySearch(int[] array, int value) throws Exception {
        int i = 0; // for loop
        int specifiedValue = -1; // variable for the value is found
        boolean found = false; // flag for showing result

        while (!found && i < array.length) { // search array
            if (array[i] == value) {
                found = true;
                specifiedValue = i;
            }
            i++;
        }

        if (specifiedValue == -1)
            throw new Exception("Element not found.");
        else
            return specifiedValue;
    }
}
