module fr.isika.cda28git {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens fr.isika.cda28git.fr.isika.cda28git to javafx.fxml;
    exports fr.isika.cda28git.fr.isika.cda28git;
}