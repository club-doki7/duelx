package club.doki7.duelx.core.event;

import club.doki7.duelx.core.command.Command;
import club.doki7.duelx.core.entity.AbstractEntity;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;


public abstract class AbstractEvent {
    public final int eventDepth;

    public @Nullable AbstractEntity source = null;
    public @Nullable Command commandCause = null;
    public List<AbstractEntity> targets = List.of();
    public HashMap<String, Object> extra = new HashMap<>();

    public final void dispatchAll() {}

    abstract public void dispatch(AbstractEntity target);

    protected AbstractEvent(int eventDepth) {
        this.eventDepth = eventDepth;
    }
}
