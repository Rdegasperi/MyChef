package mychef;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Cliente extends Utente {

	@OneToMany (mappedBy = "cliente")
	List<Ordine> ordini;
	
}
