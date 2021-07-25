/*
 * This program was written by Kyle Martin on 7/25/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show how to take user input and combine it in a label
 * See Chapter 12 Program Challenge 2 - Name Formatter.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NameFormatter extends Application {
    private TextField userFirstName;
    private TextField userMiddleName;
    private TextField userLastName;
    private TextField userPreferredTitle;
    private Label formattedName;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        /*
        Element Generation
        */
        // Labels
        Label formIntroduction = new Label("Fill out the following form: ");
        Label preferredTitleLabel = new Label("Preferred Title: ");
        Label firstNameLabel = new Label("First Name: ");
        Label middleNameLabel = new Label("Middle Name: ");
        Label lastNameLabel = new Label("Last Name: ");

        // TextFields
        userPreferredTitle = new TextField();
        userFirstName = new TextField();
        userMiddleName = new TextField();
        userLastName = new TextField();
        formattedName = new Label();

        // Buttons
        Button formatButton = new Button("Format Name");
        formatButton.setOnAction(new FormatNameButtonClick());

        /*
        Scene Layout
        */
        // HBoxes
        HBox introHBox = new HBox(10, formIntroduction);
        HBox titleHBox = new HBox(10, preferredTitleLabel, userPreferredTitle);
        HBox firstNameHBox = new HBox(10, firstNameLabel, userFirstName);
        HBox middleNameHBox = new HBox(10, middleNameLabel, userMiddleName);
        HBox lastNameHBox = new HBox(10, lastNameLabel, userLastName);
        HBox resultHBox = new HBox(10, formattedName);

        // VBox
        VBox vBox = new VBox(10, introHBox, titleHBox, firstNameHBox, middleNameHBox, lastNameHBox, formatButton,
                                resultHBox);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(10));

        // Create Scene
        Scene scene = new Scene(vBox);

        // Stage
        stage.setScene(scene);
        stage.setWidth(1280);
        stage.setHeight(720);
        stage.setTitle("Name Formatter - Kyle Martin");
        stage.show();
    }

    class FormatNameButtonClick implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            formattedName.setText(  userPreferredTitle.getText() + " " + userFirstName.getText() + " " +
                                    userMiddleName.getText() + " " + userLastName.getText());
        }
    }
}
