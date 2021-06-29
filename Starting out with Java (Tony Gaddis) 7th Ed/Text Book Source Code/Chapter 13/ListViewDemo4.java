import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo4 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the ListView sizes
      final double WIDTH = 120, HEIGHT = 140;
      
      // Create a ListView of the names of the months.
      ListView<String> listView1 = new ListView<>();
      listView1.setPrefSize(WIDTH, HEIGHT);
      listView1.getSelectionModel().setSelectionMode(
           SelectionMode.MULTIPLE);
      listView1.getItems().addAll(
           "January", "February", "March", "April", "May",
           "June", "July", "August", "September", "October",
           "November", "December");
      
      // Create an empty ListView to show the selections.
      ListView<String> listView2 = new ListView<>();
      listView2.setPrefSize(WIDTH, HEIGHT);
      
      // Create a Button to get the selections.
      Button getButton = new Button("Get Selections");
      
      // Register an event handler for the Button.
      getButton.setOnAction(event ->
      {
         // Get the ObservableList of selected items.
         ObservableList<String> selections =
            listView1.getSelectionModel().getSelectedItems();
         
         // Add the selections to the 2nd ListView.
         listView2.getItems().setAll(selections);
      });
      
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, listView1, 
                           listView2, getButton);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}