package io.th0rgal.oraxen.mechanics.provided.witherskull;

import io.th0rgal.oraxen.mechanics.Mechanic;
import io.th0rgal.oraxen.mechanics.MechanicFactory;
import io.th0rgal.oraxen.utils.timers.Timer;
import io.th0rgal.oraxen.utils.timers.TimersFactory;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

public class WitherSkullMechanic extends Mechanic {

    private final TimersFactory timersFactory;
    public final boolean charged;

    public WitherSkullMechanic(MechanicFactory mechanicFactory, ConfigurationSection section) {
        super(mechanicFactory, section);
        this.timersFactory = new TimersFactory(section.getLong("delay"));
        this.charged = section.getBoolean("charged");
    }

    public Timer getTimer(Player player) {
        return timersFactory.getTimer(player);
    }

}