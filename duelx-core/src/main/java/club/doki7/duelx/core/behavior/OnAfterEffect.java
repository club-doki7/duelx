package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.effect.Effect;
import club.doki7.duelx.core.entity.AbstractEntity;


public non-sealed interface OnAfterEffect extends Behavior {
    void onAfterEffect(Effect effect, AbstractEntity target);
}
