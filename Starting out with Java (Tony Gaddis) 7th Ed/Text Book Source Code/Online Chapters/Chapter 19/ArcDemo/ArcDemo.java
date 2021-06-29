import javax.swing.*;
import java.awt.*;

/**
   This class is an applet that demonstrates how
   arcs can be drawn.
*/

public class ArcDemo extends JApplet
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
      
      // Draw a black unfilled arc from 0 degrees
      // to 90 degrees.
      g.setColor(Color.black);
      g.drawArc(0, 20, 120, 120, 0, 90);
      
      // Draw a red filled arc from 0 degrees
      // to 90 degrees.
      g.setColor(Color.red);
      g.fillArc(140, 20, 120, 120, 0, 90);
      
      // Draw a green unfilled arc from 0 degrees
      // to 45 degrees.
      g.setColor(Color.green);
      g.drawArc(0, 120, 120, 120, 0, 45);

      // Draw a blue filled arc from 0 degrees
      // to 45 degrees.
      g.setColor(Color.blue);
      g.fillArc(140, 120, 120, 120, 0, 45);     
   }
}
