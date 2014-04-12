package db.core;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

    @Test
    public void itShouldRollResultsWithinRange() {
        Dice dice = Dice.create(6);

        for (int i = 0; i < 1000; i++) {
            int result = dice.roll();

            assertTrue(
                    String.format("%d not on 6 side die", result),
                    result > 0 && result <= 6);
        }
    }

    @Test(expected=IllegalArgumentException.class)
    public void itShouldNotAllowLessThanZeroSides() {
        Dice.create(0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void itShouldNotAllowLessThanOneSide() {
        Dice.create(-1000);
    }
}
