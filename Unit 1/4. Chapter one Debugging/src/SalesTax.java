/*
 * This program was written by Kyle Martin on 5/20/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program calculates the total price which includes sales tax.
 */



import java.util.Scanner;

public class SalesTax
{
	public static void main(String[] args)
	{
		//identifier declarations
		final double TAX_RATE = 0.055;
		double price;
		double tax;
		double total;
		String item;
		
		//create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner(System.in);

		//display prompts and get input
		System.out.print("Item description:  ");
		item = keyboard.nextLine();
		System.out.print("Item price:  $");
		price = keyboard.nextDouble();
		
		//calculations
		tax = price * TAX_RATE;
		total = price + tax;
		
		//display results
		System.out.print(item + "        $");
		System.out.println(price);
		System.out.print("Tax          $");
		System.out.println(tax);
		System.out.print("Total        $");
		System.out.println(total);
	}
}
