/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 * @modifier Aneeq Ahmed Khoso
 */
package bluff_card_game;

import bluff_card_game.Bluff_Card_Game;
import bluff_card_game.Card;
import bluff_card_game.GroupOfCards;
import bluff_card_game.Game;

        
public class Player {

	private String playerName;
	private int playerScore;

	public Player() {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}
        
        Card card = new Card();
        GroupOfCards  gc= new GroupOfCards();
        
     

	public String getPlayerName() {
		return this.playerName;
	}

	/**
	 * 
	 * @param playerName
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return this.playerScore;
	}

	/**
	 * 
	 * @param playerScore
	 */
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public void getAttribute() {
		// TODO - implement Player.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Player.setAttribute
		throw new UnsupportedOperationException();
	}

	public void calScore() {
		// TODO - implement Player.calScore
		throw new UnsupportedOperationException();
	}

}
