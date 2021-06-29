/*
 * This program was written by Kyle Martin on 6/12/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to calculate the area of a rectangle upon given inputs by the user.
 * See Chapter 5 Programming Exercise 3 Rectangle Area
 */

import java.util.Scanner;

public class AreaRectangle
{
   private static final Scanner keyboard = new Scanner(System.in);

   private static double getLength() {
      System.out.println("Please input the length of the rectangle. Ex 15.4");
      return keyboard.nextDouble();
   }

   private static double getWidth() {
      System.out.println("Please input the width of the rectangle. Ex. 11.7");
      return keyboard.nextDouble();
   }

   private static double getArea(double length, double width) {
      return length * width;
   }

   private static void displayData(double length, double width, double area) {
      System.out.println("The length of the rectangle is: " + length);
      System.out.println("The width of the rectangle is: " + width);
      System.out.println("The area of the rectangle is: " + area);
   }

   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
}

