package club.doki7.duelx.core.event;

import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Onion;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;


public abstract class AbstractEvent {
    public final int eventDepth;
    public final @Nullable AbstractEntity source;

    public List<AbstractEntity> targets;
    public int tag;
    public final HashSet<@Onion(String.class) Object> extraTags;

    protected AbstractEvent(int eventDepth,
                            @Nullable AbstractEntity source,
                            List<AbstractEntity> targets,
                            int tag) {
        this.eventDepth = eventDepth;
        this.source = source;
        this.targets = targets;
        this.tag = tag;
        this.extraTags = new HashSet<>();
    }

    public final void dispatchAll() {}

    abstract public void dispatch(AbstractEntity target);
}
