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
		List<Cliente> lista = caricaArraylist();
		for(Cliente u : lista) {
			System.out.println(u);
		}
		
	}

	public static List<Cliente> caricaArraylist(){
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
//			jdbc:sqlserver://mychefdatabase.mssql.somee.com:1433;databaseName=mychefdatabase;integratedSecurity=true;
			Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mychef", "root", "");
			Statement comandosql = conn.createStatement();
			ResultSet utenti = comandosql.executeQuery("select * from cliente");
			List <Cliente> lista = new ArrayList<Cliente>();
			
				while(utenti.next()) {
					Cliente a = new Cliente();
				 	a.setCodiceFiscale(utenti.getString("codice_fiscale"));
					a.setEmail(utenti.getString("email"));
					a.setPassword(utenti.getString("password"));
					a.setCognome(utenti.getString("cognome"));
					a.setNome(utenti.getString("nome"));
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
