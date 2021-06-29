import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
   The AWTTempConverter class is an applet that converts
   Fahrenheit temperatures to Celsius.
*/

public class AWTTempConverter extends Applet
{
   private Panel fPanel;          // To hold a text field
   private Panel cPanel;          // To hold a text field
   private Panel buttonPanel;     // To hold a button
   private TextField fahrenheit;  // Fahrenheit temperature
   private TextField celsius;     // Centigrade temperature

   /**
      init method
   */

   public void init()
   {
      // Build the panels.
      buildFpanel();
      buildCpanel();
      buildButtonPanel();

      // Create a layout manager.
      setLayout(new GridLayout(3, 1));

      // Add the panels to the applet.
      add(fPanel);
      add(cPanel);
      add(buttonPanel);
   }

   /**
      The buildFpanel method creates a panel with a text
      field in which the user can enter a Fahrenheit
      temperature.
   */

   private void buildFpanel()
   {
      // Create the panel.
      fPanel = new Panel();

      // Create a label to display a message.
      Label message1 = new Label("Fahrenheit Temperature: ");

      // Create a text field for the Fahrenheit temp.
      fahrenheit = new TextField(10);

      // Create a layout manager for the panel.
      fPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

      // Add the label and text field to the panel.
      fPanel.add(message1);
      fPanel.add(fahrenheit);
   }

   /**
      The buildCpanel method creates a panel that
      displays the Celsius temperature in a
      read-only text field.
   */

   private void buildCpanel()
   {
      // Create the panel.
      cPanel = new Panel();

      // Create a label to display a message.
      Label message2 = new Label("Centigrade Temperature: ");

      // Create a text field for the Celsius temp.
      celsius = new TextField(10);

      // Make the text field read-only.
      celsius.setEditable(false);

      // Create a layout manager for the panel.
      cPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

      // Add the label and text field to the panel.
      cPanel.add(message2);
      cPanel.add(celsius);
   }

   /**
      The buildButtonPanel method creates a panel with
      a button that converts the Fahrenheit temperature
      to Celsius.
   */


   private void buildButtonPanel()
   {
      // Create the panel.
      buttonPanel = new Panel();

      // Create a button with the text "Convert".
      Button convButton = new Button("Convert");

      // Add an action listener to the button.
      convButton.addActionListener(new ButtonListener());

      // Add the button to the panel.
      buttonPanel.add(convButton);
   }

   /**
      Private inner class that handles the action event
      that is generated when the user clicks the convert
      button.
   */

   private class ButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double ftemp, ctemp;  // To hold the temperatures

         // Get the Fahrenheit temperature and convert it
         // to a double.
         ftemp = Double.parseDouble(fahrenheit.getText());

         // Calculate the Celsius temperature.
         ctemp = (5.0 / 9.0) * (ftemp - 32);

         // Display the Celsius temperature.
         celsius.setText(String.format("%.1f",  ctemp));
      }
   }
}
