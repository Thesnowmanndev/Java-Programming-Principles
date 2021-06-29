/*
 * This program was written by Kyle Martin on 6/06/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to help the user establish a budget
 * See Chapter 4 Programming Challenge 16 Budget Analysis.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class BudgetAnalysis {
    /*
    Write a program that asks the user to enter the amount that he or she has budgeted for a month. A loop should then
    prompt the user to enter each of his or her expenses for the month, and keep a running total. When the loop
    finishes, the program should display the amount that the user is over or under budget.
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("#,###.##");
        char moreExpenses = 'y';
        double userExpense;
        double totalExpenses = 0;

        // Question Initial budget
        System.out.println("Please enter the amount of $ you have budgeted for the month:");
        double userBudget = keyboard.nextDouble();
        System.out.println("Your budget is: $" + format.format(userBudget));

        // Asks for Expenses
        while (moreExpenses == 'y') {
            System.out.println("Enter an expense:");
            userExpense = keyboard.nextDouble();
            totalExpenses = totalExpenses + userExpense;
            System.out.println("Do you have more expenses? Enter y for Yes and n for No.");
            keyboard.nextLine();
            moreExpenses = keyboard.nextLine().charAt(0);
        }

        // Output
        if (totalExpenses < userBudget) {
            System.out.println("You were under budget by $" + format.format(userBudget - totalExpenses));
        } else if (totalExpenses > userBudget) {
            System.out.println("You were over budget by $" + format.format(totalExpenses - userBudget));
        } else  {
            System.out.println("You used exactly your budget.");
        }
    }
}
