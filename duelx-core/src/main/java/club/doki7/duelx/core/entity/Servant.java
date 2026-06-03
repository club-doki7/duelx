package club.doki7.duelx.core.entity;

import club.doki7.duelx.core.common.Attributes;
import club.doki7.duelx.util.Union;


public record Servant(String name,
                      @Union({ServantClass.class, String.class}) Object servantClass,
                      Attributes attributes)
    implements EntityTemplate
{}
