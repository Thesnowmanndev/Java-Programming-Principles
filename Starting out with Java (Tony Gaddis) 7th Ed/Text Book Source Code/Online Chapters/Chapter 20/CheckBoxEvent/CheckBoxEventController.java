import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

public class CheckBoxEventController 
{
    @FXML
    private CheckBox myCheckBox;

    @FXML
    private Label outputLabel;

    // Event listener for myCheckBox
    public void myCheckBoxListener() 
    {
      if (myCheckBox.isSelected())
         outputLabel.setText("The CheckBox is selected.");
      else
         outputLabel.setText("The CheckBox is not selected.");
    }
}
