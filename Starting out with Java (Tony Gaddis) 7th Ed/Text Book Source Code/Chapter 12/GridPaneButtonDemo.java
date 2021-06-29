import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.control.Button;

/**
 *  GridPane Demo
 */

public class GridPaneButtonDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create six Button components.
      Button button1 = new Button("Button 1");
      Button button2 = new Button("Button 2");
      Button button3 = new Button("Button 3");
      Button button4 = new Button("Button 4");
      Button button5 = new Button("Button 5");
      Button button6 = new Button("Button 6");

      // Create the GridPane.
      GridPane gridpane = new GridPane();
      gridpane.setHgap(10);
      gridpane.setVgap(10);
      
      // Add the buttons to the GridPane.
      gridpane.add(button1, 0, 0);
      gridpane.add(button2, 1, 0);
      gridpane.add(button3, 0, 1);
      gridpane.add(button4, 1, 1);
      gridpane.add(button5, 2, 0);
      gridpane.add(button6, 2, 1);
            
      // Create a Scene with the VBox as its root node.
      // The Scene is 300 pixels wide by 100 pixels high.
      Scene scene = new Scene(gridpane, 300, 100);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("GridPane");
      
      // Show the window.
      primaryStage.show();
   }
}