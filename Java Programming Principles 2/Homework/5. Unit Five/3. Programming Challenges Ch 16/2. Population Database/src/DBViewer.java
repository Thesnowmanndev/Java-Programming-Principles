/*
 * This program was written by Kyle Martin on 8/7/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to provide querys from a dropdown and then execute them and see the results
 * See Chapter 16 Programming Challenges  - Challenge Four.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
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
   final String DB_URL = "jdbc:mysql://localhost:3306/CityDB"; // Don't Hardcode Secrets
   final String DB_USER = "root"; // Don't Hardcode Secrets
   final String DB_Pass = "password"; // Don't Hardcode Secrets

   TextArea queryTextArea;
   TextArea resultsTextArea;
   ComboBox comboBox;
      
   public static void main(String[] args)
   {
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      final int COL_SIZE = 50;
      final int ROW_SIZE = 10;
      final double SPACING = 10.0;

      String populationAscending = "SELECT * FROM City ORDER BY Population ASC";
      String populationDescending = "SELECT * FROM City ORDER BY Population DESC";
      String sortCityNames = "SELECT CityName FROM City ORDER BY CityName ASC";
      String totalPopulation = "SELECT SUM(Population) FROM City";
      String avgPopulation = "SELECT AVG(Population) FROM City";
      String highestPopulation = "SELECT MAX(Population) FROM City";
      String lowestPopulation = "SELECT MIN(Population) FROM City";

      ObservableList<String> queryOptions =
              FXCollections.observableArrayList(populationAscending,
                                                      populationDescending,
                                                      sortCityNames,
                                                      totalPopulation,
                                                      avgPopulation,
                                                      highestPopulation,
                                                      lowestPopulation);
      comboBox = new ComboBox(queryOptions);
      
      // Build the query results area.
      resultsTextArea = new TextArea();
      resultsTextArea.setPrefColumnCount(COL_SIZE);
      resultsTextArea.setPrefRowCount(ROW_SIZE);
      
      // Create the Submit button.
      Button submitButton = new Button("Submit");
      submitButton.setOnAction(new SubmitButtonHandler());
      
      // Put the controls in a VBox.
      VBox vbox = new VBox(SPACING, comboBox,
                           submitButton, resultsTextArea);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(SPACING));

      primaryStage.setTitle("Population Database - Kyle Martin");

      Scene scene = new Scene(vbox);
      primaryStage.setScene(scene);

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
            resultsTextArea.setText("");

            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_Pass);
            Statement stmt = conn.createStatement();

            ResultSet resultSet = 
                    stmt.executeQuery(comboBox.getValue().toString());

            ResultSetMetaData meta = resultSet.getMetaData();

            String output = "";

            while (resultSet.next())
            {
               for (int i = 1; i <= meta.getColumnCount(); i++)
               {
                  output += resultSet.getString(i);
                  output += '\t';
               }
               output += '\n';
            }

            resultsTextArea.setText(output);

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
