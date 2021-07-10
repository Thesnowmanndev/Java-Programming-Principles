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
   The Essay class stores data about a graded 
   activity that is an essay for the Course 
   Grades programming challenge.
*/

public class Essay extends GradedActivity
{
   private double grammar;          // Points for grammar
   private double spelling;         // Points for spelling
   private double correctLength;    // Points for length 
   private double content;          // Points for content

   /**
      The setScore method sets points for grammar,
      spelling, length, and content.
      This method overloads the base class method.
      Note that the other "set" methods are
      private. Those methods are for validating
      points before they are assigned.
      @param gr Grammar points.
      @param sp Spelling points.
      @param len Length points.
      @param cnt Content points.
   */

   public void setScore(double gr, double sp, double len, double cnt)
   {
      // Set the individual scores.
      setGrammar(gr);
      setSpelling(sp);
      setCorrectLength(len);
      setContent(cnt);
      
      // Set the total score.
      super.setScore(grammar + spelling + correctLength + content);
   }

   /**
      The setGrammar method sets the  grammar
      points, validating them before they are set.
      @param g Grammar points.
   */

   private void setGrammar(double g)
   {
      if (g <= 30.0)
         grammar = g;
      else                 // Invalid points
         grammar = 0.0;
   }

   /**
      The setSpelling method sets the spelling
      points, validating them before they are set.
      @param s Spelling points.
   */
   
   private void setSpelling(double s)
   {
      if (s <= 20.0)
         spelling = s;
      else                 // Invalid points
         spelling = 0.0;
   }

   /**
      The setCorrectLength method sets the points
      for correct length, validating them before
      they are set.
      @param c Correct length points.
   */
   
   private void setCorrectLength(double c)
   {
      if (c <= 20.0)
         correctLength = c;
      else                 // Invalid points
         correctLength = 0.0;
   }

   /**
      The setContent method sets the points
      for content, validating them before
      they are set.
      @param c Content points.
   */
   
   private void setContent(double c)
   {
      if (c <= 30)
         content = c;
      else                 // Invalid points
         content = 0.0;
   }

   /**
      The getGrammar method returns the points
      awarded for grammar.
      @return Gramar points.
   */

   public double getGrammar()
   {
      return grammar;
   }

   /**
      The getSpelling method returns the points
      awarded for spelling.
      @return Spelling points.
   */

   public double getSpelling()
   {
      return spelling;
   }

   /**
      The getCorrectLength method returns the points
      awarded for correct length.
      @return Correct length points.
   */

   public double getCorrectLength()
   {
      return correctLength;
   }

   /**
      The getContent method returns the points
      awarded for content.
      @return Content points.
   */
   
   public double getContent()
   {
      return content;
   }

   /**
      The getScore method returns the overall
      numeric score. Overrides the base class
      method.
      @return Overall numeric score.
   */

   @Override
   public double getScore()
   {
      return grammar + spelling + correctLength + content;
   }
}
