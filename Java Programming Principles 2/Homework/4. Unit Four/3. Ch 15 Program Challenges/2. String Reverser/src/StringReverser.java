/*
 * This program was written by Kyle Martin on 7/31/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to use recursive to print a string in reverse
 * See Chapter 15 Programming Challenges  - Challenge Three.
 */
public class StringReverser {
    public static void main(String[] args) {
        String string =  "This is a string.";
        System.out.println("String in normal sequence: " + string);
        System.out.println("String in reverse sequence: ");
        reverseString(string,(string.length()-1));
    }

    private static void reverseString(String string, int i) {
        if (i >= 0) {
            System.out.print(string.charAt(i));
            reverseString(string, i - 1);
        }
    }
}
