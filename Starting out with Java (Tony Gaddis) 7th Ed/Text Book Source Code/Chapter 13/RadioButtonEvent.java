import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  A RadioButton ActionEvent Demo
 */

public class RadioButtonEvent extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create two Image objects.
      Image flowerImage = new Image("file:Flower.jpg");
      Image sunsetImage = new Image("file:Sunset.jpg");
      
      // Create an ImageView object.
      ImageView imageView = new ImageView(flowerImage);
      
      // Resize the ImageView, preserving its aspect ratio.
      imageView.setFitWidth(200);
      imageView.setPreserveRatio(true);
      
      // Put the ImageView in an HBox.
      HBox imageHBox = new HBox(imageView);
      
      // Center the HBox contents.
      imageHBox.setAlignment(Pos.CENTER);
      
      // Create the RadioButtons.
      RadioButton flowerRadio = new RadioButton("Flower");
      RadioButton sunsetRadio = new RadioButton("Sunset");
      
      // Select the flowerRadio control.
      flowerRadio.setSelected(true);
      
      // Add the RadioButtons to a ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      flowerRadio.setToggleGroup(radioGroup);
      sunsetRadio.setToggleGroup(radioGroup);
      
      // Register an ActionEvent handler for the flowerRadio.
      flowerRadio.setOnAction(event ->
      {
         imageView.setImage(flowerImage);
      });
      
      // Register an event handler for the sunsetRadio.
      sunsetRadio.setOnAction(event ->
      {
         imageView.setImage(sunsetImage);
      });
      
      // Add the RadioButtons to a VBox.
      VBox radioVBox = new VBox(10, flowerRadio, sunsetRadio);
      
      // Give the radioVBox some padding.
      radioVBox.setPadding(new Insets(30));
      
      // Add everything to a VBox.
      VBox mainVBox = new VBox(10, imageHBox, radioVBox);
      
      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(mainVBox);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}