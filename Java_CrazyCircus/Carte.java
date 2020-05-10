/** Card object to store the animals position & move them around.
 * @author prxzr
 * @version 2.1
 */

package bpo.crazycircus;

import java.util.ArrayList;

public class Carte {
	
	private ArrayList<Animal> pBleu;
	private ArrayList<Animal> pRouge;
	
	
	public Carte(ArrayList<Animal> b, ArrayList<Animal> r) {
		this.pBleu = b;
		this.pRouge = r;
	}
	
	
	public Carte(Carte c) {
		this.pBleu = new ArrayList<Animal>(c.getPodiumBleu());
		this.pRouge = new ArrayList<Animal>(c.getPodiumRouge());
	}
	
	
	public ArrayList<Animal> getPodiumBleu() {
		return new ArrayList<Animal>(this.pBleu);
	}


	public ArrayList<Animal> getPodiumRouge() {
		return new ArrayList<Animal>(this.pRouge);
	}
	
	
	public void displayCard() {
		for (int i = pBleu.size()-1; i >= 0; i--) {
			
			System.out.println("  " + pBleu.get(i).toString());
		}
		
		System.out.println("  ----");
		System.out.println("  BLEU");
		System.out.println();
		
		for (int i = pRouge.size()-1; i >= 0; i--) {
			
			System.out.println("  " + pRouge.get(i).toString());
		}
		
		System.out.println("  -----");
		System.out.println("  ROUGE");

	}

	
	public Animal getTopAnimalBleu() {
		
		assert(this.pBleu.isEmpty());
		
		return this.pBleu.get(pBleu.size()-1);
	}
	
	
	public Animal getBottomAnimalBleu() {

		assert(this.pBleu.isEmpty());
		
		return this.pBleu.get(0);
	}
	
	
	public Animal getBottomAnimalRouge() {

		assert(this.pRouge.isEmpty());
		
		return this.pRouge.get(0);
	}
	
	
	public Animal getTopAnimalRouge() {
		
		assert(this.pRouge.isEmpty());
		
		return this.pRouge.get(pRouge.size()-1);
	}

	
	public void moveKI() {
		assert(pRouge.size() < 3 && pBleu.isEmpty());
		
		try {
			
			this.pRouge.add(getTopAnimalBleu());
			this.pBleu.remove(getTopAnimalBleu());
			
		} catch (Exception e) {
			System.err.println("Something went wrong.");
		}

	}
	
	
	public void moveLO() {
		assert(pBleu.size() < 3 && pRouge.isEmpty());
		
		try {
			
			this.pBleu.add(getTopAnimalRouge());
			this.pRouge.remove(getTopAnimalRouge());
			
		} catch (Exception e) {
			System.err.println("Something went wrong.");
		}
		
	}
	
	
	public void moveSO() {
		assert(pBleu.size() < 3 && pRouge.size() < 3 && pBleu.isEmpty() && pRouge.isEmpty());
		
		try {
			
			Animal r = getTopAnimalRouge();
			
			this.pRouge.remove(getTopAnimalRouge());
			this.pRouge.add(getTopAnimalBleu());
			
			this.pBleu.remove(getTopAnimalBleu());
			this.pBleu.add(r);
			
		} catch (Exception e) {
			System.err.println("Something went wrong.");
		}
		
	}
	
	
	public void moveNI() {
		assert(pBleu.size() > 1);

		try {
			
			Animal b = getBottomAnimalBleu();
			
			this.pBleu.remove(getBottomAnimalBleu());
			this.pBleu.add(b);
			
		} catch (Exception e) {
			System.err.println("Something went wrong.");
		}
		
	}
	
	
	public void moveMA() {
		assert(pRouge.size() > 1);

		try {
			
			Animal r = getBottomAnimalRouge();
			
			this.pRouge.remove(getBottomAnimalRouge());
			this.pRouge.add(r);
			
		} catch (Exception e) {
			System.err.println("Something went wrong.");
		}

	}
}
