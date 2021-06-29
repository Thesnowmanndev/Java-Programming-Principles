import javax.swing.JOptionPane;

/**
   This program demonstrates the Metric class.
*/

public class MetricDemo
{
   public static void main(String[] args)
   {
      String input; // To hold input
      double miles; // A distance in miles
      double kilos; // A distance in kilometers
      
      // Get a distance in miles.
      input = JOptionPane.showInputDialog("Enter " +
                             "a distance in miles.");
      miles = Double.parseDouble(input);

      // Convert the distance to kilometers.
      kilos = Metric.milesToKilometers(miles);
      JOptionPane.showMessageDialog(null, 
        String.format("%,.2f miles equals %,.2f kilometers.",
                      miles, kilos));

      // Get a distance in kilometers.
      input = JOptionPane.showInputDialog("Enter " +
                       "a distance in kilometers: ");
      kilos = Double.parseDouble(input);

      // Convert the distance to kilometers.
      miles = Metric.kilometersToMiles(kilos);
      JOptionPane.showMessageDialog(null, 
        String.format("%,.2f kilometers equals %,.2f miles.",
                      kilos, miles));
      
      System.exit(0);
   }
}