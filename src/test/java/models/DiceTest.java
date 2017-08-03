package models;

import org.junit.Test;

import static org.junit.Assert.*;


public class DiceTest {

    @Test
    public void Dice_createsDie_instantiatesCorrectly() throws Exception {
        Dice testDice = new Dice();
        assertEquals(true, testDice instanceof Dice);
    }

}