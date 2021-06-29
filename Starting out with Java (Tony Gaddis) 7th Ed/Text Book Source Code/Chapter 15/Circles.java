import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

public class Circles extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 440.0;
      final double SCENE_HEIGHT = 440.0;
      
      // Constants for the starting values
      final double CENTER_X = 220.0;
      final double CENTER_Y = 220.0;
      final double RAD = 20.0;
      final int NUM_CIRCLES = 10;

      // Create an empty Pane.
      Pane pane = new Pane();
      
      // Recursively add 10 circles to the Pane.
      drawCircles(pane, NUM_CIRCLES, CENTER_X, CENTER_Y, RAD);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   /**
    * The drawCircles method draws concentric circles.
    * It accepts the following arguments:
    * p -- a Pane object to add the circles to
    * n -- the number of circles to draw
    * x -- x coordinate of the circle's center point
    * y -- y coordinate of the circle's center point
    * rad -- the circle's radius
    */
   
   private void drawCircles(Pane p, int n, double x, double y, double rad)
   {
      if (n > 0)
      {
         Circle circle = new Circle(x, y, rad);  // Create the circle
         circle.setStroke(Color.BLACK);          // Line color is black
         circle.setFill(null);                   // No fill color
         p.getChildren().addAll(circle);         // Add the it to the Pane
         drawCircles(p, n - 1, x, y, rad + 20);  // Draw the next circle
      }
   }
}