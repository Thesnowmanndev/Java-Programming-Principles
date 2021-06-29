import java.text.DecimalFormat;	//for number formatting
import java.util.Scanner;		//for keyboard input
//ADD AN IMPORT STATEMENT HERE  //for using files

public class StatsDemo
{
	public static void main(String [] args)//ADD A THROWS CLAUSE HERE
	{
		double sum = 0;		//the sum of the numbers
		int count = 0;		//the number of numbers added
		double mean = 0;  	//the average of the numbers
		double stdDev = 0;	//the standard deviation of the numbers
		String line;		//a line from the file
		double difference;	//difference between the value and the mean

		//create an object of type Decimal Format
		DecimalFormat threeDecimals = new DecimalFormat("0.000");
		//create an object of type Scanner
		Scanner keyboard = new Scanner (System.in);
		String filename;	// the user input file name

		//Prompt the user and read in the file name
		System.out.println("This program calculates statistics"
			+ "on a file containing a series of numbers");
		System.out.print("Enter the file name:  ");
		filename = keyboard.nextLine();

		//ADD LINES FOR TASK #4 HERE
		//Create a FileReader object passing it the filename
		//Create a BufferedReader object passing it the FileReader object.
		//priming read to read the first line of the file
		//create a loop that continues until you are at the end of the file
			//convert the line into a double value and add the value to the sum
			//increment the counter
			//read a new line from the file
		//close the input file
		//store the calculated mean

		//ADD LINES FOR TASK #5 HERE
		//reconnect to the FileReader object passing it the filename
		//reconnect to the BufferedReader object passing it the FileReader object.
		//reinitialize the sum of the numbers
		//reinitialize the number of numbers added
		//priming read to read the first line of the file
		//loop that continues until you are at the end of the file
			//convert the line into a double value and subtract the mean
			//add the square of the difference to the sum
			//increment the counter
			//read a new line from the file
		//close the input file
		//store the calculated standard deviation


		//ADD LINES FOR TASK #3 HERE
		//create an object of type FileWriter using “Results.txt”
		//create an object of PrintWriter passing it the FileWriter object.
		//print the results to the output file
		//close the output file
	}
}