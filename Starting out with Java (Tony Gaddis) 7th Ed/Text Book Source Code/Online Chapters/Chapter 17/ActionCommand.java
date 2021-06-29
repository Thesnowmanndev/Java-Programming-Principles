import javax.swing.*;    // Needed for Swing classes
import java.awt.event.*; // Needed for event listener interface

/**
   This class demonstrates how to change a JButton's action command.
*/

public class ActionCommand extends JFrame
{
   private JButton button1;    // Button 1
   private JButton button2;    // Button 2
   private JButton button3;    // Button 3
   private JPanel panel;       // A panel to hold components
   private final int WINDOW_WIDTH = 300; // Window width
   private final int WINDOW_HEIGHT = 70; // Window height

   /**
      Constructor
   */

   public ActionCommand()
   {
      // Set the title bar text.
      setTitle("Action Command Demonstration");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create the three buttons.
      button1 = new JButton("Dog");
      button2 = new JButton("Cat");
      button3 = new JButton("Bird");
      
      // Change each button's action command.
      button1.setActionCommand("Fido");
      button2.setActionCommand("Kitty");
      button3.setActionCommand("Tweety");

      // Register an event listener with all 3 buttons.
      button1.addActionListener(new ButtonListener());
      button2.addActionListener(new ButtonListener());
      button3.addActionListener(new ButtonListener());

      // Create a panel and add the buttons to it.
      panel = new JPanel();
      panel.add(button1);
      panel.add(button2);
      panel.add(button3);

      // Add the panel to the content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      Private inner class that handles the event when
      the user clicks a button.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         JOptionPane.showMessageDialog(null, "The button's " +
                                       "action command is " +
                                       e.getActionCommand());
      }
   }
   
   /**
      main method
   */
   
   public static void main(String[] args)
   {
      new ActionCommand();
   }
}