/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix a error in sudo code
 * See Chapter 11 Find the Error Question 3.
 */
public class ErrorThree { // Created class to store sudo code
    public void fixErrorThree() { // Created method to store sudo code
        CharSequence str = null; // Initialized for line 6
        try
        {
            int number = Integer.parseInt((String) str); // Casted to String
        }
        catch (NumberFormatException e) // Reordered due to ranking of specialized exceptions
        {
            System.out.println(str + " is not a number.");
        }
        catch (IllegalArgumentException e) // Reordered due to ranking of specialized exceptions
        {
            System.out.println("Bad number format.");
        }
        catch (Exception e) // Reordered due to ranking of specialized exceptions
        {
            System.out.println(e.getMessage());
        }
    }
}
