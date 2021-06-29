import javax.swing.*;
import java.awt.*;

/**
   This class is an applet that demonstrates how
   rectangles can be drawn.
*/

public class RectangleDemo extends JApplet
{
   /**
      init method
   */
   
   public void init()
   {
      // Set the background color to white.
      getContentPane().setBackground(Color.white);
   }
   
   /**
      paint method
      @param g The applet's Graphics object.
   */
   
   public void paint(Graphics g)
   {
      // Call the superclass paint method.
      super.paint(g);
      
      // Draw a black unfilled rectangle.
      g.setColor(Color.black);
      g.drawRect(20, 20, 120, 120);
      
      // Draw a red filled rectangle.
      g.setColor(Color.red);
      g.fillRect(160, 160, 120, 120);
   }
}
