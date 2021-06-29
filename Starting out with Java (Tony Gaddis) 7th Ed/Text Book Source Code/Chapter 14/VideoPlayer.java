import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.control.Button;

public class VideoPlayer extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the video dimensions
      final double WIDTH = 640.0, HEIGHT = 480.0;
      
      // Load the video file.
      File videoFile = new File("TakeOff.mp4");
      Media media = new Media(videoFile.toURI().toString());
      
      // Create the MediaPlayer.
      MediaPlayer player = new MediaPlayer(media);

      // Event handler for the OnEndOfMedia event
      player.setOnEndOfMedia(() ->
      {
         player.stop();
      });
      
      // Create the MediaView.
      MediaView view = new MediaView(player);
      
      // Set the viewing dimensions.
      view.setFitWidth(WIDTH);
      view.setFitHeight(HEIGHT);
      
      // Create the buttons.
      Button playButton = new Button("Play");
      Button pauseButton = new Button("Pause");
      Button stopButton = new Button("Stop");
      
      // Event handler for the play Button
      playButton.setOnAction(event ->
      {
         player.play();
      });

      // Event handler for the pause Button
      pauseButton.setOnAction(event ->
      {
         player.pause();
      });

      // Event handler for the stop Button
      stopButton.setOnAction(event ->
      {
         player.stop();
      });
      
      // Put the Buttons in an HBox.
      HBox hbox = new HBox(10, playButton, pauseButton, stopButton);
      hbox.setAlignment(Pos.CENTER);
      hbox.setPadding(new Insets(10));

      // Put everything in a BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setCenter(view);
      borderPane.setBottom(hbox);
      
      // Create a Scene, put it on the stage, and display it.
      Scene scene = new Scene(borderPane);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}