package club.doki7.duelx.data.action;

import club.doki7.duelx.core.command.Command;


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
}
