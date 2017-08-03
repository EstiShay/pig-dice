import models.Dice;
import models.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {


    public static void main(String[] args) {
        Game newGame = new Game();
        Dice ourDice = new Dice();

        int player1TempTotal = 0;
        int player2TempTotal = 0;

        while (newGame.player1Total < 100 && newGame.player2Total < 100) {

            try {

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(String.format("%s: Do you want to roll or hold?", newGame.whoseTurn));
                String inputString = bufferedReader.readLine();

                if (newGame.whoseTurn.equals("Player 1")) {
                    if (inputString.equals("roll")) {
                        int rollDie = ourDice.numGenerator();
                        String rollOutput = ourDice.numEvaluator(rollDie);
                        if (rollOutput.equals("Adding to your score")) {
                            System.out.println(String.format("Adding %d to your score", rollDie));
                            player1TempTotal += rollDie;
                        } else {
                            newGame.whoseTurn = "Player 2";
                            System.out.println("Turn over. Player 2 rolls next.");
                            System.out.println("********************************");
                        }
                    } else if (inputString.equals("hold")) {
                        newGame.player1Total += player1TempTotal;
                        player1TempTotal = 0;
                        newGame.whoseTurn = "Player 2";
                        System.out.println(String.format("Player 1 your total is %d.", newGame.player1Total));
                        System.out.println("Turn over. Player 2 rolls next.");
                        System.out.println("********************************");
                    } else {
                        System.out.println("Error");
                    }
                } else if (newGame.whoseTurn.equals("Player 2")) {
                    if (inputString.equals("roll")) {
                        int rollDie = ourDice.numGenerator();
                        String rollOutput = ourDice.numEvaluator(rollDie);
                        if (rollOutput.equals("Adding to your score")) {
                            System.out.println(String.format("Adding %d to your score", rollDie));
                            player2TempTotal += rollDie;
                        } else {
                            newGame.whoseTurn = "Player 1";
                            System.out.println("Turn over. Player 1 rolls next.");
                            System.out.println("********************************");
                        }
                    } else if (inputString.equals("hold")) {
                        newGame.player2Total += player2TempTotal;
                        player2TempTotal = 0;
                        newGame.whoseTurn = "Player 1";
                        System.out.println(String.format("Player 2 your total is %d.", newGame.player2Total));
                        System.out.println("Turn over. Player 1 rolls next.");
                        System.out.println("********************************");
                    } else {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("Error");
                }

            } catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println(String.format("Player 1's score: %d", newGame.player1Total));
        System.out.println(String.format("Player 2's score: %d", newGame.player2Total));
    }
}
