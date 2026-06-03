package club.doki7.duelx.core.behavior;


public sealed interface Behavior permits
    OnEntityPreInit,
    OnEntityPostInit,
    OnBeforeEffect,
    OnAfterEffect
{}
