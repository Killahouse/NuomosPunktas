package com.vilniuscoding.nuomospunktas;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class InventoriausSpausdinimas {

	public static void meniu(){
		System.out.println("1---Slides");
		System.out.println("2---Salmas");
		System.out.println("3---Batai");
		System.out.println("4---Lazdos");
		System.out.println("5---Akiniai");
		System.out.println();
		System.out.println("Iveskite skaiciu koki sarasa noretumete atspausdinti:");
		Scanner meniuIvedimas = new Scanner(System.in);
		int skaicius = meniuIvedimas.nextInt();
		
	switch(skaicius) {
	case 1:
		for(InventoriausObjektas inventoriausEilute : slidziuSarasas()) {
		    System.out.println(inventoriausEilute);
		}
		break;
	case 2:
		for(InventoriausObjektas inventoriausEilute : salmuSarasas()) {
		    System.out.println(inventoriausEilute);
		}
		break;
	case 3:
		for(InventoriausObjektas inventoriausEilute : batuSarasas()) {
		    System.out.println(inventoriausEilute);
		}
		break;
	case 4:
		for(InventoriausObjektas inventoriausEilute : lazduSarasas()) {
		    System.out.println(inventoriausEilute);
		}
		break;
	case 5:
		for(InventoriausObjektas inventoriausEilute : akiniuSarasas()) {
		    System.out.println(inventoriausEilute);
		}
		break;
	default:
		System.out.println("Ivedete netinkama skaiciu!!!");
		break;
	}	
	meniuIvedimas.close();
	}

	
	public static ArrayList<InventoriausObjektas> slidziuSarasas() {	
		ArrayList<InventoriausObjektas> Sarasas = new ArrayList<InventoriausObjektas>();
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Slides'";
		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {
			// loop through the result set
			while (rs.next()) {	
				
				InventoriausObjektas slidziuEilute = new InventoriausObjektas(0, sql, sql, 0, 0);
				
				slidziuEilute.setId(rs.getInt("Id"));
				slidziuEilute.getId();
				slidziuEilute.setTipas(rs.getString("Tipas"));
				slidziuEilute.getTipas();
				slidziuEilute.setPavadinimas(rs.getString("Pavadinimas"));
				slidziuEilute.getPavadinimas();
				slidziuEilute.setKiekis(rs.getInt("Kiekis"));
				slidziuEilute.getKiekis();
				slidziuEilute.setKaina(rs.getDouble("Kaina"));
				slidziuEilute.getKaina();
				Sarasas.add(slidziuEilute);
				
				
				//System.out.println(rs.getInt("Id") + "\t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Sarasas;
	}
	
	public static ArrayList<InventoriausObjektas> salmuSarasas() {
		ArrayList<InventoriausObjektas> Sarasas = new ArrayList<InventoriausObjektas>();
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Salmas'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				InventoriausObjektas slidziuEilute = new InventoriausObjektas(0, sql, sql, 0, 0);
				slidziuEilute.setId(rs.getInt("Id"));
				slidziuEilute.getId();
				slidziuEilute.setTipas(rs.getString("Tipas"));
				slidziuEilute.getTipas();
				slidziuEilute.setPavadinimas(rs.getString("Pavadinimas"));
				slidziuEilute.getPavadinimas();
				slidziuEilute.setKiekis(rs.getInt("Kiekis"));
				slidziuEilute.getKiekis();
				slidziuEilute.setKaina(rs.getDouble("Kaina"));
				slidziuEilute.getKaina();
				Sarasas.add(slidziuEilute);
				//System.out.println(rs.getInt("Id") + "\t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Sarasas;
	}
	
	public static ArrayList<InventoriausObjektas> batuSarasas() {
		ArrayList<InventoriausObjektas> Sarasas = new ArrayList<InventoriausObjektas>();
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Batai'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				InventoriausObjektas slidziuEilute = new InventoriausObjektas(0, sql, sql, 0, 0);
				slidziuEilute.setId(rs.getInt("Id"));
				slidziuEilute.getId();
				slidziuEilute.setTipas(rs.getString("Tipas"));
				slidziuEilute.getTipas();
				slidziuEilute.setPavadinimas(rs.getString("Pavadinimas"));
				slidziuEilute.getPavadinimas();
				slidziuEilute.setKiekis(rs.getInt("Kiekis"));
				slidziuEilute.getKiekis();
				slidziuEilute.setKaina(rs.getDouble("Kaina"));
				slidziuEilute.getKaina();
				Sarasas.add(slidziuEilute);
				//System.out.println(rs.getInt("Id") + "\t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Sarasas;
	}
	
	public static ArrayList<InventoriausObjektas> lazduSarasas() {
		ArrayList<InventoriausObjektas> Sarasas = new ArrayList<InventoriausObjektas>();
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Lazdos'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				InventoriausObjektas slidziuEilute = new InventoriausObjektas(0, sql, sql, 0, 0);
				slidziuEilute.setId(rs.getInt("Id"));
				slidziuEilute.getId();
				slidziuEilute.setTipas(rs.getString("Tipas"));
				slidziuEilute.getTipas();
				slidziuEilute.setPavadinimas(rs.getString("Pavadinimas"));
				slidziuEilute.getPavadinimas();
				slidziuEilute.setKiekis(rs.getInt("Kiekis"));
				slidziuEilute.getKiekis();
				slidziuEilute.setKaina(rs.getDouble("Kaina"));
				slidziuEilute.getKaina();
				Sarasas.add(slidziuEilute);
				//System.out.println(rs.getInt("Id") + "\t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Sarasas;
	}
	
	public static ArrayList<InventoriausObjektas> akiniuSarasas() {
		ArrayList<InventoriausObjektas> Sarasas = new ArrayList<InventoriausObjektas>();
		String sql = "SELECT Id, Tipas, Pavadinimas, Kiekis, Kaina FROM Inventorius WHERE Tipas = 'Akiniai'";

		try (Connection conn = PrisijungimasPrieDB.connect();
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			// loop through the result set
			while (rs.next()) {
				InventoriausObjektas slidziuEilute = new InventoriausObjektas(0, sql, sql, 0, 0);
				slidziuEilute.setId(rs.getInt("Id"));
				slidziuEilute.getId();
				slidziuEilute.setTipas(rs.getString("Tipas"));
				slidziuEilute.getTipas();
				slidziuEilute.setPavadinimas(rs.getString("Pavadinimas"));
				slidziuEilute.getPavadinimas();
				slidziuEilute.setKiekis(rs.getInt("Kiekis"));
				slidziuEilute.getKiekis();
				slidziuEilute.setKaina(rs.getDouble("Kaina"));
				slidziuEilute.getKaina();
				Sarasas.add(slidziuEilute);
				//System.out.println(rs.getInt("Id") + "\t" + rs.getString("Tipas") + "\t" + rs.getString("Pavadinimas") + "\t" + rs.getInt("Kiekis") + "\t" + rs.getDouble("Kaina"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return Sarasas;
	}

	
}
