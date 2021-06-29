import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

/**
 *  A JavaFX Hello World application
 */

public class HelloWorld2 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label component.
      Label messageLabel = new Label("Hello World");
      
      // Put the Label in an HBox.
      HBox hbox = new HBox(messageLabel);
      
      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(hbox, 300, 100);
      
      // Set the scene's alignment to center.
      hbox.setAlignment(Pos.CENTER);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("My First Scene");
      
      // Show the window.
      primaryStage.show();
   }
}