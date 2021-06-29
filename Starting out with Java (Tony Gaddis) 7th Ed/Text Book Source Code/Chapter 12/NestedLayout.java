import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

/**
 *  A demonstration of nested layouts
 */

public class NestedLayout extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create Image objects.
      Image finlandImage = new Image("file:Finland.png");
      Image germanyImage = new Image("file:Germany.png");
      
      // Create the ImageView objects.
      ImageView finlandIView = new ImageView(finlandImage);
      ImageView germanyIView = new ImageView(germanyImage);
      
      // Create a Label control.
      Label messageLabel = new Label("Flags of Finland and Germany");
      
      // Create a VBox layout container for the images.
      VBox vbox = new VBox(10, finlandIView, germanyIView);
      
      // Create a GridPane layout container.
      GridPane gridpane = new GridPane();
      
      // Add the Label and the VBox to the GridPane.
      gridpane.add(messageLabel, 0, 0);    // Column 0, Row 0
      gridpane.add(vbox, 1, 0);            // Column 1, Row 0
      
      // Set the gap size between the Gridpane's columns.
      gridpane.setHgap(10);
      
      // Set the GridPane's padding.
      gridpane.setPadding(new Insets(20));
      
      // Create a Scene with the GridPane as its root node.
      Scene scene = new Scene(gridpane);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}