import javax.swing.*; // Needed for Swing classes
import java.awt.*;    // Needed for GridLayout class

/**
   This class demonstrates how panels may be added to
   the cells created by a GridLayout manager.
*/

public class GridPanelWindow extends JFrame
{
   private final int WINDOW_WIDTH = 400;   // Window width
   private final int WINDOW_HEIGHT = 200;  // Window height

   /**
      Constructor
   */

   public GridPanelWindow()
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

      // Create six labels.
      JLabel label1 = new JLabel("This is cell 1.");
      JLabel label2 = new JLabel("This is cell 2.");
      JLabel label3 = new JLabel("This is cell 3.");
      JLabel label4 = new JLabel("This is cell 4.");
      JLabel label5 = new JLabel("This is cell 5.");
      JLabel label6 = new JLabel("This is cell 6.");

      // Create six panels.
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      JPanel panel4 = new JPanel();
      JPanel panel5 = new JPanel();
      JPanel panel6 = new JPanel();

      // Add the labels to the panels.
      panel1.add(label1);
      panel2.add(label2);
      panel3.add(label3);
      panel4.add(label4);
      panel5.add(label5);
      panel6.add(label6);

      // Add the buttons to the panels.
      panel1.add(button1);
      panel2.add(button2);
      panel3.add(button3);
      panel4.add(button4);
      panel5.add(button5);
      panel6.add(button6);

      // Add the panels to the content pane.
      add(panel1);  // Goes into row 1, column 1
      add(panel2);  // Goes into row 1, column 2
      add(panel3);  // Goes into row 1, column 3
      add(panel4);  // Goes into row 2, column 1
      add(panel5);  // Goes into row 2, column 2
      add(panel6);  // Goes into row 2, column 3

      // Display the window.
      setVisible(true);
   }
   
   /**
      The main method creates an instance of the
      GridPanelWindow class, displaying its window.
   */
   
   public static void main(String[] args)
   {
      new GridPanelWindow();
   }
}
