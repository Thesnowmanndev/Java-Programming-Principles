import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.control.Slider;

/**
 *  An Image Demo
 */

public class ColorAdjustDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the sliders.
      final double MIN = -1.0, MAX = 1.0, INITIAL = 0.0;
      
      // Create a ColorAdjust effect.
      ColorAdjust colorAdjust = new ColorAdjust();
      
      // Create Image & ImageView components.
      Image image = new Image("file:flower.jpg");
      ImageView imageView = new ImageView(image);
      imageView.setEffect(colorAdjust);
      
      // Create the hue slider.
      Slider hueSlider = new Slider(MIN, MAX, INITIAL);
      hueSlider.setShowTickMarks(true);
      hueSlider.setShowTickLabels(true);
      hueSlider.setMajorTickUnit(0.25f);
      hueSlider.setBlockIncrement(0.1f);
      
      // Create an event handler.
      hueSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setHue(newvalue.doubleValue()); 
      });
      
      // Create the saturation slider.
      Slider satSlider = new Slider(MIN, MAX, INITIAL);
      satSlider.setShowTickMarks(true);
      satSlider.setShowTickLabels(true);
      satSlider.setMajorTickUnit(0.25f);
      satSlider.setBlockIncrement(0.1f);
      
      // Create an event handler.
      satSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setSaturation(newvalue.doubleValue()); 
      });
      
      // Create the brightness slider.
      Slider brightSlider = new Slider(MIN, MAX, INITIAL);
      brightSlider.setShowTickMarks(true);
      brightSlider.setShowTickLabels(true);
      brightSlider.setMajorTickUnit(0.25f);
      brightSlider.setBlockIncrement(0.1f);
      
      // Create an event handler.
      brightSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setBrightness(newvalue.doubleValue()); 
      });
      
      // Create the contrast slider.
      Slider contrastSlider = new Slider(MIN, MAX, INITIAL);
      contrastSlider.setShowTickMarks(true);
      contrastSlider.setShowTickLabels(true);
      contrastSlider.setMajorTickUnit(0.25f);
      contrastSlider.setBlockIncrement(0.1f);
      
      // Create an event handler.
      contrastSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> 
      {
         colorAdjust.setContrast(newvalue.doubleValue()); 
      });
            
      // Put the ImageView in an HBox.
      HBox hbox = new HBox(imageView);
      
      // Put the sliders in a VBox.
      VBox vbox = new VBox(10, hueSlider, satSlider, brightSlider, contrastSlider);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      
      // Put the HBox and VBox in a BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(hbox);
      borderPane.setBottom(vbox);
      
      // Create a Scene with the BorderPane as its root node.
      Scene scene = new Scene(borderPane);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Hot Air Balloon");
      
      // Show the window.
      primaryStage.show();
   }
}