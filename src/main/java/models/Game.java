package models;


public class Game {

    public String whoseTurn;
    public int player1Total;
    public int player2Total;

    public Game() {
        this.whoseTurn = "Player 1";
        this.player1Total = 0;
        this.player2Total = 0;
    }
}
