/*
 * This program was written by Kyle Martin on 6/20/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to calculate the area of geometry objects (Circle, Rectangle, Cylinder)
 * See Chapter 8 Programming Challenge 1. Area
 *
 */
import java.util.Scanner;

public class Area {
    private double circleRadius;
    private double area;

    // Circle
    public static double calculateArea(double circleRadius, double pi) {
        double area = pi * (circleRadius * circleRadius);
        return area;
    }

    // Rectangle
    public static int calculateArea(int length, int width) {
        int area = length * width;
        return area;
    }

    // Cylinder
    public static double calculateArea(double pi, double radius, double height) {
        double area = pi * (radius * radius) * height;
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;

        int userChoice;
        System.out.println( "What object would you like to calculate the area of?" +
                            "\n1. Circle" +
                            "\n2. Rectangle" +
                            "\n3. Cylinder" +
                            "\n----------------");
        userChoice = input.nextInt();

        if (userChoice == 1) {
            System.out.println( "\nType in the radius of the circle.");
            double radius = input.nextDouble();
            System.out.println( "\nThe area of your circle is: " + calculateArea(radius, pi));
        } else if (userChoice == 2) {
            System.out.println( "\nType in the length of the rectangle.");
            int length = input.nextInt();
            System.out.println( "\nType in the width of the rectangle.");
            int width = input.nextInt();
            System.out.println("\nThe area of your rectangle is: " + calculateArea(length, width));
        } else if (userChoice == 3) {
            System.out.println( "\nType in the radius of your cylinder.");
            double radius = input.nextDouble();
            System.out.println( "\nType in the height of your cylinder.");
            double height = input.nextDouble();
            System.out.println( "\nThe area of your cylinder is: " + calculateArea(pi, radius, height));
        } else {
            System.out.println( "Please try again and choose a correct option.");
        }
    }
}
