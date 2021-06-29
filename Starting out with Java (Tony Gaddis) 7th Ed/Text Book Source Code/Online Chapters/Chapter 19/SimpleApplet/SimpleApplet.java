import javax.swing.*;
import java.awt.*;

/**
   This is a simple applet.
*/

public class SimpleApplet extends JApplet
{
   /**
      The init method sets up the applet, much
      like a constructor.
   */
   
   public void init()
   {
      // Create a label.
      JLabel label =
           new JLabel("This is my very first applet.");
      
      // Set the layout manager.
      setLayout(new FlowLayout());
      
      // Add the label to the content pane.
      add(label);
   }
}
