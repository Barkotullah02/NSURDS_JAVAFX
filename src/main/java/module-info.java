module com.firstapplication.nsurds {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firstapplication.nsurds to javafx.fxml;
    exports com.firstapplication.nsurds;
}