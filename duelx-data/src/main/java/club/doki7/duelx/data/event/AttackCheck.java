package club.doki7.duelx.data.event;

import club.doki7.duelx.core.event.AbstractEvent;
import club.doki7.duelx.core.entity.AbstractEntity;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public final class AttackCheck extends AbstractEvent {
    public int attackerDiceCount = -1;
    public int defenderDiceCount = -1;
    public int hitDifficulty = 3;

    public int attackerAdvantage = 0;
    public int defenderAdvantage = 0;

    public AttackCheck(int eventDepth,
                       @Nullable AbstractEntity source,
                       List<AbstractEntity> targets,
                       int tag) {
        super(eventDepth, source, targets, tag);
    }

    @Override
    public void dispatch(AbstractEntity target) {
    }
}
