package controllo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class Register {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	List<Utente> elenco = new ArrayList<Utente>();
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("MyChefDB");
		this.em = emf.createEntityManager();
	}
	
	@Test
	public void reistrazione() throws IOException{
		
		int tipo=0;
		System.out.println("Registrarsi come chef o come cliente?");
		String tipoUtente = new BufferedReader(new InputStreamReader(System.in)).readLine();
		
		do {
			
		switch(tipoUtente.toLowerCase()) {
		case ("chef"): {
			tipo=1;
			Chef nuovoChef = new Chef();
			nuovoChef.setEmail(nuovaEmail());
			nuovoChef.setNome(nuovoNome());
			nuovoChef.setCognome(nuovoCognome());
			String tel = nuovoNumeroTelefono();
			if(tel.equals("no")) {
				
			}
			else {
				nuovoChef.setNumero_telefono(Integer.parseInt(tel));
			}
			nuovoChef.setProvincia(nuovaProvincia());
			nuovoChef.setComune(nuovoComune());
			String fraz = nuovaFrazione();
			if(tel.equals("no")) {
				
			}
			else {
				nuovoChef.setFrazione(fraz);
			}
			nuovoChef.setIndirizzo(nuovoIndirizzo());
			nuovoChef.setPassword(nuovaPassword());
			this.em.getTransaction().begin();
			this.em.persist(nuovoChef);
			this.em.getTransaction().commit();
			break;
		}
		case ("cliente"): {
			tipo=2;
			Cliente nuovoCliente = new Cliente();
			nuovoCliente.setEmail(nuovaEmail());
			nuovoCliente.setNome(nuovoNome());
			nuovoCliente.setCognome(nuovoCognome());
			String tel = nuovoNumeroTelefono();
			if(tel.equals("no")) {
				
			}
			else {
				nuovoCliente.setNumero_telefono(Integer.parseInt(tel));
			}
			nuovoCliente.setPassword(nuovaPassword());
			this.em.getTransaction().begin();
			this.em.persist(nuovoCliente);
			this.em.getTransaction().commit();
			break;
		}
		default : {
			System.out.println("ERRORE SELEZIONE NON VALIDA");
			break;
		}
		
		}
		
		}while((tipo!=1)&&(tipo!=2));
		System.out.println("fine");
		
		
		
	}
	
	private String nuovaEmail() throws IOException{
		
		System.out.println("\nInserire un'indirizzo mail valido");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}
	
	private String nuovoNome() throws IOException{
		
		System.out.println("\nInserire il nome");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}
	
	private String nuovoCognome() throws IOException{
		
		System.out.println("\nInserire il cognome");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}
	
	private String nuovaPassword() throws IOException{
		
		String pass;
		String passC;
		
		do {
			
			System.out.println("\nInserire la password");
			pass = new BufferedReader(new InputStreamReader(System.in)).readLine();
			System.out.println("\nConferma password");
			passC = new BufferedReader(new InputStreamReader(System.in)).readLine();
			if(!pass.equals(passC)) {
				System.out.println("CONFERMA PASSWORD ERRATA");
			}
			
		}while (!pass.equals(passC));
		return pass;
	}
	
	private String nuovoNumeroTelefono() throws IOException{
		System.out.println("Vuoi Inserire un numero di telefono?<si/no>");
		String risp = new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase();
		do {
			
		if((risp.equals("no"))) {
		}
		else if(((risp.equals("sì"))||(risp.equals("si")))) {
			System.out.println("Inserire");
			return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		}
		else {
			System.out.println("ERRORE RISPOSTA NON VALIDA");
			System.out.println("Sei sicuro di voler inserire un numero di telefono?<sì/no>");
			risp=new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase();
		}
		
		}while(!risp.equals("no"));
		return("no");
				
	}
	
	private String nuovaProvincia() throws IOException{
		
		System.out.println("Inserire la provincia");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}
	
	private String nuovoComune() throws IOException{
		
		System.out.println("Inserire il comune");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}
	
	private String nuovaFrazione() throws IOException{
		System.out.println("Vuoi Inserire la frazione?<si/no>");
		String rispo = new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase();
		do {
			
		if((rispo.equals("no"))) {
			return("no");
		}
		else if(((rispo.equals("sì"))||(rispo.equals("si")))) {
			System.out.println("Inserire");
			return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		}
		else {
			System.out.println("ERRORE RISPOSTA NON VALIDA");
			System.out.println("Sei sicuro di voler inserire la frazione?<sì/no>");
			rispo=new BufferedReader(new InputStreamReader(System.in)).readLine().toLowerCase();
		}
		
		}while(!rispo.equals("no"));
		return("no");
		
	}
	
private String nuovoIndirizzo() throws IOException{
		
		System.out.println("Inserire l'indirizzo");
		return(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
	}

}
