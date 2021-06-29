import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class MoveBall extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 200.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Constants for the ball
      final double START_X = 100.0, START_Y = 40.0;
      final double RADIUS = 40.0;
      final double STEP = 10.0;
      
      // Create the ball.
      Circle ball = new Circle(START_X, START_Y, RADIUS);
      ball.setFill(Color.RED);
      
      // Add the ball to a Pane.
      Pane pane = new Pane(ball);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      
      // Register a KEY_PRESSED handler for the scene.
      scene.setOnKeyPressed(event ->
      {
         // Get the ball's coordinates.
         double x = ball.getCenterX();
         double y = ball.getCenterY();
         
         // Check for the down-arrow key.
         if (event.getCode() == KeyCode.DOWN && 
             y < (SCENE_HEIGHT - RADIUS))
         {
            ball.setCenterY(y + STEP);
         }
         
         // Check for the up-arrow key.
         if (event.getCode() == KeyCode.UP && 
             y > RADIUS)
         {
            ball.setCenterY(y - STEP);
         }
         
         // Check for the right-arrow key.
         if (event.getCode() == KeyCode.RIGHT && 
             x < (SCENE_WIDTH - RADIUS))
         {
            ball.setCenterX(x + STEP);
         }
         
         // Check for the left-arrow key.
         if (event.getCode() == KeyCode.LEFT && 
             x > RADIUS)
         {
            ball.setCenterX(x - STEP);
         }
      });

      // Set the scene on the stage and display it.
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}