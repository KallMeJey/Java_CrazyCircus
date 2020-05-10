/** Game object acts as a container for all the different parts & methods of the game.
 * @author prxzr
 * @version 6.0
 */

package bpo.crazycircus;

import java.util.ArrayList;
import java.util.Collections;


public class Jeu {
	private Joueur[] tabJoueurs;
	private ArrayList<Carte> cardList;
	private Carte depart;
	private Carte objectif;
	
	
	public Jeu(String[] players) {
		fillTabJoueurs(players);
		createCards();
		pickStartCard();
	}
	
	
	public void startRound() {
		
		assert(!this.cardList.isEmpty());
		
		pickEndCard();
		//setPlayedFalse();
	}
	
	
	private void fillTabJoueurs(String[] args) {
		
		this.tabJoueurs = new Joueur[args.length];
		
		for (int i = 0; i < args.length; i++) {
			
			this.tabJoueurs[i] = new Joueur(args[i].toLowerCase());
		}
	}
	
	
	private void createCards() {
	
		//Podiums temporaires pour la def des cartes
		ArrayList<Animal> bleu = new ArrayList<>();
		ArrayList<Animal> rouge = new ArrayList<>();

		this.cardList = new ArrayList<>();
		
		//Carte 1
		bleu.add(Animal.OURS); bleu.add(Animal.ELEPHANT); bleu.add(Animal.LION);
		// rouge est vide

		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();

		
		//Carte 2
		bleu.add(Animal.OURS); bleu.add(Animal.LION); bleu.add(Animal.ELEPHANT);
		// rouge est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 3
		bleu.add(Animal.ELEPHANT); bleu.add(Animal.OURS); bleu.add(Animal.LION);
		// rouge est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 4
		bleu.add(Animal.ELEPHANT); bleu.add(Animal.LION); bleu.add(Animal.OURS);
		// rouge est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 5
		bleu.add(Animal.LION); bleu.add(Animal.OURS); bleu.add(Animal.ELEPHANT);
		// rouge est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 6
		bleu.add(Animal.LION); bleu.add(Animal.ELEPHANT); bleu.add(Animal.OURS);
		// rouge est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		

		//Carte 7
		rouge.add(Animal.OURS); rouge.add(Animal.ELEPHANT); rouge.add(Animal.LION);
		// bleu est vide
		
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 8
		rouge.add(Animal.OURS); rouge.add(Animal.LION); rouge.add(Animal.ELEPHANT);
		// bleu est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 9
		rouge.add(Animal.ELEPHANT); rouge.add(Animal.OURS); rouge.add(Animal.LION);
		// bleu est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 10
		rouge.add(Animal.ELEPHANT); rouge.add(Animal.LION); rouge.add(Animal.OURS);
		// bleu est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 11
		rouge.add(Animal.LION); rouge.add(Animal.OURS); rouge.add(Animal.ELEPHANT);
		// bleu est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 12
		rouge.add(Animal.LION); rouge.add(Animal.ELEPHANT); rouge.add(Animal.OURS);
		// bleu est vide
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 13
		bleu.add(Animal.OURS);
		rouge.add(Animal.ELEPHANT); rouge.add(Animal.LION);
		
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 14
		bleu.add(Animal.OURS);
		rouge.add(Animal.LION); rouge.add(Animal.ELEPHANT);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 15
		bleu.add(Animal.ELEPHANT);
		rouge.add(Animal.OURS); rouge.add(Animal.LION);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 16
		bleu.add(Animal.ELEPHANT);
		rouge.add(Animal.LION); rouge.add(Animal.OURS);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 17
		bleu.add(Animal.LION);
		rouge.add(Animal.ELEPHANT); rouge.add(Animal.OURS);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 18
		bleu.add(Animal.LION);
		rouge.add(Animal.OURS); rouge.add(Animal.ELEPHANT);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 19
		rouge.add(Animal.OURS);
		bleu.add(Animal.ELEPHANT); bleu.add(Animal.LION);
		
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 20
		rouge.add(Animal.OURS);
		bleu.add(Animal.LION); bleu.add(Animal.ELEPHANT);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 21
		rouge.add(Animal.ELEPHANT);
		bleu.add(Animal.OURS); bleu.add(Animal.LION);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 22
		rouge.add(Animal.ELEPHANT);
		bleu.add(Animal.LION); bleu.add(Animal.OURS);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 23
		rouge.add(Animal.LION);
		bleu.add(Animal.ELEPHANT); bleu.add(Animal.OURS);
				
		this.cardList.add(new Carte(bleu, rouge));
		bleu = new ArrayList<>(); rouge = new ArrayList<>();
		
		
		//Carte 24
		rouge.add(Animal.LION);
		bleu.add(Animal.OURS); bleu.add(Animal.ELEPHANT);
				
		this.cardList.add(new Carte(bleu, rouge));

	}
	
	
	public void pickStartCard() {		//changer un truc pour que carte de fin deviennent carte de depart
			
		//On mélange la liste de carte
		Collections.shuffle(this.cardList);
		
		//On selectionne la premiere carte
		this.objectif = this.cardList.get(0);
		
		// on la supprime de la liste
		cardList.remove(0);
	}
	
	
	public void pickEndCard() {
		
		//On mélange la liste de carte
		Collections.shuffle(this.cardList);
			
		//On selectionne la premiere carte
		this.depart = this.cardList.get(0);
		
		// on la supprime de la liste
		cardList.remove(0);
	}
	
	
	public void displayGame() {
		System.out.println("Depart:");
		System.out.println();
		depart.displayCard();
		
		System.out.println("\nObjectif:");
		System.out.println();
		objectif.displayCard();
		
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("KI : BLEU --> ROUGE    NI : BLEU ^");
		System.out.println("LO : BLEU <-- ROUGE    MA : ROUGE ^");
		System.out.println("SO : BLEU <-> ROUGE");
		System.out.println();
	}
	

	public void displayScoreboard() {
		
		System.out.println("Scoreboard:");
		
		try {
			if (tabJoueurs.length >= 2) {
				
				int lineCount = 1;
				
				for (Joueur j : tabJoueurs) {
					
					if (lineCount % 2 == 0) {
						System.out.println(j.getName() + ": " + j.getScore());
					}
					else {
						System.out.print(" " + j.getName() + ": " + j.getScore() + "   ");
					}
					
					lineCount++;
				}
			}
			else {
				System.out.println(" " + tabJoueurs[0].getName() + ": " + tabJoueurs[0].getScore());
			}
			
		} catch (Exception e) {
			System.err.println("There are no players!");
		}

		System.out.println();
	}
	

	public boolean compareCards(Carte testCard) {
		
		return this.objectif.getPodiumBleu().equals(testCard.getPodiumBleu()) && this.objectif.getPodiumRouge().equals(testCard.getPodiumRouge());
	}

	
	public void readMovements(String m) {

		Carte testingCard = new Carte(this.depart.getPodiumBleu(), this.depart.getPodiumRouge());	//replace with new Carte(this.depart);
		String[] commands = m.toLowerCase().split(" ");
		// commands[0] : le nom du joueur
		// commands[1] : the movements
		
		
		// Splitting movements String into individual Strings
		String[] movements = new String[commands[1].length()/2];
		int index = 0;
		
		for(int i=0; i < commands[1].length(); i = i + 2){
			movements[index] = commands[1].substring(i, i + 2);
			index++;
		}

		
		try {
			
			for (String move : movements) {
				
				if (move.equals("ki")) {
					testingCard.moveKI();
				}
				
				else if (move.equals("lo")) {
					testingCard.moveLO();
				}
				
				else if (move.equals("so")) {
					testingCard.moveSO();
				}
				
				else if (move.equals("ni")) {
					testingCard.moveNI();
				}
				
				else if (move.equals("ma")) {
					testingCard.moveMA();
				}
				
				else {
					System.err.println("Erreur! Instruction incorrecte.");
				}
			}

			
			if (compareCards(testingCard)) {
				
				for (Joueur j : tabJoueurs) {
					if (j.getName().equals(commands[0])) {
						
						if (j.getHasPlayed() == false) {
							j.increaseScore();
							j.setHasPlayed(true);
							
							System.out.println("Bravo! You found the right sequence.");
							System.out.println();
							
							this.depart = new Carte(this.objectif);
							
							displayScoreboard();
							startRound();
							displayGame();
							setPlayedFalse();
							break;
						}
						else {
							
							System.out.println("Sorry, you have already played during this round.");
						}
					}
				}
				
				
			} else {
				
				System.out.println("Oh no! You got it wrong.");
				System.out.println();
				
				for (Joueur j : tabJoueurs) {
					if (j.getName().equals(commands[0])) {
						j.setHasPlayed(true);
						break;
					}
				}

			}	
			
		} catch (Exception e) {
			System.err.println("Oops. Something went wrong!");
		}
	}
	
	
	public void setPlayedFalse() {
		
		for (Joueur jr : tabJoueurs) {
			jr.setHasPlayed(false);
		}
	}
	
	
	public boolean isRoundFinished() {
		
		int playerCount = 0;
		
		for (Joueur jr : tabJoueurs) {
			
			if (jr.getHasPlayed()) {
				playerCount++;
			}
	
		}
		
		if (playerCount < this.tabJoueurs.length-1) {
			return false;
		}
		
		else if (playerCount == this.tabJoueurs.length-1) {
			
			for (Joueur jr : tabJoueurs) {
				
				if (!jr.getHasPlayed()) {
					
					jr.increaseScore();
					jr.setHasPlayed(true);
					
					System.out.println(jr.getName() + " won the round by default.");
					break;
				}
		
			}
			
			return true;
		}
		
		else { return true; }
	}
	
	
	public boolean isCardListEmpty() {
		
		return this.cardList.isEmpty();
	}
	
}
