package controllo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Chef
 *
 */
@Entity
public class Chef extends Utente {

	@Column(nullable=false)
	private String provincia;
	@Column(nullable=false)
	private String comune;
	private String frazione;
	@Column(nullable=false)
	private String indirizzo;
	private int prezzo; //in centesimi
	
	@ManyToMany(mappedBy="chefs")
	private List<Ricette> ricette;
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getComune() {
		return comune;
	}
	public void setComune(String comune) {
		this.comune = comune;
	}
	public String getFrazione() {
		return frazione;
	}
	public void setFrazione(String frazione) {
		this.frazione = frazione;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
   
}
