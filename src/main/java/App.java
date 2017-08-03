import models.Dice;
import models.Game;

public class App {

    //When we call the die, we'll update the randNum attribute with the results of numGenerator...?

    //If numEvaluator returns "adding to total", add that randNum to the player's total

    public static void main(String[] args) {
        Game newGame = new Game();
        Dice ourDice = new Dice();

        //Player 1 rolls the die
        int rollDie = ourDice.numGenerator();
        String rollOutput = ourDice.numEvaluator(rollDie);
        if (rollOutput.equals("Adding to your score")) {
            newGame.player1Total += rollDie;
        }

        //Player 2 rolls the die
        int rollDie = ourDice.numGenerator();
        String rollOutput = ourDice.numEvaluator(rollDie);
        if (rollOutput.equals("Adding to your score")) {
            newGame.player2Total += rollDie;
        }

    }
}
