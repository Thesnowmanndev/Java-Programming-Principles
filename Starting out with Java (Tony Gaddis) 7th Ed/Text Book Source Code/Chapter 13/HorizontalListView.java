import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class HorizontalListView extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a horizontal ListView.
      ListView<String> listView = new ListView<>();
      listView.getItems().addAll("Monday", "Tuesday", "Wednesday",
                                 "Thursday", "Friday", "Saturday",
                                 "Sunday");
      listView.setOrientation(Orientation.HORIZONTAL);
      listView.setPrefSize(200, 50);
      
      // Add the controls to an HBox.
      HBox hbox = new HBox(listView);
      hbox.setPadding(new Insets(10));
      hbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(hbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}