package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Predicate;
import org.jetbrains.annotations.Nullable;


non-sealed public interface OnEntityPostInit extends Behavior {
    void onEntityPostInit(AbstractEntity entity);
}
