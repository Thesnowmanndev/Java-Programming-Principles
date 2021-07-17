/*
 * This program was written by Kyle Martin on 7/17/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to answer the question "what will this sudo code output when ran?"
 * See Chapter 11 Algorithm Workbench Question 1.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int number;
        String str;

        try
        {
            str = "xyz";
            number = Integer.parseInt(str);
            System.out.println("A");
        }
        catch(NumberFormatException e)
        {
            System.out.println("B");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("C");
        }
        System.out.println("D");
    }
    /*
    * The program will output:
    * B
    * D
    * */
}
