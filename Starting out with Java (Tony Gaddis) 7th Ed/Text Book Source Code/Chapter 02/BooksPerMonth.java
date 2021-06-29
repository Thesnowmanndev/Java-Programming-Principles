/**
   This program demonstrates how a cast operator
   can be used to prevent integer division.
*/

public class BooksPerMonth
{
     public static void main(String[] args)
     {
          int books = 15,        // Number of books to read
              months = 6;        // Number of months to read them
          double booksPerMonth;  // Average books per month

          // Display the number of books I plan to
          // read and the number months in which I
          // plan to read them.
          System.out.print("I plan to read ");
          System.out.print(books + " books in ");
          System.out.println(months + " months.");
          
          // Calculate the average books per month.
          booksPerMonth = (double) books / months;
          
          // Display the average number of books per month.
          System.out.print("I will read an average of ");
          System.out.print(booksPerMonth);
          System.out.println(" books per month.");
     }
}
