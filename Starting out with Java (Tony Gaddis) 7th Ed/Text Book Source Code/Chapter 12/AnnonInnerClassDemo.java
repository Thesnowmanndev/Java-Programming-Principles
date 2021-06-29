import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  A Button Demo with an Annonymous Inner Class
 */

public class AnnonInnerClassDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label control.
      Label myLabel = new Label("Click the button to see a message.");
      
      // Create a Button control.
      Button myButton = new Button("Click Me");
      myButton.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent event)
         {
            myLabel.setText("Thank you for clicking the button.");
         }
      });
      
      // Put the Label and Button in a VBox with 10 pixels of spacing.
      VBox vbox = new VBox(10, myLabel, myButton);
      
      // Create a Scene with the VBox as its root node.
      Scene scene = new Scene(vbox, 300, 100);
      
      // Set the scene's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Button Demo");
      
      // Show the window.
      primaryStage.show();
   }
}