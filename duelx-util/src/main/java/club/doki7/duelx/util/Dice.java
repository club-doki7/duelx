package club.doki7.duelx.util;

import org.jetbrains.annotations.NotNull;

import java.util.Random;


public final class Dice {
    public enum Mode {
        NORMAL, ADVANTAGE, DISADVANTAGE
    }

    public Dice() {
        this.rng = new Random();
    }

    public Dice(long seed) {
        this.rng = new Random(seed);
    }

    public int roll(int count, int sides, @NotNull Mode mode) {
        return switch (mode) {
            case NORMAL -> rollPool(count, sides);
            case ADVANTAGE -> Math.max(rollPool(count, sides), rollPool(count, sides));
            case DISADVANTAGE -> Math.min(rollPool(count, sides), rollPool(count, sides));
        };
    }

    public int roll(int count, int sides) {
        return roll(count, sides, Mode.NORMAL);
    }

    private int rollPool(int count, int sides) {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += rng.nextInt(sides) + 1;
        }
        return total;
    }

    private final Random rng;
}
