import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class ImageViewDemoController 
{
    // Private fields for components 
    @FXML
    private ImageView myImage;

    @FXML
    private ToggleGroup myToggleGroup;

    @FXML
    private RadioButton dogRadioButton;

    @FXML
    private RadioButton catRadioButton;
    
    // Private fields for the dog and cat images
    private Image dogImage;
    private Image catImage;

    // Initialize method
    public void initialize() 
    {
      // Load the dog and cat images
      dogImage = new Image("Dog.jpg");
      catImage = new Image("Cat.jpg");
    }
    
    // Event listener for the dogRadioButton
    public void dogRadioButtonListener() 
    {
      if (dogRadioButton.isSelected())
         myImage.setImage(dogImage);
    }

    // Event listener for the catRadioButtonListener
    public void catRadioButtonListener() 
    {
      if (catRadioButton.isSelected())
         myImage.setImage(catImage);
    }
}
