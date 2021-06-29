import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ComboBoxDemo1 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a ComboBox.
      ComboBox<String> comboBox = new ComboBox<>();
      comboBox.getItems().addAll("England", "Scotland",
                                 "Ireland", "Wales");
      
      // Create a Label.
      Label outputLabel = new Label("Select a Country");
      
      // Create a Button.
      Button button = new Button("Get Selection");
      button.setOnAction(event ->
      {
         outputLabel.setText(comboBox.getValue());
      });
   
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, comboBox, outputLabel, button);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}