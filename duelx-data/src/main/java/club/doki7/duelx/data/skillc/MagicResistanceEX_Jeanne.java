package club.doki7.duelx.data.skillc;

import club.doki7.duelx.core.common.RankMod;
import club.doki7.duelx.core.skill.Skill;
import org.jetbrains.annotations.NotNull;


public class MagicResistanceEX_Jeanne implements Skill {
    @Override
    public String name() {
        return "对魔力";
    }

    @Override
    public @NotNull RankMod rankMod() {
        return RankMod.RANK_MOD_EX;
    }

    @Override
    public String description() {
        return "";
    }
}
