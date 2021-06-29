import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.event.EventHandler;

public class KeyPressDemo extends Application
{
   private int count = 0;    // To keep count of key presses
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label control.
      Label label = new Label("0");
      
      // Put the Label in an HBox.
      HBox hbox = new HBox(10, label);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));

      // Create a Scene with the HBox as its root node.
      Scene scene = new Scene(hbox);

      // Register a KEY_PRESSED handler for the scene.
      scene.setOnKeyPressed(event ->
      {
         count++;
         label.setText(String.format("%d", count));
      });

      // Set the scene on the stage and dispaly it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}