import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  Metric Converter application
 */

public class MetricConverter extends Application
{
   // Fields
   private TextField kiloTextField;
   private Label resultLabel;
   private RadioButton milesButton;
   private RadioButton feetButton;
   private RadioButton inchesButton;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create a Label to display a prompt.
      Label promptLabel = new Label("Enter a distance in kilometers:");
      
      // Create a TextField for input.
      kiloTextField = new TextField();
      
      // Create the RadioButton controls.
      milesButton = new RadioButton("Convert to Miles");
      feetButton = new RadioButton("Convert to Feet");
      inchesButton = new RadioButton("Convert to Inches");
      
      // Select the milesButton control.
      milesButton.setSelected(true);
      
      // Add the RadioButton controls to a ToggleGroup.
      ToggleGroup radioGroup = new ToggleGroup();
      milesButton.setToggleGroup(radioGroup);
      feetButton.setToggleGroup(radioGroup);
      inchesButton.setToggleGroup(radioGroup);
      
      // Create a Button to perform the conversion.
      Button calcButton = new Button("Convert");
      
      // Register the event handler.
      calcButton.setOnAction(new CalcButtonHandler());
            
      // Create an empty Label to display the result.
      resultLabel = new Label();
      
      // Put the promptLabel and the kiloTextField in an HBox.
      HBox promptHBox = new HBox(10, promptLabel, kiloTextField);
      
      // Put the RadioButtons in an HBox.
      HBox radioHBox = new HBox(20, milesButton, feetButton,
                                inchesButton);
      
      // Put everything in a VBox.
      VBox mainVBox = new VBox(10, promptHBox, radioHBox, calcButton,
                               resultLabel);
      
      // Set the VBox's alignment to center.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      mainVBox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(mainVBox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Set the stage title.
      primaryStage.setTitle("Metric Converter");
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for calcButton
    */
    
   class CalcButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Constants for the conversion factors.
         final double MILES_CONVERSION = 0.6214;
         final double FEET_CONVERSION = 3281.0;
         final double INCHES_CONVERSION = 39370.0;
         
         // Variable to hold the result
         double result = 0;
         
         // Get the kilometers.
         double kilometers = Double.parseDouble(kiloTextField.getText());
         
         // Perform the selected conversion.
         if (milesButton.isSelected())
            result = kilometers * MILES_CONVERSION;
         
         if (feetButton.isSelected())
            result = kilometers * FEET_CONVERSION;
         
         if (inchesButton.isSelected())
            result = kilometers * INCHES_CONVERSION;
         
         // Display the results.
         resultLabel.setText(String.format("%,.2f", result));
      }
   }
}