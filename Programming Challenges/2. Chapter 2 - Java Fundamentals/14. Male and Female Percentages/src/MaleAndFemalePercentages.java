import java.util.Scanner;

public class MaleAndFemalePercentages {
    /*
    Write a program that asks the user for the number of males and the number of females registered in a class. The
    program should display the percentage of males and females in the class.

    Hint: Suppose there are 8 males and 12 females in a class. There are 20 students in the class. The percentage of
    males can be calculated as 8÷20=0.4, or 40%. The percentage of females can be calculated as 12÷20=0.6, or 60%.
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many males are there in the class?");
        int amountOfMales = keyboard.nextInt();

        System.out.println("How many females are there in the class?");
        int amountOfFemales = keyboard.nextInt();

        int totalAmountOfStudents = amountOfMales + amountOfFemales;

        double percentageOfMales = (double) amountOfMales / (double) totalAmountOfStudents;
        double percentageOfFemales = (double) amountOfFemales / (double) totalAmountOfStudents;

        double convertedMalePercentage = percentageOfMales * 100;
        double convertedFemalePercentage = percentageOfFemales * 100;

        System.out.println("\n" + "There are " + amountOfMales + " males in the class.");
        System.out.println("There are " + amountOfFemales + " females in the class.");
        System.out.println("There are " + totalAmountOfStudents + " total students in the class." + "\n");
        System.out.println("The percentage of males in the class is " + (int) convertedMalePercentage + "%");
        System.out.println("The percentage of females in the class is " + (int) convertedFemalePercentage + "%");
    }
}
