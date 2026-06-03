package club.doki7.duelx.core.common;


public sealed interface Rank {
    RankEX Rank_EX = RankEX.Rank_EX;
    RankNum Rank_E = RankNum.Rank_E;
    RankNum Rank_D = RankNum.Rank_D;
    RankNum Rank_C = RankNum.Rank_C;
    RankNum Rank_B = RankNum.Rank_B;
    RankNum Rank_A = RankNum.Rank_A;

    enum RankNum implements Rank {
        Rank_E(1),
        Rank_D(2),
        Rank_C(3),
        Rank_B(4),
        Rank_A(5);

        public final int value;

        RankNum(int value) {
            this.value = value;
        }
    }

    enum RankEX implements Rank { Rank_EX; }
}
