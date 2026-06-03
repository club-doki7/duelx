package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.effect.Effect;
import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Predicate2;
import org.jetbrains.annotations.Nullable;


public non-sealed interface OnBeforeEffect extends Behavior {
    @Nullable Predicate2<Effect, AbstractEntity> selector();
    void onBeforeEffect(Effect effect, AbstractEntity target);
}
