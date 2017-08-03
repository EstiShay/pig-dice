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



}
