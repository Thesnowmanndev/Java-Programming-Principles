/**
	This program demonstrates a method that accepts
	a mixture of fixed arguments and a variable-
	length argument list.
*/

public class VarargsDemo3
{
   public static void main(String[] args)
   {
      // Display the average for the first course.
      courseAverage("Intro to Java", 89.0, 92.4, 86.8);
      
      // Display the average for the second course.
      courseAverage("Web Programming", 91.7, 82.4);
   }
   
   /**
   	The courseAverage method accepts the name of
   	a course and a variable number of test scores
   	as arguments. The variable-length parameter,
   	scores, must be the last one declared in the
   	parameter list.
		@param course The name of a course.
		@param scores A variable number of scores.
   */
   
   public static void courseAverage(String course, 
                                    double... scores)
   {
      double total = 0.0;     // Accumulator
      double average;         // Average of scores
      
      // Display the course name.
      System.out.println("Course name: " + course);
      
      // Calculate the sum of the scores.
      for (double s : scores)
         total += s;
      
      // Get the average of the scores.
      average = total / scores.length;
      
      // Display the average.
      System.out.println("Average score: " + average);
   }
}