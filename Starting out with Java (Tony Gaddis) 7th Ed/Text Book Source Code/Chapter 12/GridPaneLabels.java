import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.geometry.Insets;

/**
 *  GridPane Demo
 */

public class GridPaneLabels extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create some Label controls.
      Label label1 = new Label("This is label1");
      Label label2 = new Label("This is label2");
      Label label3 = new Label("This is label3");
      Label label4 = new Label("This is label4");
      
      // Create a GridPane.
      GridPane gridpane = new GridPane();
      
      // Add the Labels to the GridPane.
      gridpane.add(label1, 0, 0);
      gridpane.add(label2, 1, 0);
      gridpane.add(label3, 0, 1);
      gridpane.add(label4, 1, 1);
      gridpane.setHgap(10);
      gridpane.setVgap(10);
      gridpane.setPadding(new Insets(10));

      // Create a Scene with the GridPane as its root node.
      // The Scene is 200 pixels wide by 100 pixels high.
      Scene scene = new Scene(gridpane, 200, 100);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}