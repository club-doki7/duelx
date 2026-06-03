package club.doki7.duelx.core.context;

import club.doki7.duelx.core.behavior.OnAfterEventGlobal;
import club.doki7.duelx.core.behavior.OnBeforeEventGlobal;

import java.util.ArrayList;

public final class Context {
    public final ArrayList<OnBeforeEventGlobal> globalBeforeEvents = new ArrayList<>();
    public final ArrayList<OnAfterEventGlobal> globalAfterEvents = new ArrayList<>();
}
