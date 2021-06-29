/**
   This class holds data for a computer science student.
*/

public class CompSciStudent extends Student
{
   // Required hours
   private final int MATH_HOURS = 20;   // Math hours
   private final int CS_HOURS = 40;     // Comp sci hours
   private final int GEN_ED_HOURS = 60; // Gen ed hours

   // Hours taken
   private int mathHours;  // Math hours taken
   private int csHours;    // Comp sci hours taken
   private int genEdHours; // General ed hours taken

   /**
      The Constructor sets the student's name, 
      ID number, and the year admitted.
      @param n The student's name.
      @param id The student's ID number.
      @param year The year the student was admitted.
   */

   public CompSciStudent(String n, String id, int year)
   {
      super(n, id, year);

   }

   /**
      The setMathHours method sets the number of 
      math hours taken.
      @param math The math hours taken.
   */

   public void setMathHours(int math)
   {
      mathHours = math;
   }

   /**
      The setCsHours method sets the number of 
      computer science hours taken.
      @param cs The computer science hours taken.
   */

   public void setCsHours(int cs)
   {
      csHours = cs;
   }

   /**
      The setGenEdHours method sets the number of 
      general ed hours taken.
      @param genEd The general ed hours taken.
   */

   public void setGenEdHours(int genEd)
   {
      genEdHours = genEd;
   }

   /**
      The getRemainingHours method returns the
      the number of hours remaining to be taken.
      @return The hours remaining for the student.
   */

   public int getRemainingHours()
   {
      int reqHours,        // Total required hours
          remainingHours;  // Remaining hours

      // Calculate the required hours.
      reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
      
      // Calculate the remaining hours.
      remainingHours = reqHours - (mathHours + csHours
                         + genEdHours);
                         
      return remainingHours;
   }

   /**
      The toString method returns a string containing
      the student's data.
      @return A reference to a String.
   */
   
   public String toString()
   {
      String str;

      str = super.toString() +
         "\nMajor: Computer Science" +
         "\nMath Hours Taken: " + mathHours +
         "\nComputer Science Hours Taken: " + csHours +
         "\nGeneral Ed Hours Taken: " + genEdHours;

      return str;
   }
}