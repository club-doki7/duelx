package club.doki7.duelx.data.event;

import club.doki7.duelx.util.Onion;

import java.util.HashSet;


public record AttackTags(int num, HashSet<@Onion(String.class) Object> extra) {
    public AttackTags(int num) {
        this(num, new HashSet<>());
    }

    public static final int MELEE = 0x01;
    public static final int RANGED = 0x02;
    public static final int INSTANT = 0x04;

    public static final int PHYSICAL = 0x08;
    public static final int MAGECRAFT = 0x10;
    public static final int MAGIC = 0x20;
    public static final int REAL = 0x40;

    public static final int SINGLE = 0x80;
    public static final int MULTIPLE = 0x100;
    public static final int AOE = 0x200;

    public boolean isMelee() { return (num & MELEE) != 0; }
    public boolean isRanged() { return (num & RANGED) != 0; }
    public boolean isInstant() { return (num & INSTANT) != 0; }

    public boolean isPhysical() { return (num & PHYSICAL) != 0; }
    public boolean isMagecraft() { return (num & MAGECRAFT) != 0; }
    public boolean isMagic() { return (num & MAGIC) != 0; }
    public boolean isReal() { return (num & REAL) != 0; }

    public boolean isSingle() { return (num & SINGLE) != 0; }
    public boolean isMultiple() { return (num & MULTIPLE) != 0; }
    public boolean isAoe() { return (num & AOE) != 0; }

    public boolean hasExtra(String flag) { return extra.contains(flag); }
}
