import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class RotateBox extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 160.0;
      final double SCENE_HEIGHT = 160.0;
      
      // Constants for the rectangle
      final double X = 30.0, Y = 40.0;
      final double WIDTH = 100.00, HEIGHT = 75.0;
      final double ANGLE = 45.0;
      
      // Create a rectangle.
      Rectangle box = new Rectangle(X, Y, WIDTH, HEIGHT);
      box.setRotate(ANGLE);
       
      // Add the square to a Pane.
      Pane pane = new Pane(box);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}