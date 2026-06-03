package club.doki7.duelx.core.command;


public interface Magecraft {
    int verseCount();
    default boolean promotable() {
        return false;
    }
}
