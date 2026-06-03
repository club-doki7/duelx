package club.doki7.duelx.util;

@FunctionalInterface
public interface Predicate<T> {
    boolean select(T t);
}
