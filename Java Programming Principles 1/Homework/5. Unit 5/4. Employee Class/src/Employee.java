/*
 * This program was written by Kyle Martin on 6/19/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to build Programming Challenge 1 of Chapter 6
 * See Chapter 6 Programming Challenge 1. Employee Class
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    // Full Constructor
    public Employee(String setName, int setID, String setDepartment, String setPosition) {
        name = setName;
        idNumber = setID;
        department = setDepartment;
        position = setPosition;
    }

    // Partial Constructor
    public Employee(String setName, int setID) {
        name = setName;
        idNumber = setID;
        department = "";
        position = "";
    }

    // No Argument Constructor
    public Employee() {
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }
}
