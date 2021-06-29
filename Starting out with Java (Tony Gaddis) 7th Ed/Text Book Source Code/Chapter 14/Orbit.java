import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class Orbit extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene size
      final double SCENE_WIDTH = 450.0;
      final double SCENE_HEIGHT = 120.0;
      
      // Constants for the planet, orbit, and moon
      final double PLANET_X = 224.0;
      final double PLANET_Y = 59.0;
      final double PLANET_RAD = 25.0;
      
      final double ORBIT_RAD_X = 200.0;
      final double ORBIT_RAD_Y = 50.0;
      
      final double MOON_X = 24.0;
      final double MOON_Y = 59.0;
      final double MOON_RAD = 10.0;
      
      // Draw the planet.
      Circle planet = new Circle(PLANET_X, PLANET_Y,
                                 PLANET_RAD, Color.BLUE);

      // Draw the elliptical orbit path.
      Ellipse orbitPath = new Ellipse(PLANET_X, PLANET_Y,
                                      ORBIT_RAD_X, ORBIT_RAD_Y);
      orbitPath.setFill(null);
      orbitPath.setStroke(Color.BLACK);
      
      // Draw the moon.
      Circle moon = new Circle(MOON_X, MOON_Y,
                               MOON_RAD, Color.DARKGRAY);
      
      // Add the boxes to a Pane.
      Pane pane = new Pane(planet, orbitPath, moon);
      
      // Create a Scene and display it.
      Scene scene = new Scene(pane, SCENE_WIDTH, SCENE_HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}