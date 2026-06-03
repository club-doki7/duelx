package club.doki7.duelx.core.effect;

public final class EffectTag {
    public static final long MELEE = 1;
    public static final long RANGED = 1 << 1;
    public static final long INSTANT = 1 << 2;

    public static final long PHYSICAL = 1 << 3;
    public static final long MAGECRAFT = 1 << 4;
    public static final long MAGIC = 1 << 5;

    public static final long NEUTRAL = 1 << 6;
    public static final long FRIENDLY = 1 << 7;
    public static final long HOSTILE = 1 << 8;

    public static final long AOE = 1 << 9;

    public static boolean isMelee(long tag) {
        return (tag & MELEE) != 0;
    }

    public static boolean isRanged(long tag) {
        return (tag & RANGED) != 0;
    }

    public static boolean isInstant(long tag) {
        return (tag & INSTANT) != 0;
    }

    public static boolean isPhysical(long tag) {
        return (tag & PHYSICAL) != 0;
    }

    public static boolean isMagecraft(long tag) {
        return (tag & MAGECRAFT) != 0;
    }

    public static boolean isMagic(long tag) {
        return (tag & MAGIC) != 0;
    }

    public static boolean isNeutral(long tag) {
        return (tag & NEUTRAL) != 0;
    }

    public static boolean isFriendly(long tag) {
        return (tag & FRIENDLY) != 0;
    }

    public static boolean isHostile(long tag) {
        return (tag & HOSTILE) != 0;
    }

    public static boolean isAOE(long tag) {
        return (tag & AOE) != 0;
    }
}
