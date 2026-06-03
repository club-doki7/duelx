package club.doki7.duelx.core.command;


import club.doki7.duelx.core.context.Context;
import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.core.event.AbstractEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public sealed interface Command {
    String commandName();
    int actionCount();

    non-sealed interface Action extends Command {
        enum TargetKind { SELF, SINGLE, MULTIPLE, AOE, GLOBAL }

        TargetKind targetKind();
        void execute(Context cx, AbstractEntity source, List<AbstractEntity> targets);

        default void execute(Context cx, AbstractEntity source) {
            execute(cx, source, List.of());
        }

        default void execute(Context cx, AbstractEntity source, @Nullable AbstractEntity target) {
            if (target == null) {
                execute(cx, source, List.of());
            } else {
                execute(cx, source, List.of(target));
            }
        }
    }

    non-sealed interface Reaction extends Command {
        boolean canReactTo(AbstractEvent event);
    }
}
