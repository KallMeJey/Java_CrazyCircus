package bpo.crazycircus;

import static org.junit.Assert.*;

import org.junit.Test;

public class testJoueur {


	Joueur j = new Joueur("Arthur");

	
	@Test
	public void testGetNom() {
		assertTrue(j.getNom().equals("Arthur"));
	}

	@Test
	public void testPeuxJouer() {
		assertTrue(j.peuxJouer() == true);
	}

	@Test
	public void testSetPeuxJouer() {
		j.setPeuxJouer(false);
		assertTrue(j.peuxJouer() == false);
	}

	@Test
	public void testGetNbPoints() {
		assertTrue(j.getNbPoints() == 0);
	}

	@Test
	public void testAjouterUnPoint() {
		j.ajouterUnPoint();
		assertTrue(j.getNbPoints() == 1);
	}

}
