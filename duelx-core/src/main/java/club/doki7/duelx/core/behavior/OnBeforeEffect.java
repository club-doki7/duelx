package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.effect.Effect;
import club.doki7.duelx.core.entity.AbstractEntity;


public non-sealed interface OnBeforeEffect extends Behavior {
    void onBeforeEffect(Effect effect, AbstractEntity target);
}
