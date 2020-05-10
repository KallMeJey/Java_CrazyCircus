/** Main file where all the methods are called.
 * @author prxzr
 * @version 2.0
 */

package bpo.crazycircus;

import java.util.Scanner;

public class CrazyCircus {

	public static void main(String[] args) {

		Jeu jeu = new Jeu(args);
		
		Scanner sc = new Scanner(System.in);

		
		while (!jeu.isCardListEmpty()) {
			
			jeu.startRound();
			jeu.displayGame();
			
			while(!jeu.isRoundFinished()) {
				
				System.out.print("> ");
				jeu.readMovements(sc.nextLine());
			}
			
			jeu.setPlayedFalse();
			jeu.displayScoreboard();
			
		}
		
	}
}
