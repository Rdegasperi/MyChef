package controllo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Login {

	List<Utente> elenco = new ArrayList<Utente>();
	
	public String controllaNomeUtente() throws IOException {
		System.out.println("Accedere come chef o come cliente?");
		int tipo=0;
		String tipoUtente = new BufferedReader(new InputStreamReader(System.in)).readLine();
		System.out.println("Inserire nome utente");
		String nomeUtenteI = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int k = 0;
		for (Utente u : elenco) {
			if (u.getEmail().equals(nomeUtenteI.toLowerCase())) {
				k++;
				System.out.println("Inserire password");
				String passwordI = new BufferedReader(new InputStreamReader(System.in)).readLine();
				if (u.getPassword().equals(passwordI)) {
					System.out.print("Accesso effettuato come ");
					switch (tipo) {
					case 1: {
						System.out.println("chef");
						break;
					}
					case 2: {
						System.out.println("cliente");
						break;
					}
					}
				}

			}
		}
		if (k == 1) {
			return nomeUtenteI;
		}
		else {
			System.out.println("Nome Utente sconosciuto effettuare la registrazione");
			return ("#//#");
		}

	}

}


