package club.doki7.duelx.data.skillc;

import club.doki7.duelx.core.behavior.Behavior;
import club.doki7.duelx.core.common.RankMod;
import club.doki7.duelx.core.skill.Skill;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public enum MagicResistanceEX_Jeanne implements Skill {
    INSTANCE;

    @Override
    public String skillName() {
        return "对魔力";
    }

    @Override
    public @NotNull RankMod rankMod() {
        return RankMod.RANK_MOD_EX;
    }

    @Override
    public List<Behavior> behaviors() {
        return List.of();
    }

    @Override
    public String description() {
        return "";
    }
}
