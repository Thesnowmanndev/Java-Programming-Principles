import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This class demonstrates a combo box.
*/

public class ComboBoxWindow extends JFrame
{
   private JPanel coffeePanel;         // To hold components
   private JPanel selectedCoffeePanel; // To hold components
   private JComboBox coffeeBox;        // A list of coffees
   private JLabel label;               // Displays a message
   private JTextField selectedCoffee;  // Selected coffee

   // The following array holds the values that will
   // be displayed in the coffeeBox combo box.
   private String[] coffee = { "Regular Coffee",
                     "Dark Roast", "Cappuccino",
                     "Espresso", "Decaf"};

   /**
      Constructor
   */

   public ComboBoxWindow()
   {
      // Set the title.
      setTitle("Combo Box Demo");

      // Specify an action for the close button.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create a BorderLayout manager.
      setLayout(new BorderLayout());

      // Build the panels.
      buildCoffeePanel();
      buildSelectedCoffeePanel();

      // Add the panels to the content pane.
      add(coffeePanel, BorderLayout.CENTER);
      add(selectedCoffeePanel, BorderLayout.SOUTH);

      // Pack and display the window.
      pack();
      setVisible(true);
   }

   /**
      The buildCoffeePanel method adds a combo box 
      with the types of coffee to a panel.
   */

   private void buildCoffeePanel()
   {
      // Create a panel to hold the combo box.
      coffeePanel = new JPanel();

      // Create the combo box
      coffeeBox = new JComboBox(coffee);

      // Register an action listener.
      coffeeBox.addActionListener(new ComboBoxListener());

      // Add the combo box to the panel.
      coffeePanel.add(coffeeBox);
   }

   /**
      The buildSelectedCoffeePanel method adds a
      read-only text field to a panel.
   */

   private void buildSelectedCoffeePanel()
   {
      // Create a panel to hold the components.
      selectedCoffeePanel = new JPanel();

      // Create the label.
      label = new JLabel("You selected: ");

      // Create the uneditable text field.
      selectedCoffee = new JTextField(10);
      selectedCoffee.setEditable(false);

      // Add the label and text field to the panel.
      selectedCoffeePanel.add(label);
      selectedCoffeePanel.add(selectedCoffee);
   }

   /**
      Private inner class that handles the event when
      the user selects an item from the combo box.
   */

   private class ComboBoxListener
                      implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         // Get the selected coffee.
         String selection =
                 (String) coffeeBox.getSelectedItem();
         
         // Display the selected coffee in the text field.
         selectedCoffee.setText(selection);
      }
   }

   /**
      The main method creates an instance of the
      ComboBoxWindow class which causes it to display
      its window.
   */
   
   public static void main(String[] args)
   {
      new ComboBoxWindow();
   }
}
