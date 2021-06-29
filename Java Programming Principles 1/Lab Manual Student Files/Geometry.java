import java.util.Scanner;

/**
	This program demonstrates static methods
*/

public class Geometry
{
	public static void main (String [] args)
	{
		int choice;			//the user's choice
		double value = 0;	//the value returned from the method
		char letter;		//the Y or N from the user's decision to exit
		double radius;		//the radius of the circle
		double length;		//the length of the rectangle
		double width;		//the width of the rectangle
		double height;		//the height of the triangle
		double base;		//the base of the triangle
		double side1;		//the first side of the triangle
		double side2;		//the second side of the triangle
		double side3;		//the third side of the triangle
		
		//create a scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);
		
		//do loop was chose to allow the menu to be displayed first
		do
		{
			//call the printMenu method
			
			choice = keyboard.nextInt();
						
			switch (choice)
			{
				case 1:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					//call the circleArea method and store the result in the value variable				
					
					System.out.println("The area of the circle is " + value);
					break;
				case 2:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					//call the rectangleArea method and store the result in the value variable
			
					System.out.println("The area of the rectangle is " + value);
					break;
				case 3: 
					System.out.print("Enter the height of the triangle:  ");
					height = keyboard.nextDouble();
					System.out.print("Enter the base of the triangle:  ");
					base = keyboard.nextDouble();
					//call the triangleArea method and store the result in the value variable
				
					System.out.println("The area of the triangle is " + value);
					break;
				case 4:
					System.out.print("Enter the radius of the circle:  ");
					radius = keyboard.nextDouble();
					//call the circumference method and store the result in the value variable
			
					System.out.println("The circumference of the circle is " + value);
					break;
				case 5:
					System.out.print("Enter the length of the rectangle:  ");
					length = keyboard.nextDouble();
					System.out.print("Enter the width of the rectangle:  ");
					width = keyboard.nextDouble();
					//call the perimeter method and store the result in the value variable
					
					System.out.println("The perimeter of the rectangle is " + value);
					break;
				case 6:
					System.out.print("Enter the length of side 1 of the triangle:  ");
					side1 = keyboard.nextDouble();
					System.out.print("Enter the length of side 2 of the triangle:  ");
					side2 = keyboard.nextDouble();
					System.out.print("Enter the length of side 3 of the triangle:  ");
					side3 = keyboard.nextDouble();
					//call the perimeter method and store the result in the value variable
					
					System.out.println("The perimeter of the triangle is " + value);
					break;
				default:
					System.out.println("You did not enter a valid choice.");
			}	
			keyboard.nextLine(); //consumes the new line character after the number						
			System.out.println("Do you want to exit the program (Y/N)?:  ");
			String answer = keyboard.nextLine();
			letter = answer.charAt(0);
		}while (letter != 'Y' && letter != 'y');
	}
}