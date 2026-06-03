package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.entity.AbstractEntity;


@FunctionalInterface
non-sealed public interface OnEntityPostInit extends Behavior {
    void onEntityPostInit(AbstractEntity entity);
}
