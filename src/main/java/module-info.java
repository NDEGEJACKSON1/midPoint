module com.lighterz.midpointproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires java.base;
    requires fontawesomefx;
    requires eu.hansolo.tilesfx;
    

    opens com.lighterz.midpointproject to javafx.fxml;
    exports com.lighterz.midpointproject;
}
