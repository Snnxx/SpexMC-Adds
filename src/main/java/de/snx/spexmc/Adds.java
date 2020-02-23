package de.snx.spexmc;

import de.snx.spexmc.listener.PlayerJoinListener;
import de.snx.spexmc.task.AddTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Adds extends JavaPlugin {

    public static Adds instance;

    @Override
    public void onEnable() {
        instance = this;
        AddTask.startAdds();
        PluginManager load = Bukkit.getPluginManager();
        load.registerEvents(new PlayerJoinListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static Adds getInstance() {
        return instance;
    }
}