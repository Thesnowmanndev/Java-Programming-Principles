import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class MouseEventDemo extends Application
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
      Circle ball = new Circle(CENTER_X, CENTER_Y, RADIUS);
      
      // Register mouse event handlers with the ball.
      ball.setOnMouseEntered(event -> 
      {
         ball.setFill(Color.RED);
      });
      
      ball.setOnMouseExited(event -> 
      {
         ball.setFill(Color.BLACK);
      });

      ball.setOnMousePressed(event -> 
      {
         ball.setFill(Color.GREEN);
      });
      
      // Add the ball to a Pane.
      Pane pane = new Pane(ball);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}