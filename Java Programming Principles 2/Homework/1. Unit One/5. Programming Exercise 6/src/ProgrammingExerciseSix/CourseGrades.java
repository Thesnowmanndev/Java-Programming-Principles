/*
 * This program was written by Kyle Martin on 7/10/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to print the highest, lowest, and average scores in a class.
 * See Chapter 10 Programming Exercise 6.
 */


package ProgrammingExerciseSix;

/**
   The CourseGrades class stores data about a course's 
   graded activities for the Course Grades programming 
   challenge.
*/

public class CourseGrades implements Analyzable
{
   public final int NUM_GRADES = 4;
   private GradedActivity[] grades;
   
   /**
      Constructor
   */
      
   public CourseGrades()
   {
      grades = new GradedActivity[NUM_GRADES];
   }
   
   /**
      The setLab method stores a GradedActivity object
      for the lab grade.
      @param aLab Represents the lab grade.
   */
   
   public void setLab(GradedActivity aLab)
   {
      grades[0] = aLab;
   }
   
   /**
      The setPassFailExam method stores a PassFailExam object
      for the pass/fail exam grade.
      @param aPassFailExam Represents the pass/fail exam grade.
   */
   
   public void setPassFailExam(PassFailExam aPassFailExam)
   {
      grades[1] = aPassFailExam;
   }

   /**
      The setEssay method stores an Essay object
      for the essay grade.
      @param anEssay Represents the essay grade.
   */
      
   public void setEssay(Essay anEssay)
   {
      grades[2] = anEssay;
   }

   /**
      The setFinalExam method stores a FinalExam object
      for the final exam grade.
      @param aFinalExam Represents the final exam grade.
   */
   
   public void setFinalExam(FinalExam aFinalExam)
   {
      grades[3] = aFinalExam;
   }

   /**
      The toString method returns a string representation
      of the object.
      @return A string representation of the object.
   */
   
   public String toString()
   {
      String str = "Lab Score: " + grades[0].getScore() +
                   "\tGrade: " + grades[0].getGrade() +
                   "\nPass/Fail Exam Score: " + grades[1].getScore() +
                   "\tGrade: " + grades[1].getGrade() +
                   "\nEssay Score: " + grades[2].getScore() +
                   "\tGrade: " + grades[2].getGrade() +
                   "\nFinal Exam Score: " + grades[3].getScore() +
                   "\tGrade: " + grades[3].getGrade();
      
      return str;
   }

   /*
   * Programming Exercise 6 Analyzable Interface Methods:
   * */

   public double getAverage() {
      double total = 0;

      for (int i = 0; i < grades.length; i++) {
         total += grades[i].getScoreOf();
      }

      double average = total / grades.length;

      return average;
   }

   public GradedActivity getHighest() {
      GradedActivity highest = grades[0];

      for (int i = 0; i < grades.length; i++) {
         if (grades[i].getScoreOf() > highest.getScoreOf())
            highest = grades[i];
      }

      return highest;
   }

   public GradedActivity getLowest() {
      GradedActivity lowest = grades[0];

      for (int i = 0; i < grades.length; i++) {

         if (grades[i].getScoreOf() < lowest.getScoreOf()) {
            lowest = grades[i];
         }
      }

      return lowest;
   }
}
