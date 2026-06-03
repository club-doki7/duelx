package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.context.Context;
import club.doki7.duelx.core.event.AbstractEvent;
import club.doki7.duelx.core.entity.AbstractEntity;


public non-sealed interface OnAfterEvent extends Behavior {
    void onAfterEffect(Context cx, AbstractEvent event, AbstractEntity target);
}
