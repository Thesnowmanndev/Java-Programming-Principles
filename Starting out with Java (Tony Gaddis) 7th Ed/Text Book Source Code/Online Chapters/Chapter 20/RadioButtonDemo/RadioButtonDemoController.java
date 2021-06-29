import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonDemoController 
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

    // Event listener for the showChoiceButton component
    public void showChoiceListener() 
    {
      if (veganRadioButton.isSelected())
         outputLabel.setText("Vegan");
         
      if (vegetarianRadioButton.isSelected())
         outputLabel.setText("Vegetarian");
         
      if (carnivoreRadioButton.isSelected())
         outputLabel.setText("Carnivore");     
    }
}
