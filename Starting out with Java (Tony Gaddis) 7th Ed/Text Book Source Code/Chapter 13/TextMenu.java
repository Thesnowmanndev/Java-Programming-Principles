import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;

public class TextMenu extends Application
{
   // Fields for the menu components
   private MenuBar menuBar;
   private Menu fileMenu;
   private Menu textMenu;
   private MenuItem exitItem;
   private RadioMenuItem blackItem;
   private RadioMenuItem redItem;
   private RadioMenuItem greenItem;
   private RadioMenuItem blueItem;
   private CheckMenuItem visibleItem;
   
   // Field for the text
   private Label outputLabel;
   
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
      // Constants for the scene dimensions
      final double WIDTH = 300.0, HEIGHT = 200.0;
      
      // Create the Label control.
      outputLabel = new Label("Hello World");
      
      // Create the menu bar.
      menuBar = new MenuBar();
 
      // Create the File menu.
      buildFileMenu(primaryStage);
            
      // Create the Text menu.
      buildTextMenu();
      
      // Add the File & Text menus to the menu bar.
      menuBar.getMenus().add(fileMenu);
      menuBar.getMenus().add(textMenu);
      
      // Add the controls to a BorderPane.
      BorderPane borderPane = new BorderPane();
      borderPane.setTop(menuBar);
      borderPane.setCenter(outputLabel);
               
      // Create a Scene and display it.
      Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   
   /**
    * This method builds the File menu.
    */
    
   private void buildFileMenu(Stage primaryStage)
   {
      // Create the File Menu object.
      fileMenu = new Menu("File");
      
      // Create the Exit MenuItem object.
      exitItem = new MenuItem("Exit");
      
      // Register an event handler for the Exit item.
      exitItem.setOnAction(event ->
      {
         primaryStage.close();
      });
      
      // Add the Exit item to the File menu.
      fileMenu.getItems().add(exitItem);
   }

   /**
    * This method builds the Text menu.
    */
   
   private void buildTextMenu()
   {
      // Create the Text Menu object.
      textMenu = new Menu("Text");
      
      // Create the menu items for the Text menu.
      blackItem = new RadioMenuItem("Black");
      redItem = new RadioMenuItem("Red");
      greenItem = new RadioMenuItem("Green");
      blueItem = new RadioMenuItem("Blue");
      visibleItem = new CheckMenuItem("Visible");
      
      // Select the Black and Visible menu items.
      blackItem.setSelected(true);
      visibleItem.setSelected(true);
      
      // Add the RadioMenuItems to a ToggleGroup.
      ToggleGroup textToggleGroup = new ToggleGroup();
      blackItem.setToggleGroup(textToggleGroup);
      redItem.setToggleGroup(textToggleGroup);
      greenItem.setToggleGroup(textToggleGroup);
      blueItem.setToggleGroup(textToggleGroup);
      
      // Register event handlers for the menu items.
      blackItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: black");
      });
      
      redItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: red");
      });
      
      greenItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: green");
      });
      
      blueItem.setOnAction(event ->
      {
         outputLabel.setStyle("-fx-text-fill: blue");
      });
      
      visibleItem.setOnAction(event ->
      {
         if (outputLabel.isVisible())
            outputLabel.setVisible(false);
         else
            outputLabel.setVisible(true);
      });
      
      // Add the menu items to the Text menu.
      textMenu.getItems().add(blackItem);
      textMenu.getItems().add(redItem);
      textMenu.getItems().add(greenItem);
      textMenu.getItems().add(blueItem);
      textMenu.getItems().add(new SeparatorMenuItem());
      textMenu.getItems().add(visibleItem);
   }
}