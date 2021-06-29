import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class MouseMovedDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
       launch(args);
   }
  
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 200.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Create a Label.
      Label label = new Label("Move the mouse.");     
      
      // Add the Label to a Pane.
      HBox hbox = new HBox(label);
      hbox.setAlignment(Pos.CENTER);
      
      // Create a Scene.
      Scene scene = new Scene(hbox, SCENE_WIDTH, SCENE_HEIGHT);
      
      // Register an event handler to the scene for 
      // the MOUSE_MOVED event.
      scene.setOnMouseMoved(event ->
      {
         // Get the mouse cursor's coordinates.
         double x = event.getSceneX();
         double y = event.getSceneY();
         
         // Display the mouse cursor's location.
         label.setText(String.format("%.0f, %.0f", x, y));
      });

      // Set the scene to the stage and display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
