package club.doki7.duelx.core.entity;

import club.doki7.duelx.core.behavior.Behavior;

import java.util.HashSet;


public abstract class AbstractEntity {
    public final String name;
    public final int faction;

    public final HashSet<Behavior> behaviors = new HashSet<>();

    protected AbstractEntity(String name, int faction) {
        this.name = name;
        this.faction = faction;
    }
}
