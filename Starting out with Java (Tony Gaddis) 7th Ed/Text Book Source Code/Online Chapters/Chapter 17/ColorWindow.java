import javax.swing.*;    // Needed for Swing classes
import java.awt.*;       // Needed for Color class
import java.awt.event.*; // Needed for event listener interface

/**
   This class demonstrates how to set the background color of
   a panel and the foreground color of a label.
*/

public class ColorWindow extends JFrame
{
   private JLabel messageLabel;    // To display a message
   private JButton redButton;      // Changes color to red
   private JButton blueButton;     // Changes color to blue
   private JButton yellowButton;   // Changes color to yellow
   private JPanel panel;           // A panel to hold components
   private final int WINDOW_WIDTH = 200; // Window width
   private final int WINDOW_HEIGHT = 125; // Window height

   /**
      Constructor
   */

   public ColorWindow()
   {
      // Set the title bar text.
      setTitle("Colors");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a label.
      messageLabel = new JLabel("Click a button to " +
                                "select a color.");

      // Create the three buttons.
      redButton = new JButton("Red");
      blueButton = new JButton("Blue");
      yellowButton = new JButton("Yellow");

      // Register an event listener with all 3 buttons.
      redButton.addActionListener(new RedButtonListener());
      blueButton.addActionListener(new BlueButtonListener());
      yellowButton.addActionListener(new YellowButtonListener());

      // Create a panel and add the components to it.
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(redButton);
      panel.add(blueButton);
      panel.add(yellowButton);

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      Private inner class that handles the event when
      the user clicks the Red button.
   */

   private class RedButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to red.
         panel.setBackground(Color.RED);

         // Set the label's text to blue.
         messageLabel.setForeground(Color.BLUE);
      }
   }

   /**
      Private inner class that handles the event when
      the user clicks the Blue button.
   */

   private class BlueButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to blue.
         panel.setBackground(Color.BLUE);

         // Set the label's text to yellow.
         messageLabel.setForeground(Color.YELLOW);
      }
   }

   /**
      Private inner class that handles the event when
      the user clicks the Yellow button.
   */

   private class YellowButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Set the panel's background to yellow.
         panel.setBackground(Color.YELLOW);

         // Set the label's text to black.
         messageLabel.setForeground(Color.BLACK);
      }
   }
   
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      new ColorWindow();
   }
}
