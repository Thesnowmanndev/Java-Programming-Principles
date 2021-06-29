import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class CSSDemo9 extends Application
{
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create some Buttons.
      Button button1 = new Button("Button 1");
      button1.getStyleClass().add("button-black");
      
      Button button2 = new Button("Button 2");
      button2.getStyleClass().add("button-white");
      
      // Put the Buttons in an HBox.
      HBox hbox = new HBox(10, button1, button2);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));
      
      // Create a Scene and display it.
      Scene scene = new Scene(hbox);
      scene.getStylesheets().add("demo9.css");
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}