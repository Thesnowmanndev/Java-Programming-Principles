import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class CheckBoxDemoController 
{
    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label outputLabel;

    @FXML
    private Button okButton;

    // Event listener for the okButton component
    public void okButtonListener() 
    {
      if (myCheckBox.isSelected())
         outputLabel.setText("The CheckBox is selected.");
      else
         outputLabel.setText("The CheckBox is not selected.");
    }
}
