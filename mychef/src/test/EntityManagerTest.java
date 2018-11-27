package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import mychef.Utente;

public class EntityManagerTest {

	private EntityManagerFactory emf;
	private EntityManager em;

	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("MyChef");
		this.em = emf.createEntityManager();
	}

	@Test
	public void funzionamentoEntityManagerTest() {
		// dovrei verificare che em non è nullo!!
		assertNotNull("entity manager è nullo, ma non dovrebbe!", this.em);
	}

	// @Test
	public void inserisciClienteDiTest() {
		Utente c = new Utente();
		c.setCodiceFiscale("h4738249h3728");
		c.setCognome("TESTHE£J");

		// salvo il cliente
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
	}

	// @Test
	public void RimozioneClienteTest() {
		this.inserisciClienteDiTest();

		// recupero il cliente (esempio di lettura per chiave)
		Utente c2 = this.em.find(Utente.class, "TESTHE£J");
		assertNotNull("non ho trovato il cliente", c2);

		// rimuovo il cliente di test
		this.em.getTransaction().begin();
		this.em.remove(c2);
		this.em.getTransaction().commit();
	}

	@Test
	public void modificaClienteTest() {
		this.inserisciClienteDiTest();

		// recupero il cliente (esempio di lettura per chiave)
		Utente c1 = this.em.find(Utente.class, "TESTHE£J");

		this.em.getTransaction().begin();
		c1.setCognome("nuovo");
		this.em.getTransaction().commit();

		Utente c2 = this.em.find(Utente.class, "TESTHE£J");
		assertEquals("la partita IVA non coincide", "*****", c2.getCodiceFiscale());

		// rimuovo il cliente di test
		this.em.getTransaction().begin();
		this.em.remove(c2);
		this.em.getTransaction().commit();
	}
}
