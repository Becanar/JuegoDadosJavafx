module org.example.juegodados {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.juegodados to javafx.fxml;
    exports org.example.juegodados;
}