package org.saltedfish.saltedeconomy;

import org.bukkit.plugin.java.JavaPlugin;

public final class SaltedEconomy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("SaltedEconomy is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SaltedEconomy is disabled!");
    }

}
