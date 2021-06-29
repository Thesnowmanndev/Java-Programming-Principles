import java.awt.*;
import javax.swing.*;

/**
   This applet plays a sound file one time.
   Audio source: NASA
*/

public class AudioDemo1 extends JApplet
{
   /**
      init method
   */
   
   public void init()
   {
      // Create a layout manager.
      setLayout(new FlowLayout());
      
      // Make the credit label and add it.
      JLabel credit = new JLabel("Famous words " +
            "from the Moon. Source: NASA");
      add(credit);
      
      // Play the sound file.
      play(getDocumentBase(), "step.wav");
   }
}
