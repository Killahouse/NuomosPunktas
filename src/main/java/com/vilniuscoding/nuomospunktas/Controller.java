package com.vilniuscoding.nuomospunktas;

import java.awt.TextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Sarasas;

public class Controller extends Application implements Initializable {
	
	@FXML private TableView<Sarasas> tableView;
	@FXML private TableColumn<Sarasas, Integer> idColumn;
	@FXML private TableColumn<Sarasas, Integer> kiekisColumn;
	
	@FXML private Button showSlidesList;
	@FXML private Button showSalmasList;
	@FXML private Button showBataiList;
	@FXML private Button showLazdosList;
	@FXML private Button showAkiniaiList;
	@FXML private Button rezervuoti;
	@FXML private Button uzsakyti;
	
	@FXML private TextField idInputField;
	@FXML private TextField kiekisInputField;
	
	@FXML private TextArea duomenuRodymas;
	
	
	
	private ObservableList<Sarasas> sarasas = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = this.loadTableView();
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	public void addItem(ActionEvent event) {
		sarasas.add(new Sarasas(Integer.parseInt(idInputField.getText()), Integer.parseInt(kiekisInputField.getText())));
	}
	
//	@FXML
//	public void rodytiSlidziuSarasa(ActionEvent event) {
//	duomenuRodymas.setText("Labas");
//	duomenuRodymas.getText();
//	}
	
	public void initialize(URL location, ResourceBundle resources) {
		idColumn.setCellValueFactory(new PropertyValueFactory<Sarasas, Integer>("id"));
		kiekisColumn.setCellValueFactory(new PropertyValueFactory<Sarasas, Integer>("kiekis"));
		tableView.setItems(sarasas);
	}
	
	private BorderPane loadTableView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Controller.class.getResource("../../../view/Meniu.fxml"));
		return loader.load();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
