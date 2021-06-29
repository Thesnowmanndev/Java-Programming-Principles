import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class VideoDemo extends Application
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
      
      // Create the MediaPlayer and set AutoPlay to true.
      MediaPlayer player = new MediaPlayer(media);
      player.setAutoPlay(true);
      
      // Create the MediaView.
      MediaView view = new MediaView(player);
      
      // Set the viewing dimensions.
      view.setFitWidth(WIDTH);
      view.setFitHeight(HEIGHT);
      
      // Put the MediaView in an HBox.
      HBox hbox = new HBox(view);
      
      // Create a Scene, put it on the stage, and display it.
      Scene scene = new Scene(hbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}