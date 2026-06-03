package club.doki7.duelx.util;

@FunctionalInterface
public interface Predicate2<T1, T2> {
    boolean select(T1 t1, T2 t2);
}
