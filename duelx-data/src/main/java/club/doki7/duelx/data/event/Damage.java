package club.doki7.duelx.data.event;

import club.doki7.duelx.core.event.AbstractEvent;
import club.doki7.duelx.core.entity.AbstractEntity;


public final class Damage extends AbstractEvent {
    public int amount;

    public Damage(int eventDepth) {
        super(eventDepth);
    }

    @Override
    public void dispatch(AbstractEntity target) {
    }
}
