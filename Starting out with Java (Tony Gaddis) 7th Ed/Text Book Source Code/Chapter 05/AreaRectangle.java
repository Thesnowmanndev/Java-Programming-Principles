/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
}

