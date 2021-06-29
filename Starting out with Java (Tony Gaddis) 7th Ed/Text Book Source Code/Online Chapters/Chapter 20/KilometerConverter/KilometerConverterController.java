import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class KilometerConverterController 
{
    @FXML 
    private Button convertButton;

    @FXML 
    private TextField kilometerTextField;

    @FXML 
    private Label outputLabel;

    @FXML 
    private Label promptLabel;

    // This method is called when the FXML file is loaded
    public void initialize() 
    {
        // Perform any necessary initialization here.
    }
    
    // Event listener for the convertButton
    public void convertButtonListener() 
    { 
      final double CONVERSION_FACTOR = 0.6214;
      
      // Get the kilometers from the TextField.
      String str = kilometerTextField.getText();
      
      // Convert kilometers to miles.
      double miles = Double.parseDouble(str) * CONVERSION_FACTOR;
      
      // Display the converted distance.
      outputLabel.setText(str + " kilometers is " + miles + " miles."); 
   }
}