package controllers;

import Utilities.DBUtilities;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import models.Car;
import models.Person;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class carsController implements Initializable {

    @FXML
    private Label fname;

    @FXML
    private Label lname;

    @FXML
    private TableView<Car> carTableView;

    @FXML
    private TableColumn<Car, String> cNameColumn;

    @FXML
    private TableColumn<Car, String> modelColumn;

    @FXML
    private TableColumn<Car, String> typeColumn;

    @FXML
    private TableColumn<Car, String> colorColumn;

    @FXML
    private TableColumn<Car, String> transmissionColumn;

    @FXML
    private TableColumn<Car, Integer> seatColumn;

    @FXML
    private TableColumn<Car, Integer> priceColumn;

    @FXML
    private TableColumn<Car, Double> mileageColumn;


    @FXML
    private ComboBox<String> sortComboBox;

    @FXML
    private Person person;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //configure the student list to only allow 1 Student to be selected at a time
        carTableView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        //configure the table columns
        cNameColumn.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        modelColumn.setCellValueFactory(new PropertyValueFactory<>("modelName"));
        colorColumn.setCellValueFactory(new PropertyValueFactory<>("color"));
        transmissionColumn.setCellValueFactory(new PropertyValueFactory<>("transmission"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("carType"));
        seatColumn.setCellValueFactory(new PropertyValueFactory<>("seats"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        mileageColumn.setCellValueFactory(new PropertyValueFactory<>("mileage"));

        //load the data into the table
       carTableView.getItems().addAll(DBUtilities.addCars());

        sortComboBox.getItems().addAll(DBUtilities.getMajors());
        String asc = "Price Ascending";
        String dsc = "Price Descending";
        String name = "Company Name";

        if(asc.equals(sortComboBox.getValue())) {
            carTableView.getItems().addAll(DBUtilities.sortPriceAscending());
        }

        if(dsc.equals(sortComboBox.getValue())) {
            carTableView.getItems().addAll(DBUtilities.sortPriceDescending());
        }
        if(name.equals(sortComboBox.getValue())) {
            carTableView.getItems().addAll(DBUtilities.sortByCompany());
       }

    }

    @FXML
    private void changeToPopup(ActionEvent event) throws IOException {
        Utilities.SceneChanger.changeScenes(event, "../views/Popup.fxml","Cars");
    }

    @FXML
    private void changeToPrevious(ActionEvent event) throws IOException {
        Utilities.SceneChanger.changeScenes(event, "../views/person.fxml","Cars");
    }



}
