/*
 * This program was written by Kyle Martin on 7/25/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show how to set width and height elements of JavaFX.
 * See Chapter 12 Algorithm Workbench Question 2.
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class QuestionTwo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        Scene scene = new Scene(hBox);
        stage.setScene(scene);
        stage.setWidth(300);
        stage.setHeight(200);
        stage.setTitle("Ch. 12 Algorithm Workbench - Q2");
        stage.show();
    }
}
