import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  A TextField Demo
 */

public class TextFieldDemo extends Application
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
      Label myLabel = new Label("Enter some text and click the button:");
      
      // Create a TextField control.
      TextField myTextField = new TextField();
      
      // Create a Button control.
      Button myButton = new Button("Click Me");
      
      // Put the Label and TextField in an HBox with 10 pixels of spacing.
      HBox hbox = new HBox(10, myLabel, myTextField);
      hbox.setPadding(new Insets(10));
      
      // Put the HBox and Button in a VBox with 10 pixels of spacing.
      VBox vbox = new VBox(10, hbox, myButton);
      vbox.setPadding(new Insets(10));
      
      // Create a Scene with the VBox as its root node.
      Scene scene = new Scene(vbox);
      
      // Set the scene's alignment to center.
      vbox.setAlignment(Pos.CENTER);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("TextField Demo");
      
      // Show the window.
      primaryStage.show();
   }
   
   class ButtonClickHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         
      }
   }
}