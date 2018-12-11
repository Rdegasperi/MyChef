package modello;


public class Utente {

	private int ID;
	private String email;
	private String password;
	private String nome;
	private String cognome;
	private int numero_telefono;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getNumero_telefono() {
		return numero_telefono;
	}
	public void setNumero_telefono(int numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

}
