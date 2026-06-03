package club.doki7.duelx.data.skillp;

import club.doki7.duelx.core.behavior.Behavior;
import club.doki7.duelx.core.common.Rank;
import club.doki7.duelx.core.common.RankMod;
import club.doki7.duelx.core.skill.Skill;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public record EyeOfTheMind(@NotNull RankMod rankMod, boolean isTrue) implements Skill {
    public EyeOfTheMind {
        assert rankMod.rank() != Rank.Rank_EX;
    }

    @Override
    public String name() {
        return isTrue ? "心眼·真" : "心眼·伪";
    }

    @Override
    public String description() {
        return "";
    }

    @Override
    public List<Behavior> behaviors() {
        return List.of();
    }
}
