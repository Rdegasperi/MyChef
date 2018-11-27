package controllo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Ricette
 *
 */
@Entity
public class Ricette {

	@Id
	private int ID;
	@Column(nullable=false)
	private String nome_ricetta;
	@Column(nullable=false)
	private String ingredienti;
	@Column(nullable=false)
	private String tempo_preparazione;
	
	@ManyToMany
	private List<Chef> chefs;
	
	public String getNome_ricetta() {
		return nome_ricetta;
	}
	public void setNome_ricetta(String nome_ricetta) {
		this.nome_ricetta = nome_ricetta;
	}
	public String getIngredienti() {
		return ingredienti;
	}
	public void setIngredienti(String ingredienti) {
		this.ingredienti = ingredienti;
	}
	public String getTempo_preparazione() {
		return tempo_preparazione;
	}
	public void setTempo_preparazione(String tempo_preparazione) {
		this.tempo_preparazione = tempo_preparazione;
	}
	public int getID() {
		return ID;
	}
	
   
}
