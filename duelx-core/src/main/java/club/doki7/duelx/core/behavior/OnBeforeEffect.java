package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.effect.Effect;
import club.doki7.duelx.core.entity.Entity;
import club.doki7.duelx.util.Predicate2;
import org.jetbrains.annotations.Nullable;


public non-sealed interface OnBeforeEffect extends Behavior {
    @Nullable Predicate2<Effect, Entity<?>> selector();
    void onBeforeEffect(Effect effect, Entity<?> target);
}
