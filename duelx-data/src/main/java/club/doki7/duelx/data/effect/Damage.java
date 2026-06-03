package club.doki7.duelx.data.effect;

import club.doki7.duelx.core.effect.AbstractEffect;
import club.doki7.duelx.core.entity.AbstractEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public final class Damage extends AbstractEffect {
    public int amount;

    public Damage(int effectDepth,
                  @Nullable AbstractEntity source,
                  List<AbstractEntity> targets,
                  int tag,
                  int amount) {
        super(effectDepth, source, targets, tag);
        this.amount = amount;
    }

    @Override
    public void dispatch(AbstractEntity target) {
    }
}
