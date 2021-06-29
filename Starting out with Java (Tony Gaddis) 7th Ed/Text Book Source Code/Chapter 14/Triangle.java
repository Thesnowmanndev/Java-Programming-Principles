import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class Triangle extends Application
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
      
      // Constants for the triangle corners.
      final double TOP_X = 160.0;
      final double TOP_Y = 20.0;
      final double BOTTOM_RIGHT_X = 310.0;
      final double BOTTOM_RIGHT_Y = 220.0;
      final double BOTTOM_LEFT_X = 20.0;
      final double BOTTOM_LEFT_Y = 220.0;
      
      // Draw the first line, from the top of the triangle
      // to the bottom-right corner.
      Line line1 = new Line(TOP_X, TOP_Y, BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);
      
      // Draw the second line, from the top of the triangle
      // to the bottom-left corner.
      Line line2 = new Line(TOP_X, TOP_Y, BOTTOM_LEFT_X, BOTTOM_LEFT_Y);
      
      // Draw the third line, from the bottom-left corner
      // of the triangle to the bottom-right corner.
      Line line3 = new Line(BOTTOM_LEFT_X, BOTTOM_LEFT_Y,
                            BOTTOM_RIGHT_X, BOTTOM_RIGHT_Y);
      
      // Add the lines to a Pane.
      Pane pane = new Pane(line1, line2, line3);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}