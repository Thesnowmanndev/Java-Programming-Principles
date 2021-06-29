import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo5 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label and a Button.
      Label myLabel = new Label("Hello world!");
      Button myButton = new Button("Click Me");
      
      // Put the controls in a VBox.
      VBox vbox = new VBox(10, myLabel, myButton);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(10));
      
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      scene.getStylesheets().add("demo5.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}