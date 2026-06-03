package club.doki7.duelx.data.magecraft;

import club.doki7.duelx.core.command.Command;
import club.doki7.duelx.core.command.Magecraft;


public enum MagecraftMissile implements Command.Action, Magecraft {
    MAGECRAFT_MISSILE;

    @Override
    public String commandName() {
        return "魔法导弹";
    }

    @Override
    public int actionCount() {
        return 1;
    }

    @Override
    public int verseCount() {
        return 1;
    }

    @Override
    public boolean promotable() {
        return true;
    }
}
