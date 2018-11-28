package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

import mychef.Cliente;

public class EntityManagerTest {

	private EntityManagerFactory emf;
	private EntityManager em;

	private String prova = "prova";

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

	public void inserisciClienteDiTest() {
		Cliente c = new Cliente();
		c.setCodiceFiscale(this.prova);
		c.setCognome("un_cognome");

		// salvo il cliente
		this.em.getTransaction().begin();
		this.em.persist(c);
		this.em.getTransaction().commit();
	}

	public void RimozioneClienteTest() {
		this.inserisciClienteDiTest();

		// recupero il cliente (esempio di lettura per chiave)
		Cliente c2 = this.em.find(Cliente.class, this.prova);
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
		Cliente c1 = this.em.find(Cliente.class, this.prova);

		this.em.getTransaction().begin();
		c1.setCognome("nuovo_cognome");
		this.em.getTransaction().commit();

		Cliente c2 = this.em.find(Cliente.class, this.prova);
		assertEquals("il cognome non coincide", "nuovo_cognome", c2.getCognome());
	}
}
