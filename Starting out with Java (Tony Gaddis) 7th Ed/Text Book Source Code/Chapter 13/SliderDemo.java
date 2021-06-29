import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class SliderDemo extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Slider constants
      final double MIN = 0.0, MAX = 100.0, INITIAL = 0.0;
      final double MAJOR_TICK_UNIT = 20.0;
      final int MINOR_TICK_COUNT = 5;
      final double SLIDER_WIDTH = 300.0;
      
      // Miscellaneous constants
      final double LABEL_WIDTH = 50.0;
      final double SPACING = 10.0;
      
      // Create the Fahrenheit controls.
      Label fDescriptor = new Label("Fahrenheit: ");
      Label fLabel = new Label("32.0");
      fLabel.setStyle("-fx-border-style: solid;" +
                      "-fx-alignment: center");
      fLabel.setPrefWidth(LABEL_WIDTH);
      HBox fHBox = new HBox(SPACING, fDescriptor, fLabel);
      fHBox.setAlignment(Pos.CENTER);
      
      // Create the Celsius controls.
      Label cDescriptor = new Label("Celsius: ");
      Label cLabel = new Label("0.0");
      cLabel.setStyle("-fx-border-style: solid;" +
                      "-fx-alignment: center");
      cLabel.setPrefWidth(LABEL_WIDTH);
      HBox cHBox = new HBox(SPACING, cDescriptor, cLabel);
      cHBox.setAlignment(Pos.CENTER);
        
      // Make the Slider.
      Slider slider = new Slider(MIN, MAX, INITIAL);
      slider.setShowTickMarks(true);
      slider.setMajorTickUnit(MAJOR_TICK_UNIT);
      slider.setMinorTickCount(MINOR_TICK_COUNT);
      slider.setShowTickLabels(true);
      slider.setSnapToTicks(true);
      slider.setPrefWidth(SLIDER_WIDTH);
      
      // Register an event handler for the Slider.
      slider.valueProperty().addListener(
         (observeable, oldvalue, newvalue) ->
         {
            // Get the Celsius temp from the Slider.
            double celsius = slider.getValue();
            
            // Convert Celsius to Fahrenheit.
            double fahrenheit = (9.0 / 5.0) * celsius + 32;
            
            // Display the Celsius and Fahrenheit temps.
            cLabel.setText(String.format("%.1f", celsius));
            fLabel.setText(String.format("%.1f", fahrenheit));
         });
      
      // Add the controls to an VBox.
      VBox vbox = new VBox(10, fHBox, cHBox, slider);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));
               
      // Create a Scene and display it.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
}