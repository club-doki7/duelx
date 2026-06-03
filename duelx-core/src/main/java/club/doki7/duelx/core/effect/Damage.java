package club.doki7.duelx.core.effect;

import club.doki7.duelx.core.entity.Entity;
import club.doki7.duelx.util.Onion;

import java.util.List;


public record Damage(
    int amount,
    List<@Onion(Tag.class) Object> tags,
    Entity<?> source
) implements Effect {
    public enum Tag {
        Physical,
        Magecraft,
        Real,

        Melee,
        Ranged,
        Instant
    }

    void onEntity(Entity<?> entity) {}
}
