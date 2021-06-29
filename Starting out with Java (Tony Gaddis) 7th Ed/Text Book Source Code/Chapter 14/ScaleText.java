import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class ScaleText extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 265.0;
      final double SCENE_HEIGHT = 200.0;
      
      // Constants for the text
      final double X1 = 30.0, Y1 = 100.0;
      final double X2 = 30.0, Y2 = 130.0;
      final double X3 = 30.0, Y3 = 150.0;
      final double FONT_SIZE = 38;
      final double SCALE_HALF = 0.5;
      final double SCALE_QTR = 0.25;
      
      // Create three Text objects.
      Text text1 = new Text(X1, Y1, "Hello World");
      text1.setFont(new Font("SansSerif", FONT_SIZE));
      
      Text text2 = new Text(X2, Y2, "Hello World");
      text2.setFont(new Font("SansSerif", FONT_SIZE));
      text2.setScaleX(SCALE_HALF);
      text2.setScaleY(SCALE_HALF);

      Text text3 = new Text(X3, Y3, "Hello World");
      text3.setFont(new Font("SansSerif", FONT_SIZE));
      text3.setScaleX(SCALE_QTR);
      text3.setScaleY(SCALE_QTR);

      // Add the text to a Pane.
      Pane pane = new Pane(text1, text2, text3);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}