import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonEventController 
{
    @FXML
    private RadioButton carnivoreRadioButton;

    @FXML
    private ToggleGroup myToggleGroup;

    @FXML
    private Label outputLabel;

    @FXML
    private Button showChoiceButton;

    @FXML
    private RadioButton veganRadioButton;

    @FXML
    private RadioButton vegetarianRadioButton;

    // Event listener for the veganRadioButton
    public void veganListener() 
    {
      if (veganRadioButton.isSelected())
         outputLabel.setText("Vegan");
    }

    // Event listener for the vegetarianRadioButton
    public void vegetarianListener() 
    {
      if (vegetarianRadioButton.isSelected())
         outputLabel.setText("Vegetarian");
    }

    // Event listener for the carnivoreRadioButton
    public void carnivoreListener() 
    {
      if (carnivoreRadioButton.isSelected())
         outputLabel.setText("Carnivore");
    }
}
