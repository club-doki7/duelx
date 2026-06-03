package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.context.Context;
import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.core.event.AbstractEvent;


@FunctionalInterface
public non-sealed interface OnBeforeEventGlobal extends Behavior {
    void onBeforeEffect(Context cx, AbstractEvent event, AbstractEntity target);
}
