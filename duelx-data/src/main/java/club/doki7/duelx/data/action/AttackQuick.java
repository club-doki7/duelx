package club.doki7.duelx.data.action;

import club.doki7.duelx.core.command.Command;


public enum AttackQuick implements Command.Action {
    ATTACK_QUICK;

    @Override
    public String commandName() {
        return "迅击";
    }

    @Override
    public int actionCount() {
        return 1;
    }
}
