package club.doki7.duelx.core.skill;

import club.doki7.duelx.core.behavior.Behavior;
import club.doki7.duelx.core.common.RankMod;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public interface Skill {
    String name();
    String description();
    @Nullable RankMod rankMod();

    List<Behavior> behaviors();
}
