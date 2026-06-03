package club.doki7.duelx.core.entity;

public interface Entity<T extends EntityTemplate> {
    T template();
}
