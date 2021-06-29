import java.io.*;  // Needed for IOException

/**
   This program uses the TestScoreReader class
   to read test scores from a file and get
   their averages.
*/

public class TestAverages
{
   public static void main(String[] args)
                      throws IOException
   {
      double average;         // Test average
      int studentNumber = 1;  // Control variable
      
      // Create a TestScoreReader object.
      TestScoreReader scoreReader =
                  new TestScoreReader("Grades.csv");
      
      // Display the averages.
      while (scoreReader.readNextLine())
      {
         // Get the average from the TestScoreReader.
         average = scoreReader.getAverage();
         
         // Display the student's average.
         System.out.println("Average for student " +
                            studentNumber + " is " +
                            average);

         // Increment the student number.
         studentNumber++;
      }
      
      // Close the TestScoreReader.
      scoreReader.close();
      System.out.println("No more scores.");
   }
}
