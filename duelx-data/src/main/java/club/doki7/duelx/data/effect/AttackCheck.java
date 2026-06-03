package club.doki7.duelx.data.effect;

import club.doki7.duelx.core.effect.AbstractEffect;
import club.doki7.duelx.core.entity.AbstractEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class AttackCheck extends AbstractEffect {
    public AttackCheck(int effectDepth,
                       @Nullable AbstractEntity source,
                       List<AbstractEntity> targets,
                       int tag) {
        super(effectDepth, source, targets, tag);
    }

    @Override
    public void dispatch(AbstractEntity target) {
    }
}
