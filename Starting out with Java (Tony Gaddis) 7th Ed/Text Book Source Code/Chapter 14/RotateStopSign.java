import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class RotateStopSign extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene
      final double SCENE_WIDTH = 160.0;
      final double SCENE_HEIGHT = 160.0;
      final double ANGLE = 30.0;
      
      // Constants for the vertices.
      final double X1 = 60.0,  Y1 = 20.0;
      final double X2 = 100.0, Y2 = 20.0;
      final double X3 = 140.0, Y3 = 60.0;
      final double X4 = 140.0, Y4 = 100.0;
      final double X5 = 100.0, Y5 = 140.0;
      final double X6 = 60.0,  Y6 = 140.0;
      final double X7 = 20.0,  Y7 = 100.0;
      final double X8 = 20.0,  Y8 = 60.0;
      
      // Constants for the text
      final double TEXT_X = 35.0;
      final double TEXT_Y = 95.0;
      final double FONT_SIZE = 38.0;
      
      // Create an octagon.
      Polygon octagon = new Polygon(X1, Y1, X2, Y2,
                                    X3, Y3, X4, Y4,
                                    X5, Y5, X6, Y6,
                                    X7, Y7, X8, Y8);
      
      // Set the octagon's fill color to red.
      octagon.setFill(Color.RED);
      
      // Create a Text object.
      Text stopText = new Text(TEXT_X, TEXT_Y, "STOP");
      stopText.setStroke(Color.WHITE);
      stopText.setFill(Color.WHITE);
      stopText.setFont(new Font("SansSerif", FONT_SIZE));
      
      // Add the octagon to a Pane.
      Pane pane = new Pane(octagon, stopText);
      pane.setRotate(ANGLE);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}