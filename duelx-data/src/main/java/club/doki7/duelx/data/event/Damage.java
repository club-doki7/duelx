package club.doki7.duelx.data.event;

import club.doki7.duelx.core.event.AbstractEvent;
import club.doki7.duelx.core.entity.AbstractEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public final class Damage extends AbstractEvent {
    public int amount;

    public Damage(int eventDepth,
                  @Nullable AbstractEntity source,
                  List<AbstractEntity> targets,
                  int tag,
                  int amount) {
        super(eventDepth, source, targets, tag);
        this.amount = amount;
    }

    @Override
    public void dispatch(AbstractEntity target) {
    }
}
