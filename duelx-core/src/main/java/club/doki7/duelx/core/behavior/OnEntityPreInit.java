package club.doki7.duelx.core.behavior;

import club.doki7.duelx.core.entity.AbstractEntity;


@FunctionalInterface
non-sealed public interface OnEntityPreInit extends Behavior {
    void onEntityPreInit(AbstractEntity entity);
}
