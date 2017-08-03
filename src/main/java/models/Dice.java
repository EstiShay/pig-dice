package models;
import java.util.Random;

public class Dice {
    Random myRandomGenerator = new Random();
    public int randNum;

    public Dice (){
        this.randNum = 0;
    }

    public int numGenerator() {
        int aRandNum = myRandomGenerator.nextInt(6);
        return aRandNum +=1;
    }

    public String numEvaluator(int num) {
        if (num == 1) {
            return "Turn over";
        } else if (num > 0 && num < 7) {
            return "Adding to your score";
        } else {
            return "Error";
        }
    }



}
