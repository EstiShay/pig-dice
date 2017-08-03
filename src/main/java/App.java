import models.Dice;
import models.Game;

public class App {

    //When we call the die, we'll update the randNum attribute with the results of numGenerator...?

    //If numEvaluator returns "adding to total", add that randNum to the player's total

    public static void main(String[] args) {
        Game newGame = new Game();
        Dice ourDice = new Dice();

        while (newGame.player1Total < 100 && newGame.player2Total < 100) {

            if (newGame.whoseTurn.equals("Player 1")) {
                int rollDie = ourDice.numGenerator();
                String rollOutput = ourDice.numEvaluator(rollDie);
                if (rollOutput.equals("Adding to your score")) {
                    System.out.println(String.format("Adding %d to your score", rollDie));
                    newGame.player1Total += rollDie;
                } else {
                    newGame.whoseTurn = "Player 2";
                    System.out.println("Turn over. Player 2 rolls next.");
                }
            } else if (newGame.whoseTurn.equals("Player 2")) {
                int rollDie = ourDice.numGenerator();
                String rollOutput = ourDice.numEvaluator(rollDie);
                if (rollOutput.equals("Adding to your score")) {
                    System.out.println(String.format("Adding %d to your score", rollDie));
                    newGame.player2Total += rollDie;
                } else {
                    newGame.whoseTurn = "Player 1";
                    System.out.println("Turn over. Player 1 rolls next.");
                }
            } else {
                System.out.println("Error");
            }
        }
        System.out.println(String.format("Player 1's score: %d", newGame.player1Total));
        System.out.println(String.format("Player 2's score: %d", newGame.player2Total));
    }
}
