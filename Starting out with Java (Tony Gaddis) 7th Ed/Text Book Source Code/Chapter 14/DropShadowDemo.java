import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;

public class DropShadowDemo extends Application
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
      
      // Constants for the Circle
      final double X = 100.0, Y = 100.0, RADIUS = 50.0;
            
      // Create a DropShadow
      DropShadow dropShadow = new DropShadow();
      
      // Create a Circle object.
      Circle myCircle = new Circle(X, Y, RADIUS, Color.RED);
      myCircle.setEffect(dropShadow);
       
      // Add the square to a Pane.
      Pane pane = new Pane(myCircle);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}