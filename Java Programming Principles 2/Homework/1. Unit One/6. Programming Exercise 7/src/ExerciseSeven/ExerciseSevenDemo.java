/*
 * This program was written by Kyle Martin on 7/10/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to print customer data.
 * See Chapter 10 Programming Exercise 7.
 */

package ExerciseSeven;

public class ExerciseSevenDemo {
    public static void main(String[] args) {
        Customer currentCustomer = new Customer("Karen", "123 Lane St. City, ST 12345",
                "12345678910", 1, true);

        String desiredMailingList;
        if (currentCustomer.getMailingList()) {
            desiredMailingList = "Yes";
        } else {
            desiredMailingList = "No";
        }

        System.out.println("Current Customer Data:");
        System.out.println("Customer Name: \t" + currentCustomer.getName());
        System.out.println("Customer Address: \t" + currentCustomer.getAddress());
        System.out.println("Customer Phone Number: \t" + currentCustomer.getPhoneNumber());
        System.out.println("Customer Number: \t" + currentCustomer.getCustomerNumber());
        System.out.println("Wants to be on mailing list: \t" + desiredMailingList);
    }
}
