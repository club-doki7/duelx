package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.entity.Entity;
import club.doki7.duelx.util.Predicate;
import org.jetbrains.annotations.Nullable;


non-sealed public interface OnEntityPostInit extends Behavior {
    @Nullable Predicate<Entity<?>> selector();
    void onEntityPostInit(Entity<?> entity);
}
