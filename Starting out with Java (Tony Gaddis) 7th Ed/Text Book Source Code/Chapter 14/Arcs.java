import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Arcs extends Application
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
      
      // Common attributes for the arcs
      final double X = 160.0;
      final double Y = 120.0;
      final double X_RAD = 100.00;
      final double Y_RAD = 100.0;
      
      // Constants for the arc angles
      final double PIE1_START = 0.0;
      final double PIE1_LENGTH = 45.0;
      final double PIE2_START = 45.0;
      final double PIE2_LENGTH = 90.0;
      final double PIE3_START = 135.0;
      final double PIE3_LENGTH = 120.0;
      
      // Draw a circle outline.
      Circle outline = new Circle(X, Y, X_RAD, Color.WHITE);
      outline.setStroke(Color.BLACK);
      
      // Draw the first pie-slice.
      Arc pieSlice1 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE1_START, PIE1_LENGTH);
      pieSlice1.setFill(Color.RED);
      pieSlice1.setType(ArcType.ROUND);
      
      // Draw the second pie-slice.
      Arc pieSlice2 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE2_START, PIE2_LENGTH);
      pieSlice2.setFill(Color.LIGHTGREEN);
      pieSlice2.setType(ArcType.ROUND);

      // Draw the third pie-slice.
      Arc pieSlice3 = new Arc(X,Y, X_RAD, Y_RAD,
                              PIE3_START, PIE3_LENGTH);
      pieSlice3.setFill(Color.BLACK);
      pieSlice3.setType(ArcType.ROUND);

      // Add the objects to a Pane.
      Pane pane = new Pane(outline, pieSlice1, pieSlice2,
                           pieSlice3);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}