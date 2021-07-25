/*
 * This program was written by Kyle Martin on 7/25/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to add labels to an HBox element of JavaFX.
 * See Chapter 12 Algorithm Workbench Question 1.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class QuestionOne extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Label label1 = new Label("One");
        Label label2 = new Label("Two");
        Label label3 = new Label("Three");

        HBox hbox = new HBox(label1, label2, label3);
        Scene scene = new Scene(hbox);
        stage.setScene(scene);
        stage.setTitle("Ch 12. Algorithm Workbench - Q1");
        stage.show();
    }
}
