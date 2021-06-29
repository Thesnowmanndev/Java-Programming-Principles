import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;

public class RedTriangle extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Draw the first line from (160,20) to (310, 220).
      Line line1 = new Line(160, 20, 310, 220);
      
      // Draw the second line from (160,20) to (20,220).
      Line line2 = new Line(160, 20, 20, 220);
      
      // Draw the third line from (20,220) to (310, 220).
      Line line3 = new Line(20, 220, 310, 220);
      
      // Set each line's stroke color to red.
      line1.setStroke(Color.RED);
      line2.setStroke(Color.RED);
      line3.setStroke(Color.RED);
      
      // Add the lines to a Pane.
      Pane pane = new Pane(line1, line2, line3);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, 320, 240);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}