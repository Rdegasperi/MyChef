package controllo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class GeneraDB {
	
	private EntityManagerFactory emf;
	private EntityManager em;
	
	@Before
	public void inizializza() {
		this.emf = Persistence.createEntityManagerFactory("MyChefDB");
		this.em = emf.createEntityManager();
	}
	
	@Test
	public void test() {
		
	}

}
