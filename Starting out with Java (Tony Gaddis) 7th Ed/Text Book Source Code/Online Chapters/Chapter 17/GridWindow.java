import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class

/**
   This class demonstrates the GridLayout manager.
*/

public class GridWindow extends JFrame
{
   private final int WINDOW_WIDTH = 400;   // Window width
   private final int WINDOW_HEIGHT = 200;  // Window height

   /**
      Constructor
   */

   public GridWindow()
   {
      // Set the title bar text.
      setTitle("Grid Layout");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Add a GridLayout manager to the content pane.
      setLayout(new GridLayout(2, 3));

      // Create six buttons.
      JButton button1 = new JButton("Button 1");
      JButton button2 = new JButton("Button 2");
      JButton button3 = new JButton("Button 3");
      JButton button4 = new JButton("Button 4");
      JButton button5 = new JButton("Button 5");
      JButton button6 = new JButton("Button 6");

      // Add the six buttons to the content pane.
      add(button1);  // Goes into row 1, column 1
      add(button2);  // Goes into row 1, column 2
      add(button3);  // Goes into row 1, column 3
      add(button4);  // Goes into row 2, column 1
      add(button5);  // Goes into row 2, column 2
      add(button6);  // Goes into row 2, column 3

      // Display the window.
      setVisible(true);
   }
   
   /**
      The main method creates an instance of the GridWindow
      class, causing it to display its window.
   */
   
   public static void main(String[] args)
   {
      new GridWindow();
   }
}
