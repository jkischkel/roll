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

    public RollResult roll() {
        int result =  random.nextInt(sides) + 1;
        return RollResult.create(result);
    }

    @Override
    public String toString() {
        return String.format("%d sided Die", sides);
    }

    public static Dice create(int sides) {
        Preconditions.checkArgument(sides > 0, "Less than zero sides.");

        return new Dice(sides);
    }

    public static class RollResult {

        private final int result;

        private final long timestamp;

        RollResult(int result, long timestamp) {
            this.result = result;
            this.timestamp = timestamp;
        }

        public int getResult() {
            return result;
        }

        public long getTimestamp() {
            return timestamp;
        }

        static RollResult create(int result) {
            return new RollResult(result, System.currentTimeMillis());
        }
    }
}
