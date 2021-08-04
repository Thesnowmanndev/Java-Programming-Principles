module kylemartin.finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens kylemartin.finalproject to javafx.fxml;
    exports kylemartin.finalproject;
}