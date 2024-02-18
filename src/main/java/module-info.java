module com.example.lostsouls {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lostsouls to javafx.fxml;
    exports com.example.lostsouls;
}