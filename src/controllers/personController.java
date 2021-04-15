package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import models.Person;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class personController implements Initializable {

    /**
     * Adding instances of variable in javafx.
     */

    @FXML
    private Label fNameLabel;

    @FXML
    private Label lNameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label cNumLabel;

    @FXML
    private Label addLabel;

    @FXML
    private TextField fNameField;

    @FXML
    private TextField lNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField cNumField;

    @FXML
    private TextField addField;

    @FXML
    private ImageView logo;

    @FXML
    private Person person;


    @FXML
    private void changeToNextScreen(ActionEvent event) throws IOException {
        utilities.SceneChanger.changeScenes(event, "../views/carsDisplay.fxml","Cars");
    }

    @FXML
    private void nextButton()
    {
        try {
            Person newStudent = new Person(fNameField.getText(),
                    lNameField.getText(),
                    emailField.getText(),
                    cNumField.getText(),
                    addField.getText());




            //Clear fields
            clearFields();
        } catch (IllegalArgumentException exception)
        {
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private void clearFields()
    {
        fNameField.clear();
        lNameField.clear();
        emailField.clear();
        cNumField.clear();
        addField.clear();;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
}
