package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Predicate;
import org.jetbrains.annotations.Nullable;


non-sealed public interface OnEntityPostInit extends Behavior {
    @Nullable Predicate<AbstractEntity> selector();
    void onEntityPostInit(AbstractEntity entity);
}
