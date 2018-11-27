package mychef;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Chef extends Utente{
	
	Integer prezzo_minimo;
	@OneToMany (mappedBy = "chef")
	List<Ordine> ordini;

	public Integer getPrezzo_minimo() {
		return prezzo_minimo;
	}

	public void setPrezzo_minimo(Integer prezzo_minimo) {
		this.prezzo_minimo = prezzo_minimo;
	}
	
}
