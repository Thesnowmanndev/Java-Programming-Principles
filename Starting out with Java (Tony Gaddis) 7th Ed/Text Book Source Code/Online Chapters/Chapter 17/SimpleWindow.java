import javax.swing.*;   // Needed for Swing classes

/**
   This class extends the JFrame class. Its constructor displays
   a simple window with a title. The application exits when the
   user clicks the close button.
*/

public class SimpleWindow extends JFrame
{
   /**
      Constructor
   */
   
   public SimpleWindow()
   {
      final int WINDOW_WIDTH = 350;   // Window width in pixels
      final int WINDOW_HEIGHT = 250;  // Window height in pixels

      // Set this window's title.
      setTitle("A Simple Window");

      // Set the size of this window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Display the window.
      setVisible(true);
   }
}
