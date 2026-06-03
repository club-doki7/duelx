package club.doki7.duelx.core.skill;

import club.doki7.duelx.core.common.RankMod;
import org.jetbrains.annotations.Nullable;


public interface Skill {
    String name();
    String description();
    @Nullable RankMod rankMod();
}
