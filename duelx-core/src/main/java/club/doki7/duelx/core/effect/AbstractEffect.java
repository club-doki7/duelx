package club.doki7.duelx.core.effect;

import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Onion;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;


public abstract class AbstractEffect {
    public final int effectDepth;
    public final @Nullable AbstractEntity source;

    public List<AbstractEntity> targets;
    public int tag;
    public final HashSet<@Onion(String.class) Object> extraTags;

    protected AbstractEffect(int effectDepth,
                             @Nullable AbstractEntity source,
                             List<AbstractEntity> targets,
                             int tag) {
        this.effectDepth = effectDepth;
        this.source = source;
        this.targets = targets;
        this.tag = tag;
        this.extraTags = new HashSet<>();
    }

    public final void dispatchAll() {}

    abstract public void dispatch(AbstractEntity target);
}
