/*
 * This program was written by Kyle Martin on 7/25/2021 for Java Programming Principles 2 during Summer Session 2
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to show how to morph labels by clicking a button
 * See Chapter 12 Program Challenge 1 - Latin Translator.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LatinTranslator extends Application {
    private Label translatedWord;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        translatedWord = new Label("Click a button to translate the word from Latin to English");

        Button translateSinister = new Button("sinister");
        Button translateDexter = new Button("dexter");
        Button translateMedium = new Button("medium");

        translateSinister.setOnAction(new SinisterButtonClick());
        translateDexter.setOnAction(new DexterButtonClick());
        translateMedium.setOnAction(new MediumButtonClick());

        GridPane gridPane = new GridPane();
        gridPane.setVgap(50);
        gridPane.setHgap(10);

        gridPane.add(translatedWord, 1, 0);
        gridPane.add(translateSinister, 1, 1);
        gridPane.add(translateDexter, 1, 2);
        gridPane.add(translateMedium, 1, 3);

        Scene scene = new Scene(gridPane, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Latin Translator - Kyle Martin");
        stage.show();
    }

    class SinisterButtonClick implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            translatedWord.setText("English Translation: Left");
        }
    }

    class DexterButtonClick implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            translatedWord.setText("English Translation: Right");
        }
    }

    class MediumButtonClick implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            translatedWord.setText("English Translation: Center");
        }
    }
}
