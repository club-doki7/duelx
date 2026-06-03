package club.doki7.duelx.core.common;

import org.jetbrains.annotations.Nullable;


public record RankMod(Rank rank, @Nullable Modifier modifier) {
    public RankMod {
        assert (rank == Rank.Rank_EX) == (modifier == null);
    }

    public static final RankMod RANK_MOD_EX = new RankMod(Rank.Rank_EX, null);
}
