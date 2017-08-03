package models;

import org.junit.Test;

import static org.junit.Assert.*;


public class DiceTest {

    @Test
    public void Dice_createsDie_instantiatesCorrectly() throws Exception {
        Dice testDice = new Dice();
        assertEquals(true, testDice instanceof Dice);
    }

    @Test
    public void numGenerator_createsRandomNumber_1to6() throws Exception {
        Dice testDice = new Dice();
        boolean checkNum = (0 < testDice.numGenerator() && testDice.numGenerator() <= 6);
        assertEquals(true, checkNum);
    }

}