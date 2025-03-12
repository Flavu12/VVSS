module inventory {
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires java.xml;

    opens inventory.model to javafx.base;
    exports inventory.model;
    opens inventory to javafx.fxml;
    exports inventory;
    opens inventory.controller to javafx.fxml;
    exports inventory.controller;
}