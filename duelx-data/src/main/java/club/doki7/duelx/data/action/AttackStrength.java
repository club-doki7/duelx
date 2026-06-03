package club.doki7.duelx.data.action;

import club.doki7.duelx.core.command.Command;
import club.doki7.duelx.core.context.Context;
import club.doki7.duelx.core.entity.AbstractEntity;

import java.util.List;


public enum AttackStrength implements Command.Action {
    ATTACK_STRENGTH;

    @Override
    public String commandName() {
        return "力击";
    }

    @Override
    public int actionCount() {
        return 1;
    }

    @Override
    public TargetKind targetKind() {
        return TargetKind.SINGLE;
    }

    @Override
    public void execute(Context cx, AbstractEntity source, List<AbstractEntity> targets) {

    }
}
