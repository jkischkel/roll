package db.core;

import java.util.Random;

import com.google.common.base.Preconditions;

public final class Dice {

    private final int sides;

    private final Random random;

    private Dice(int sides) {
        this.sides = sides;
        random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }

    @Override
    public String toString() {
        return String.format("%d sided Die", sides);
    }

    public static Dice create(int sides) {
        Preconditions.checkArgument(sides > 0, "Less than zero sides.");

        return new Dice(sides);
    }
}
