import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

public class MouseDraggedDemo extends Application
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
      
      // Constants for the ball
      final double CENTER_X = 100.0, CENTER_Y = 100.0;
      final double RADIUS = 40.0;
      
      // Create the ball.
      Circle circle = new Circle(CENTER_X, CENTER_Y, RADIUS);

      // Register an event handler for 
      // the MOUSE_DRAGGED event.
      circle.setOnMouseDragged(event ->
      {
         // Get the mouse cursor's coordinates.
         double x = event.getSceneX();
         double y = event.getSceneY();
         
         // Move the circle.
         circle.setCenterX(x);
         circle.setCenterY(y);
      });
      
      // Add the circle to a Pane.
      Pane pane = new Pane(circle);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}
