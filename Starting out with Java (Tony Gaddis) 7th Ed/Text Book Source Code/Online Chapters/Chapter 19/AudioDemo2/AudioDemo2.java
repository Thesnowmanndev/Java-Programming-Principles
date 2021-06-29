import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This applet uses the AudioClip class to play a
   sound. Sound source: NASA
*/

public class AudioDemo2 extends JApplet
{
   private JLabel credit;         // Displays NASA credit
   private JButton playButton;    // Plays the sound clip
   private JButton loopButton;    // Loops the clip
   private JButton stopButton;    // Stops the clip
   private AudioClip sound;       // Holds the sound clip
   
   /**
      init method
   */
   
   public void init()
   {
      // Create a layout manager.
      setLayout(new FlowLayout());
      
      // Make the credit label and add it.
      credit = new JLabel("Audio source: NASA");
      add(credit);
      
      // Make the buttons and add them.
      makeButtons();
    
      // Get an AudioClip object for the sound file.
      sound = getAudioClip(getDocumentBase(), "step.wav");
   }
   
   /**
      The makeButtons method creates the Play, Loop, and
      Stop buttons, and adds them to the content pane.
   */

   private void makeButtons()
   {
      // Create the  Play, Loop, and Stop buttons.
      playButton  = new JButton("Play");
      loopButton  = new JButton("Loop");         
      stopButton  = new JButton("Stop");
          
      // Register an action listener with each button.
      playButton.addActionListener(new ButtonListener());
      loopButton.addActionListener(new ButtonListener());
      stopButton.addActionListener(new ButtonListener());

      // Add the  buttons to the content pane.
      add(playButton);
      add(loopButton);
      add(stopButton);
   }

   /**
      Private inner class that handles the action event
      that is generated when the user clicks one of the
      buttons.
   */
   
   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Determine which button was clicked and 
         // perform the selected action.
         if (e.getSource() == playButton)
            sound.play();
         else if (e.getSource() == loopButton)
            sound.loop();        
         else if (e.getSource() == stopButton)
            sound.stop();
      }
   }
}

      
