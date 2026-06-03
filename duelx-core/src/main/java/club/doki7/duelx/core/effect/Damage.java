package club.doki7.duelx.core.effect;

import club.doki7.duelx.core.entity.AbstractEntity;
import club.doki7.duelx.util.Onion;

import java.util.List;


public record Damage(
    int amount,
    List<@Onion(Tag.class) Object> tags,
    AbstractEntity source
) implements Effect {
    public enum Tag {
        Physical,
        Magecraft,
        Real,

        Melee,
        Ranged,
        Instant
    }

    void onEntity(AbstractEntity entity) {}
}
