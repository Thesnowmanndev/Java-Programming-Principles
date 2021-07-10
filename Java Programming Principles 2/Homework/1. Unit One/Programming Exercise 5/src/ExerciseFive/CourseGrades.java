package ExerciseFive;

/**
   The CourseGrades class stores data about a course's 
   graded activities for the Course Grades programming 
   challenge.
*/

public class CourseGrades
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
}
