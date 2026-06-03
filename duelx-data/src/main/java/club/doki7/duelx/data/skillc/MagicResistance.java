package club.doki7.duelx.data.skillc;

import club.doki7.duelx.core.common.Rank;
import club.doki7.duelx.core.common.RankMod;
import club.doki7.duelx.core.skill.Skill;
import org.jetbrains.annotations.NotNull;


public record MagicResistance(@NotNull RankMod rankMod) implements Skill {
    public MagicResistance {
        assert rankMod.rank() != Rank.Rank_EX;
    }

    @Override
    public String name() {
        return "对魔力";
    }

    @Override
    public String description() {
        return "";
    }
}
