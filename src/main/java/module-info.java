module com.example.shoppingcartsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shoppingcartsystem to javafx.fxml;
    exports com.example.shoppingcartsystem;
}