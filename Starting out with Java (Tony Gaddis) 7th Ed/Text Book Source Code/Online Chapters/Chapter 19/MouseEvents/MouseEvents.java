import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
   This applet shows the mouse events as they occur.
*/

public class MouseEvents extends JApplet
{
   private JTextField[] mouseStates;
   private String[] text = {
                "Pressed", "Clicked", "Released",
                "Entered", "Exited", "Dragged",
                "X:", "Y:" };
   
   /**
      init method
   */
      
   public void init()
   {
      // Create a layout manager.
      setLayout(new FlowLayout());     
      
      // Create the array of text fields.
      mouseStates = new JTextField[8];
      for (int i = 0; i < mouseStates.length; i++)
      {
         mouseStates[i] = new JTextField(text[i], 10);
         mouseStates[i].setEditable(false);
         add(mouseStates[i]);
      }
      
      // Add a mouse listener to this applet.
      addMouseListener(new MyMouseListener());
   
      // Add a mouse motion listener to this applet.
      addMouseMotionListener(new MyMouseMotionListener());
   }
   
   /**
      The clearTextFields method sets all of the text
      backgrounds to light gray.
   */
      
   public void clearTextFields()
   {
      for (int i = 0; i < 6; i++)
         mouseStates[i].setBackground(Color.lightGray);
   }
   
   /**
      Private inner class that handles mouse events.
      When an event occurs, the text field for that
      event is given a yellow background.
   */
   
   private class MyMouseListener
                         implements MouseListener
   {
      public void mousePressed(MouseEvent e)
      {
         clearTextFields();
         mouseStates[0].setBackground(Color.yellow);
      }

      public void mouseClicked(MouseEvent e)
      {
         clearTextFields();
         mouseStates[1].setBackground(Color.yellow);        
      }

      public void mouseReleased(MouseEvent e)
      {
         clearTextFields();
         mouseStates[2].setBackground(Color.yellow);
      }

      public void mouseEntered(MouseEvent e)
      {
         clearTextFields();
         mouseStates[3].setBackground(Color.yellow);
      }

      public void mouseExited(MouseEvent e)
      {
         clearTextFields();
         mouseStates[4].setBackground(Color.yellow);
      }
   }

   /**
      Private inner class to handle mouse motion events.
   */
   
   private class MyMouseMotionListener
                         implements MouseMotionListener
   {
      public void mouseDragged(MouseEvent e)
      {
         clearTextFields();
         mouseStates[5].setBackground(Color.yellow);
      }

      public void mouseMoved(MouseEvent e)
      {
         mouseStates[6].setText("X: " + e.getX());
         mouseStates[7].setText("Y: " + e.getY());       
      }
   }
}
