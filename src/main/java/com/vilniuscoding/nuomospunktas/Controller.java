package com.vilniuscoding.nuomospunktas;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.control.TextArea;
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
	@FXML private String slidziuDuomenys;
	@FXML private String salmuDuomenys;
	@FXML private String batuDuomenys;
	@FXML private String lazduDuomenys;
	@FXML private String akiniuDuomenys;
	
	
	
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
	
	@FXML
	public void rodytiSlidziuSarasa(ActionEvent event) {
		String slidSarasas = ("SLIDES" + "\n");
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Slides'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				slidziuDuomenys=(rs.getInt("Id") + " \t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
				slidSarasas+=(slidziuDuomenys + "\n");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		duomenuRodymas.setText(slidSarasas);
	}
	
	@FXML
	public void rodytiSalmuSarasa(ActionEvent event) {
		String salmuSarasas = ("SALMAI" + "\n");
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Salmas'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				salmuDuomenys=(rs.getInt("Id") + " \t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
				salmuSarasas+=(salmuDuomenys + "\n");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		duomenuRodymas.setText(salmuSarasas);
	}
	
	@FXML
	public void rodytiBatuSarasa(ActionEvent event) {
		String batuSarasas = ("BATAI" + "\n");
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Batai'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				batuDuomenys=(rs.getInt("Id") + " \t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
				batuSarasas += (batuDuomenys + "\n");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		duomenuRodymas.setText(batuSarasas);
	}
	
	@FXML
	public void rodytiLazduSarasa(ActionEvent event) {
		String lazduSarasas = ("LAZDOS" + "\n");
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Lazdos'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				lazduDuomenys = (rs.getInt("Id") + " \t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
				lazduSarasas += (lazduDuomenys + "\n");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		duomenuRodymas.setText(lazduSarasas);
	}
	
	@FXML
	public void rodytiAkiniuSarasa(ActionEvent event) {
		String akiniuSarasas = ("AKINIAI" + "\n");
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Akiniai'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				akiniuDuomenys = (rs.getInt("Id") + " \t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
				akiniuSarasas += (akiniuDuomenys + "\n");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		duomenuRodymas.setText(akiniuSarasas);
	}
	
	@FXML
	public void uzdarytiLanga(ActionEvent event) {
		Platform.exit();
	}
	
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
