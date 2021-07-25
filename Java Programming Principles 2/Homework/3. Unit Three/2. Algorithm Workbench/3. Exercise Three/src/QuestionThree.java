/*
 * This program was written by Kyle Martin on 7/25/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to add a scene element to a stage in JavaFX.
 * See Chapter 12 Algorithm Workbench Question 1.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class QuestionThree extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(); // Sorta required for making a Scene
        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene); // Adds scene to stage
        primaryStage.show();
    }
}
