import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
   The MetricConverter class lets the user enter a
   distance in kilometers. Radio buttons can be selected to
   convert the kilometers to miles, feet, or inches.
*/

public class MetricConverter extends JFrame
{
   private JPanel panel;                  // A holding panel
   private JLabel messageLabel;           // A message to the user
   private JTextField kiloTextField;      // To hold user input
   private JRadioButton milesButton;      // To convert to miles
   private JRadioButton feetButton;       // To convert to feet
   private JRadioButton inchesButton;     // To convert to inches
   private ButtonGroup radioButtonGroup;  // To group radio buttons
   private final int WINDOW_WIDTH = 400;  // Window width
   private final int WINDOW_HEIGHT = 100; // Window height

   /**
      Constructor
   */

   public MetricConverter()
   {
      // Set the title.
      setTitle("Metric Converter");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
      The buildPanel method adds a label, text field, and
      and three buttons to a panel.
   */

   private void buildPanel()
   {
      // Create the label, text field, and radio buttons.
      messageLabel = new JLabel("Enter a distance in kilometers");
      kiloTextField = new JTextField(10);
      milesButton = new JRadioButton("Convert to miles");
      feetButton = new JRadioButton("Convert to feet");
      inchesButton = new JRadioButton("Convert to inches");

      // Group the radio buttons.
      radioButtonGroup = new ButtonGroup();
      radioButtonGroup.add(milesButton);
      radioButtonGroup.add(feetButton);
      radioButtonGroup.add(inchesButton);

      // Add action listeners to the radio buttons.
      milesButton.addActionListener(new RadioButtonListener());
      feetButton.addActionListener(new RadioButtonListener());
      inchesButton.addActionListener(new RadioButtonListener());

      // Create a panel and add the components to it.
      panel = new JPanel();
      panel.add(messageLabel);
      panel.add(kiloTextField);
      panel.add(milesButton);
      panel.add(feetButton);
      panel.add(inchesButton);
   }

   /**
      Private inner class that handles the event when
      the user clicks one of the radio buttons.
   */

   private class RadioButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String input;          // To hold the user's input
         String convertTo = ""; // The units we're converting to
         double result = 0.0;   // To hold the conversion

         // Get the kilometers entered.
         input = kiloTextField.getText();
         
         // Determine which radio button was clicked.
         if (e.getSource() == milesButton)
         {
            // Convert to miles.
            convertTo = " miles.";
            result = Double.parseDouble(input) * 0.6214;
         }
         else if (e.getSource() == feetButton)
         {
            // Convert to feet.
            convertTo = " feet.";
            result = Double.parseDouble(input) * 3281.0;
         }
         else if (e.getSource() == inchesButton)
         {
            // Convert to inches.
            convertTo = " inches.";
            result = Double.parseDouble(input) * 39370.0;
         }

         // Display the conversion.
         JOptionPane.showMessageDialog(null, input + 
                  " kilometers is " + result + convertTo);
      }
   }
   
   /**
      The main method creates an instance of the
      MetricConverterWindow class, displaying its window.
   */
   
   public static void main(String[] args)
   {
      new MetricConverter();
   }
}
