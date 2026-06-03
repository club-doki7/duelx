package club.doki7.duelx.data.magecraft;

import club.doki7.duelx.core.command.Command;
import club.doki7.duelx.core.command.Magecraft;
import club.doki7.duelx.core.context.Context;
import club.doki7.duelx.core.entity.AbstractEntity;

import java.util.List;

public enum Gandr implements Command.Action, Magecraft {
    GANDR;

    @Override
    public String commandName() {
        return "Gandr 射击";
    }

    @Override
    public int actionCount() {
        return 1;
    }

    @Override
    public int verseCount() {
        return 0;
    }

    @Override
    public TargetKind targetKind() {
        return TargetKind.SINGLE;
    }

    @Override
    public void execute(Context cx, AbstractEntity source, List<AbstractEntity> targets) {

    }
}
