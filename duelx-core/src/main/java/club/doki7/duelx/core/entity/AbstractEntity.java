package club.doki7.duelx.core.entity;

import club.doki7.duelx.core.behavior.OnAfterEvent;
import club.doki7.duelx.core.behavior.OnBeforeEvent;

import java.util.ArrayList;


public abstract class AbstractEntity {
    public final String name;
    public final int faction;

    public final ArrayList<OnBeforeEvent> onBeforeEvents = new ArrayList<>();
    public final ArrayList<OnAfterEvent> onAfterEvents = new ArrayList<>();

    protected AbstractEntity(String name, int faction) {
        this.name = name;
        this.faction = faction;
    }
}
