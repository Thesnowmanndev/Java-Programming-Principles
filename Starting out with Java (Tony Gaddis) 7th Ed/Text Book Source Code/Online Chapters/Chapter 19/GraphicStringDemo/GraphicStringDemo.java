import javax.swing.*;
import java.awt.*;

/**
   This class is an applet that demonstrates how a
   a string can be drawn.
*/

public class GraphicStringDemo extends JApplet
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
      int[] xCoords = {60, 100, 140, 140,
                       100, 60, 20, 20 };
      int[] yCoords = {20, 20, 60, 100,
                       140, 140, 100, 60 };
      
      // Call the superclass paint method.
      super.paint(g);
      
      // Set the drawing color.
      g.setColor(Color.red);
      
      // Draw the polygon.
      g.fillPolygon(xCoords, yCoords, 8);
      
      // Set the drawing color to white.
      g.setColor(Color.white);
      
      // Set the font and draw "STOP".
      g.setFont(new Font("SansSerif", Font.BOLD, 35));
      g.drawString("STOP", 35, 95);
   }
}
