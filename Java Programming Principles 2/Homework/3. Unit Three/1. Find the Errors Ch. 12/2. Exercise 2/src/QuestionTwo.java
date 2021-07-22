/*
 * This program was written by Kyle Martin on 7/22/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to fix a error in sudo code
 * See Chapter 12 Find the Error Question 2.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class QuestionTwo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label messageLabel = new Label("Hello World");
        HBox hbox = new HBox(messageLabel); // Added variable to hbox
        //hbox.add(messageLabel); removed line of code
        Scene scene = new Scene(hbox); // added for scene not apart of exercise
        stage.setScene(scene); // added for scene not apart of exercise
        stage.setTitle("Find the Error 2 Chapter 12"); // added for scene not apart of exercise
        stage.show(); // added for scene not apart of exercise
    }
}
