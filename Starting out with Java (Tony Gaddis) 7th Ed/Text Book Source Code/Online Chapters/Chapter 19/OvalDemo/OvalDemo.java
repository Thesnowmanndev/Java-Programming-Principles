import javax.swing.*;
import java.awt.*;

/**
   This class is an applet that demonstrates how
   ovals can be drawn.
*/

public class OvalDemo extends JApplet
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
      
      // Draw a black unfilled oval.
      g.setColor(Color.black);
      g.drawOval(20, 20, 120, 75);
      
      // Draw a green filled oval.
      g.setColor(Color.green);
      g.fillOval(80, 160, 180, 75);
   }
}
