import java.awt.*;     // Needed for BorderLayout class
import javax.swing.*;  // Needed for Swing classes

/**
   This class demonstrates how JPanels can be nested
   inside each region of a content pane governed by
   a BorderLayout manager.
*/

public class BorderPanelWindow extends JFrame
{
   /**
      Constructor
   */

   public BorderPanelWindow()
   {
      // Set the title bar text.
      setTitle("Border Layout");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a BorderLayout manager to the content pane.
      setLayout(new BorderLayout());

      // Create five panels.
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel panel4 = new JPanel();
      JPanel panel5 = new JPanel();

      // Create five buttons.
      JButton button1 = new JButton("North Button");
      JButton button2 = new JButton("South Button");
      JButton button3 = new JButton("East Button");
      JButton button4 = new JButton("West Button");
      JButton button5 = new JButton("Center Button");

      // Add the buttons to the panels.
      panel1.add(button1);
      panel2.add(button2);
      panel3.add(button3);
      panel4.add(button4);
      panel5.add(button5);

      // Add the five panels to the content pane.
      add(panel1, BorderLayout.NORTH);
      add(panel2, BorderLayout.SOUTH);
      add(panel3, BorderLayout.EAST);
      add(panel4, BorderLayout.WEST);
      add(panel5, BorderLayout.CENTER);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The main method creates an instance of the
      BorderPanelWindow class, causing it to display
      its window.
   */
   
   public static void main(String[] args)
   {
      new BorderPanelWindow();
   }
}
