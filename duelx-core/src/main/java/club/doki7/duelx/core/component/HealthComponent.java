package club.doki7.duelx.core.component;

import club.doki7.duelx.core.entity.Entity;


public final class HealthComponent<E extends Entity<?>> implements Component {
    public final Entity<?> entity;
    public final int principalMaxHealth;
    public int health;
    public int maxHealth;

    public HealthComponent(Entity<?> entity, int health, int maxHealth) {
        this.entity = entity;
        this.health = health;
        this.maxHealth = maxHealth;
        this.principalMaxHealth = maxHealth;
    }

    public HealthComponent(int maxHealth, Entity<?> entity) {
        this(entity, maxHealth, maxHealth);
    }

    public boolean isDestroyed() {
        return health <= 0;
    }

    public boolean takeDamage(int damage) {
        health -= damage;
        return isDestroyed();
    }

    public boolean heal(int heal) {
        health += heal;
        if (health > maxHealth) {
            health = maxHealth;
        }
        return health == maxHealth;
    }
}
