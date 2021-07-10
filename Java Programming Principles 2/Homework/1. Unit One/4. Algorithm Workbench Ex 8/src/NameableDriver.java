/*
 * This program was written by Kyle Martin on 7/10/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show how to implement a interface.
 * See Chapter 10 Algorithm Workbench Exercise 8.
 */

public class NameableDriver implements Nameable{
    String name;
    @Override
    public void setName(String n) {
        name = n;
    }

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Nameable nameable = new NameableDriver();
        nameable.setName("Kyle");
        System.out.println("Name: " + nameable.getName());
    }
}
