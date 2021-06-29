import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;

public class ListViewDemo6 extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the ListView dimensions
      final double WIDTH = 425.0, HEIGHT = 200.0;
      
      // Create the Image objects.
      Image aceSpadesImage = new Image("file:Ace_Spades.png");
      Image kingSpadesImage = new Image("file:King_Spades.png");
      Image queenSpadesImage = new Image("file:Queen_Spades.png");
      
      // Create the ImageView controls.
      ImageView aceSpadesIV = new ImageView(aceSpadesImage);
      ImageView kingSpadesIV = new ImageView(kingSpadesImage);
      ImageView queenSpadesIV = new ImageView(queenSpadesImage);
      
      // Create a ListView for the ImageView objects.
      ListView<ImageView> listView = new ListView<>();
      listView.setPrefSize(WIDTH, HEIGHT);
      listView.setOrientation(Orientation.HORIZONTAL);
      listView.getItems().addAll(aceSpadesIV, kingSpadesIV,
                                 queenSpadesIV);
      
      // Array with the names of the cards
      String[] cardNames = {"Ace of Spades", "King of Spades",
                            "Queen of Spades"};
      
      // Create a Label to display the selection.
      Label outputLabel = new Label("Select a Card");
      
      // Create an event handler for the ListView control.
      listView.getSelectionModel().selectedItemProperty().addListener(event ->
      {
         // Get the index of the selected card.
         int index = listView.getSelectionModel().getSelectedIndex();
         
         // Display the selected card name in the Label.
         outputLabel.setText(cardNames[index]);
      });
      
      // Add the controls to a VBox.
      VBox vbox = new VBox(10, listView, outputLabel);
      vbox.setPadding(new Insets(10));
      vbox.setAlignment(Pos.CENTER);
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}