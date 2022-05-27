package com.lighterz.midpointproject;


import com.jfoenix.controls.JFXDecorator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;

public class App extends Application {

    public static Scene scene;
    private final String APP_TITLE = "MidPoint";
    private final String APP_VERSION = APP_TITLE + " 0.0.1";
    public static Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        
        App.stage = stage;
        scene = new Scene(loadFXML("BusinessViewOperator"), 850, 770);
        App.stage.setScene(scene);
        App.stage.setTitle(APP_VERSION);
        App.stage.getIcons().add(new Image("./images/warehouse.png"));

        App.stage.setResizable(false);
        App.stage.show();
    }

    public static void setRoot(String fxml, int w, int h) throws IOException {
        App.stage.setHeight(h);
        App.stage.setWidth(w);
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    

}
