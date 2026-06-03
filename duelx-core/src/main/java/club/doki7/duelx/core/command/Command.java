package club.doki7.duelx.core.command;


import club.doki7.duelx.core.event.AbstractEvent;

public sealed interface Command {
    String commandName();
    int actionCount();

    non-sealed interface Action extends Command {
        enum TargetKind { SELF, SINGLE, MULTIPLE, AOE, GLOBAL }
    }

    non-sealed interface Reaction extends Command {
        boolean canReactTo(AbstractEvent event);
    }
}
