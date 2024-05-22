module com.example.myfirstproject1_0 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myfirstproject1_0 to javafx.fxml;
    exports com.example.myfirstproject1_0;
}