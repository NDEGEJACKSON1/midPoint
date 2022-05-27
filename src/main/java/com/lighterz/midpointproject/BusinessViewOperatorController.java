package com.lighterz.midpointproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import java.io.IOException;
import javafx.scene.Parent;

public class BusinessViewOperatorController implements Initializable {

    @FXML
    private JFXTextArea USER_NAME_OPERATOR_ID;
    @FXML
    private Label VALIDATION_MSG_ID;

    private final String VAL_MSG_PROMPT = "Majina Yanatakiwa Yawe Mawili tu...!!!";

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("First Method Called");
    }

    @FXML
    protected void input_validation(ActionEvent event) throws IOException {
        String user_name = USER_NAME_OPERATOR_ID.getText();
        int namesize = user_name.split(" ").length;
        VALIDATION_MSG_ID.setTextFill(Paint.valueOf("Red"));

        if (namesize != 2) {
            VALIDATION_MSG_ID.setText(VAL_MSG_PROMPT);

        } else if (user_name.matches(".*\\d.*")) {
            VALIDATION_MSG_ID.setText("Jina Halitakiwi Liwe na Tarakimu");
        } else {
            VALIDATION_MSG_ID.setText(" ");
            App.stage.setHeight(850);
            App.stage.setWidth(1200);


            FXMLLoader fXMLLoader = new FXMLLoader(App.class.getResource("BusinessNavigationView.fxml"));
            Parent newRoot = (Parent) fXMLLoader.load();

            BusinessNavigationViewController bnvc = fXMLLoader.getController();
            bnvc.getOPERATORNAME_ID(USER_NAME_OPERATOR_ID);

            App.scene.setRoot(newRoot);

        }

    }

}
