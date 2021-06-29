import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

/**
 *  CheckBox Demo application
 */

public class PizzaToppings extends Application
{
   // Fields
   CheckBox pepperoniCheckBox;
   CheckBox cheeseCheckBox;
   CheckBox anchoviesCheckBox;
   Label totalLabel;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Create the CheckBoxes.
      pepperoniCheckBox = new CheckBox("Pepperoni $3.00");
      cheeseCheckBox = new CheckBox("Cheese $2.00");
      anchoviesCheckBox = new CheckBox("Anchovies $1.00");
      
      // Create the Button control.
      Button totalButton = new Button("Get Total");

      // Register the event handler.
      totalButton.setOnAction(new TotalButtonHandler());
      
      // Create a Label for the total.
      totalLabel = new Label("$0.00");
      
      // Put the CheckBoxes in a VBox.
      VBox checkBoxVBox = new VBox(10, pepperoniCheckBox,
                                   cheeseCheckBox, anchoviesCheckBox);
      
      // Create another VBox to use as the root node.
      VBox mainVBox = new VBox(10, checkBoxVBox, totalButton,
                               totalLabel);
      
      // Set the main VBox's alignment to center.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Set the main VBox's padding to 10 pixels.
      mainVBox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(mainVBox);

      // Add the Scene to the Stage.
      primaryStage.setScene(scene);
      
      // Show the window.
      primaryStage.show();   
   }
   
   /*
    * Event handler class for totalButton
    */
    
   class TotalButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         // Variable to hold the result
         double result = 0;
         
         // Add up the toppings.
         if (pepperoniCheckBox.isSelected())
            result += 3.0;
         
         if (cheeseCheckBox.isSelected())
            result += 2.0;
         
         if (anchoviesCheckBox.isSelected())
            result += 1.0;
         
         // Display the results.
         totalLabel.setText(String.format("$%,.2f", result));
      }
   }
}