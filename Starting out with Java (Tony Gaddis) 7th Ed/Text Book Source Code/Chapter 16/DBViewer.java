import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import java.sql.*;

public class DBViewer extends Application
{
   // Database URL.
   final String DB_URL = "jdbc:derby:CoffeeDB";
   
   // Controls for input and output
   TextArea queryTextArea;
   TextArea resultsTextArea;
      
   public static void main(String[] args)
   {
      // Launch the application
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      final int COL_SIZE = 50;
      final int ROW_SIZE = 10;
      final double SPACING = 10.0;
      
      // Build the query entry area.
      queryTextArea = new TextArea();
      queryTextArea.setPrefColumnCount(COL_SIZE);
      queryTextArea.setPrefRowCount(ROW_SIZE);
      
      // Build the query results area.
      resultsTextArea = new TextArea();
      resultsTextArea.setPrefColumnCount(COL_SIZE);
      resultsTextArea.setPrefRowCount(ROW_SIZE);
      
      // Create the Submit button.
      Button submitButton = new Button("Submit");
      submitButton.setOnAction(new SubmitButtonHandler());
      
      // Put the controls in a VBox.
      VBox vbox = new VBox(SPACING, queryTextArea,
                           submitButton, resultsTextArea);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));
      
      // Set the title.
      primaryStage.setTitle("Enter a SELECT Query");

      // Create a scene and set it to the stage.
      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);
      
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
            // Clear the previous results.
            resultsTextArea.setText("");
            
            // Create a connection to the database.
            Connection conn = DriverManager.getConnection(DB_URL);
            
            // Create a Statement object.
            Statement stmt = conn.createStatement();
            
            // Execute the query.
            ResultSet resultSet = 
                    stmt.executeQuery(queryTextArea.getText());
            
            // Get the result set meta data.
            ResultSetMetaData meta = resultSet.getMetaData();
            
            // Create a string to hold the results
            String output = "";
            
            // Get the results.
            while (resultSet.next())
            {               
               // Get a row.
               for (int i = 1; i <= meta.getColumnCount(); i++)
               {
                  output += resultSet.getString(i);
                  output += '\t';
               }
               output += '\n';
            }
            
            // Display the results.
            resultsTextArea.setText(output);
   
            // Close the statement and the connection.
            stmt.close();
            conn.close();
 
         }
         catch (SQLException e)
         {
            e.printStackTrace();
            System.exit(0);
         }
      }
   }
}
