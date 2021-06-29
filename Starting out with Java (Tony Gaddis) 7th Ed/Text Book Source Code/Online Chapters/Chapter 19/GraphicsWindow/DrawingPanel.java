import javax.swing.*;
import java.awt.*;

/**
   This class creates a panel that example shapes are
   drawn on.
*/

public class DrawingPanel extends JPanel
{
   // Declare a check box array.
   private JCheckBox[] checkBoxArray;
   
   /**
      Constructor
   */
      
   public DrawingPanel(JCheckBox[] cbArray)
   {
      // Reference the check box array.
      checkBoxArray = cbArray;
      
      // Set the background color to white.
      setBackground(Color.white);
      
      // Set the preferred size of the panel.
      setPreferredSize(new Dimension(300, 200));
   }
   
   /**
      paintComponent method
      @param g The panel's Graphics object.
   */
   
   public void paintComponent(Graphics g)
   {
      // Call the superclass paintComponent method.
      super.paintComponent(g);
      
      // Draw the selected shapes.
      if (checkBoxArray[0].isSelected())
      {
         g.setColor(Color.black);
         g.drawLine(10, 10, 290, 190);
      }
      if (checkBoxArray[1].isSelected())
      {
         g.setColor(Color.black);
         g.drawRect(20, 20, 50, 50);
      }
      if (checkBoxArray[2].isSelected())
      {
         g.setColor(Color.red);
         g.fillRect(50, 30, 120, 120);
      }
      if (checkBoxArray[3].isSelected())
      {
         g.setColor(Color.black);
         g.drawOval(40, 155, 75, 50);
      }  
      if (checkBoxArray[4].isSelected())
      {
         g.setColor(Color.blue);
         g.fillOval(200, 125, 75, 50);
      }
      if (checkBoxArray[5].isSelected())
      {
         g.setColor(Color.black);
         g.drawArc(200, 40, 75, 50, 0, 90);
      }
      if (checkBoxArray[6].isSelected())
      {
         g.setColor(Color.green);
         g.fillArc(100, 155, 75, 50, 0, 90);
      }
   }
}
