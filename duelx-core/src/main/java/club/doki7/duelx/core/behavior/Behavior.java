package club.doki7.duelx.core.behavior;


public sealed interface Behavior permits
        OnEntityPreInit,
        OnEntityPostInit,
        OnBeforeEvent,
        OnAfterEvent,
        OnBeforeEventGlobal,
        OnAfterEventGlobal
{
    default int priority() {
        return -1;
    }
}
