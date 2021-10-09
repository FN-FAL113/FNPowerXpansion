package me.fnfal113.fnpowergenerators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import me.fnfal113.fnpowergenerators.Generators.PowerGens;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class FNPowerGenerators extends JavaPlugin implements SlimefunAddon {

    private static FNPowerGenerators instance;

    @Override
    public void onEnable() {
        setInstance(this);

        getLogger().info("************************************************************");
        getLogger().info("*         FN Power Xpansion - Created by FN_FAL113         *");
        getLogger().info("* Credits to Jeff(LiteXpansion) and Walshy(SF) for letting *");
        getLogger().info("*            me use their utils and resources              *");
        getLogger().info("************************************************************");

        ITEMSetup.INSTANCE.init();

        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }


    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Override
    public String getBugTrackerURL() {
        return null;
    }

    private static void setInstance(FNPowerGenerators ins) {
        instance = ins;
    }

    public static FNPowerGenerators getInstance() {
        return instance;
    }
}
