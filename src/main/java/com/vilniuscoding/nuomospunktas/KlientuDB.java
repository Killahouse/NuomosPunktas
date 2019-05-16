package com.vilniuscoding.nuomospunktas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class KlientuDB extends Klientas {
	
	public static void idetiKlientoDuomenisDB(long asmensKodas, String vardas, String pavarde, int telefonoNumeris) {
	
		
        String sql = "INSERT INTO KlientuDuomenys('Asmens kodas', Vardas, Pavarde, 'Telefono numeris') VALUES(?,?,?,?)";
 
        try (Connection conn = PrisijungimasPrieDB.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setLong(1, asmensKodas);
            pstmt.setString(2, vardas);
            pstmt.setString(3, pavarde);
            pstmt.setInt(4, telefonoNumeris);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}