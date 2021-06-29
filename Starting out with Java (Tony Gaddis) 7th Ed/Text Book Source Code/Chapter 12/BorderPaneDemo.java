import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

/**
 *  A BorderPane Demo
 */

public class BorderPaneDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create some buttons.
      Button centerButton = new Button("This is Center");
      Button topButton = new Button("This is Top");
      Button bottomButton = new Button("This is Bottom");
      Button leftButton = new Button("This is Left");
      Button rightButton = new Button("This is Right");
      
      // Add each button to its own layout container.
      HBox centerHBox = new HBox(centerButton);
      HBox topHBox = new HBox(topButton);
      HBox bottomHBox = new HBox(bottomButton);
      VBox leftVBox = new VBox(leftButton);
      VBox rightVBox = new VBox(rightButton);

      // Set the alignment for the top and bottom.
      topHBox.setAlignment(Pos.CENTER);
      bottomHBox.setAlignment(Pos.CENTER);
      
      // Create a BorderPane.
      BorderPane borderPane = new BorderPane();
      
      // Add the buttons to the BorderPane’s regions.
      borderPane.setCenter(centerHBox);
      borderPane.setTop(topHBox);
      borderPane.setBottom(bottomHBox);
      borderPane.setLeft(leftVBox);
      borderPane.setRight(rightVBox);

      // Create a Scene with the BorderPane as its root node.
      Scene scene = new Scene(borderPane);
      
      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();
   }
}