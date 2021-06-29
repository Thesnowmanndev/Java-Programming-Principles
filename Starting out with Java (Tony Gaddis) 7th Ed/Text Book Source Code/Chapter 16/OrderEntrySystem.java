import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.sql.SQLException;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class OrderEntrySystem extends Application
{
   // Fields for input
   private ListView<String> customerListView;
   private ListView<String> coffeeListView;
   private TextField qtyTextField;
   private TextField orderDateTextField;
   
   // Constants
   final int LV_WIDTH = 150;
   final int LV_HEIGHT = 75;
   final double SPACING = 10.0;
   
   private void buildGUI(Stage stage)
   {
      // Build the customer selection area.
      Label customerPrompt = new Label("Select a Customer");
      customerListView = new ListView<String>();
      customerListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
      VBox customerVBox = new VBox(SPACING, customerPrompt,
                                   customerListView);
      customerVBox.setAlignment(Pos.CENTER);
      customerVBox.setPadding(new Insets(SPACING));
      
      // Build the coffee selection area
      Label coffeePrompt = new Label("Select a Coffee");
      coffeeListView = new ListView<String>();
      coffeeListView.setPrefSize(LV_WIDTH, LV_HEIGHT);
      VBox coffeeVBox = new VBox(10, coffeePrompt,
                                 coffeeListView);
      coffeeVBox.setAlignment(Pos.CENTER);
      coffeeVBox.setPadding(new Insets(SPACING));
      
      // Build the qunatity and date entry areas.
      Label qtyPrompt = new Label("Quantity");
      qtyTextField = new TextField();
      
      Label datePrompt = new Label("Order Date");
      orderDateTextField = new TextField();
      VBox orderVBox = new VBox(SPACING, qtyPrompt, qtyTextField,
                                datePrompt, orderDateTextField);
      orderVBox.setAlignment(Pos.CENTER);
      orderVBox.setPadding(new Insets(SPACING));
      
      // Build the button area.
      Button submitButton = new Button("Submit");
      Button exitButton = new Button("Exit");
      HBox buttonHBox = new HBox(SPACING, submitButton, exitButton);
      buttonHBox.setAlignment(Pos.CENTER);
      buttonHBox.setPadding(new Insets(SPACING));
      
      // Register event handlers for the Button controls.
      submitButton.setOnAction(new SubmitButtonHandler());
      exitButton.setOnAction(e ->
      {
         // Close the stage, end the application.
         stage.close();
      });
      
      // Put everything inside a BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setLeft(customerVBox);
      borderPane.setCenter(coffeeVBox);
      borderPane.setRight(orderVBox);
      borderPane.setBottom(buttonHBox);
      
      // Set the title bar text.
      stage.setTitle("Order Entry System");
      
      // Create a scene and add it to the stage
      Scene scene = new Scene(borderPane);
      stage.setScene(scene);
   }
   
   /**
    * The loadData method loads customer names and
    * coffee names into the ListView controls.
    */
    
   private void loadData()
   {
      try
      {
         // Load customer names into the ListView.
         customerListView.getItems().setAll(
                 CoffeeDBManager.getCustomerNames());
         
         // Load coffee names into the ListView.
         coffeeListView.getItems().setAll(
                 CoffeeDBManager.getCoffeeNames());
      }
      catch (SQLException e)
      {
         e.printStackTrace();
         System.exit(0);
      }
   }
   
   public static void main(String[] args)
   {
      // Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Build the GUI.
      buildGUI(primaryStage);
         
      // Load data from the database.
      loadData();

      // Show the stage.
      primaryStage.show();
   }
   
   /**
    * Event handler class for submitButton
    */
 
   class SubmitButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         try
         {
            // Get the customer name from the ListView
            String customerName =
               customerListView.getSelectionModel().getSelectedItem();
            
            // Get the coffee name from the ListView
            String coffeeName =
               coffeeListView.getSelectionModel().getSelectedItem();
            
            // Get the quantity
            int qty = Integer.parseInt(qtyTextField.getText());
            
            // Get the order date
            String orderDate = orderDateTextField.getText();
            
            // Get the customer number from the DB
            String customerNum =
               CoffeeDBManager.getCustomerNum(customerName);
            
            // Get the coffee product number from the DB
            String prodNum = CoffeeDBManager.getProdNum(coffeeName);
            
            // Get the price per pound from the DB
            double price = CoffeeDBManager.getCoffeePrice(prodNum);
            
            // Submit the order to the DB
            CoffeeDBManager.submitOrder(customerNum, prodNum, qty,
                                        price, orderDate);
                                  
            // Clear the text fields
            qtyTextField.clear();
            orderDateTextField.clear();
         }
         catch (SQLException e)
         {
            e.printStackTrace();
            System.exit(0);
         }
      }
   }
}