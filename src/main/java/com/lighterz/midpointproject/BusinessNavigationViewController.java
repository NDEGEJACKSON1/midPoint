package com.lighterz.midpointproject;

import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class BusinessNavigationViewController implements Initializable {

    @FXML
    private BorderPane borderpane;
    @FXML
    private Label OPERATORNAME_ID;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        getPane("DashBoard.fxml");

    }

    public void getOPERATORNAME_ID(JFXTextArea OperatorName) {
        OPERATORNAME_ID.setText("Karibu " + OperatorName.getText());

    }

    @FXML
    void exitWindow(MouseEvent event) throws IOException {
        App.stage.setHeight(770);
        App.stage.setWidth(850);

        FXMLLoader fXMLLoader = new FXMLLoader(App.class.getResource("BusinessViewOperator.fxml"));
        Parent newRoot = (Parent) fXMLLoader.load();

        App.scene.setRoot(newRoot);
    }

    @FXML
    void getDashBoardPane(MouseEvent event) {
        getPane("DashBoard.fxml");
    }

    @FXML
    void getDataBasePane(MouseEvent event) {
        getPane("Database.fxml");

    }

    @FXML
    void getSettingsPane(MouseEvent event) {
        getPane("Settings.fxml");
    }

    private void getPane(String xmlName) {
        Pane newPane = null;
        try {

            newPane = FXMLLoader.load(getClass().getResource("Panels/" + xmlName));
        } catch (IOException io) {
            System.out.println("Something went wrong");
        }
        borderpane.setCenter(newPane);
    }

}
