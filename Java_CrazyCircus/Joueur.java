/** Player object to store information about each player.
 * @author prxzr
 * @version 1.0
 */

package bpo.crazycircus;

public class Joueur {
	private String name;
	private boolean hasPlayed;
	private int score;
	
	
	public Joueur(String n) {
		this.name = n;
		this.score = 0;
		this.hasPlayed = false;
	}

	
	public String getName() {
		return this.name;
	}


	public boolean getHasPlayed() {
		return this.hasPlayed;
	}
	
	
	public int getScore() {
		return this.score;
	}
	
	
	public void setHasPlayed(boolean b){
		this.hasPlayed = b;
	}


	public void increaseScore() {
		this.score++;
	}
}
