import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class ListViewDemo2 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a ListView of Strings.
      ListView<String> listView = new ListView<>();
      listView.setPrefSize(120, 100);
      listView.getItems().addAll("Steve", "Bethany", "Will", "Katrina");
      
      // Create a Label to display the selection.
      Label selectedNameLabel = new Label("Select a Name");
      
      // Create a Button to get the selection.
      Button getButton = new Button("Get the Selection");
      
      // Create an event handler for the Button.
      getButton.setOnAction(event ->
      {
         // Determine whether an item is selected.
         if (listView.getSelectionModel().getSelectedIndex() != -1)
         {
            // Get the selected name.
            String selected = 
                    listView.getSelectionModel().getSelectedItem();
         
            // Display the selected name in the Label.
            selectedNameLabel.setText(selected);
         }
         else
         {
            selectedNameLabel.setText("Nothing Selected");
         }
      });
      
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, listView, selectedNameLabel, getButton);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}