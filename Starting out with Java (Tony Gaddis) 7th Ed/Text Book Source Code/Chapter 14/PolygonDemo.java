import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class PolygonDemo extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 320.0;
      final double SCENE_HEIGHT = 240.0;
      
      // Create a polygon.
      Polygon diamond = new Polygon(160.0, 20.0,  // Top
                                    300.0, 120.0, // Right
                                    160.0, 220.0, // Bottom
                                    20.0, 120.0); // Left

      // Add the polygon to a Pane.
      Pane pane = new Pane(diamond);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}