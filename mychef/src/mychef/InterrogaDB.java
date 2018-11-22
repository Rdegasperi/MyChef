package mychef;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class InterrogaDB {
	public static void main(String[] args) {
		List<Utente> lista = caricaArraylist();
		for(Utente u : lista) {
			System.out.println(u);
		}
		
	}

	public static List<Utente> caricaArraylist(){
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//			jdbc:sqlserver://mychefdatabase.mssql.somee.com:1433;databaseName=mychefdatabase;integratedSecurity=true;
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://mychefdatabase.mssql.somee.com:1433;databaseName=mychefdatabase", "lexcassi_SQLLogin_1", "thunder777");
			Statement comandosql = conn.createStatement();
			ResultSet utenti = comandosql.executeQuery("select * from Utente");
			List <Utente> lista = new ArrayList<Utente>();
			
				while(utenti.next()) {
					Utente a = new Utente();
				 	a.setId(utenti.getInt("id"));
					a.setUtente(utenti.getString("nomeUtente"));
					a.setPassword(utenti.getString("password"));
					lista.add(a);
				}
				return lista;
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
		e.printStackTrace();
		}
	return null;
	}
}
