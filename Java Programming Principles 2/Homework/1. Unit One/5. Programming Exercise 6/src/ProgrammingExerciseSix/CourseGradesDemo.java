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
   This program demonstrates a solution to the
   Course Grades programming challenge.
*/

public class CourseGradesDemo
{
   public static void main(String[] args)
   {
      // Create an object for the lab grade.
      GradedActivity lab = new GradedActivity();
      // Set the lab score at 85.
      lab.setScore(85);
      
      // Create an object for the pass/fail exam.
      // 20 total questions, 3 questions missed, minimum
      // passing score is 70.
      PassFailExam pfexam = new PassFailExam(20, 3, 70);

      // Create an object for the essay grade.
      Essay essay = new Essay();
      // Set the essay scores. Grammar = 25, spelling = 18
      // length = 17, content = 20.
      essay.setScore(25, 18, 17, 20);
      
      // Create an object for the final exam.
      // 50 questions, 10 missed.
      FinalExam finalExam = new FinalExam(50, 10);
      
      // Create a CourseGrades object.
      CourseGrades course = new CourseGrades();
      course.setLab(lab);
      course.setPassFailExam(pfexam);
      course.setEssay(essay);
      course.setFinalExam(finalExam);
      
      // Display the scores and grades.
      System.out.println(course);
      System.out.println("\n");

      // Programming Exercise 6 Requirements
      double average;
      average = course.getAverage();

      System.out.println("The average of the scores is: \t" + average);
      System.out.println("The lowest of the scores is: \t" + course.getLowest().getScoreOf());
      System.out.println("The highest of the scores is: \t" + course.getHighest().getScoreOf());
   }
}