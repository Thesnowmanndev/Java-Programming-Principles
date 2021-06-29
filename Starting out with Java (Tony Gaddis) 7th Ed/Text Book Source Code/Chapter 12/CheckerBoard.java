import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class CheckerBoard extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 640.0;
      final double SCENE_HEIGHT = 480.0;
      
      // Constants for all box's width and height
      final double WIDTH = 160.0;
      final double HEIGHT = 120.0;
      
      // Constants for each box's (X,Y) coordinates
      final double BOX1_X = 160.0;
      final double BOX1_Y = 0.0;
      
      final double BOX2_X = 479.0;
      final double BOX2_Y = 0.0;
      
      final double BOX3_X = 0.0;
      final double BOX3_Y = 120.0;
      
      final double BOX4_X = 320.0;
      final double BOX4_Y = 120.0;
      
      final double BOX5_X = 160.0;
      final double BOX5_Y = 240.0;
      
      final double BOX6_X = 479.0;
      final double BOX6_Y = 240.0;
      
      final double BOX7_X = 0.0;
      final double BOX7_Y = 360.0;
      
      final double BOX8_X = 320.0;
      final double BOX8_Y = 360.0;
      
      // Create the boxes.
      Rectangle box1 = new Rectangle(BOX1_X, BOX1_Y, WIDTH, HEIGHT);
      Rectangle box2 = new Rectangle(BOX2_X, BOX2_Y, WIDTH, HEIGHT);
      Rectangle box3 = new Rectangle(BOX3_X, BOX3_Y, WIDTH, HEIGHT);
      Rectangle box4 = new Rectangle(BOX4_X, BOX4_Y, WIDTH, HEIGHT);
      Rectangle box5 = new Rectangle(BOX5_X, BOX5_Y, WIDTH, HEIGHT);
      Rectangle box6 = new Rectangle(BOX6_X, BOX6_Y, WIDTH, HEIGHT);
      Rectangle box7 = new Rectangle(BOX7_X, BOX7_Y, WIDTH, HEIGHT);
      Rectangle box8 = new Rectangle(BOX8_X, BOX8_Y, WIDTH, HEIGHT);

      // Add the boxes to a Pane.
      Pane pane = new Pane(box1, box2, box3, box4,
                           box5, box6, box7, box8);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}