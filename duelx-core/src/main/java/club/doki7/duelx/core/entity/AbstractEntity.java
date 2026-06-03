package club.doki7.duelx.core.entity;


public abstract class AbstractEntity {
    public final String name;
    public final int faction;

    protected AbstractEntity(String name, int faction) {
        this.name = name;
        this.faction = faction;
    }
}
