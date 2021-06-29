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
 *  An Event Demo
 */

public class EventDemo extends Application
{
   // Field for the Label control
   private Label myLabel;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label control.
      myLabel = new Label("Click the button to see a message.");
      
      // Create a Button control.
      Button myButton = new Button("Click Me");
      
      // Register the event handler.
      myButton.setOnAction(new ButtonClickHandler());
      
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
   
   /*
    * Event handler class for myButton
    */
    
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         myLabel.setText("Thanks for clicking the button!");
      }
   }
}