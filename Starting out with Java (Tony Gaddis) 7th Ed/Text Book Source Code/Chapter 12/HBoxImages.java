import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *  This program displays images in an Hbox.
 */

public class HBoxImages extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create the Image components.
      Image moonImage = new Image("file:Moon.jpg");
      Image shipImage = new Image("file:Ship.jpg");
      Image sunsetImage = new Image("file:Sunset.jpg");
      
      // Create the ImageView components.
      ImageView moonIView = new ImageView(moonImage);
      ImageView shipIView = new ImageView(shipImage);
      ImageView sunsetIView = new ImageView(sunsetImage);
      
      // Resize the moon image, preserving its aspect ratio.
      moonIView.setFitWidth(200);
      moonIView.setPreserveRatio(true);
      
      // Resize the ship image, preserving its aspect ratio.
      shipIView.setFitWidth(200);
      shipIView.setPreserveRatio(true);

      // Resize the sunset image, preserving its aspect ratio.
      sunsetIView.setFitWidth(200);
      sunsetIView.setPreserveRatio(true);  
      
      // Put the ImageViews in an HBox.
      HBox hbox = new HBox(moonIView, shipIView, sunsetIView);
      
      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(hbox);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Images");
      
      // Show the window.
      primaryStage.show();
   }
}