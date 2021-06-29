import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class RotateText extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 275.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Constants for the text
      final double X = 30.0, Y = 100.0;
      final double FONT_SIZE = 38;
      final double ANGLE = 45.0;
      
      // Create a Text object.
      Text text = new Text(X, Y, "Hello World");
      text.setFont(new Font("SansSerif", FONT_SIZE));
      text.setRotate(ANGLE);
       
      // Add the square to a Pane.
      Pane pane = new Pane(text);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}