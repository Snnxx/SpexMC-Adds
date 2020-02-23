package de.snx.spexmc.task;

import de.snx.spexmc.Adds;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class AddTask {

    public static void startAdds() {
        new BukkitRunnable() {
            public void run() {
                for(Player players : Bukkit.getOnlinePlayers()){
                    players.sendMessage("");
                    players.sendMessage("§cDieser Server wird von SpexMC.de gesponsert.");
                    players.sendMessage("");
                }
            }
        }.runTaskTimer(Adds.getInstance(), 3000L, 6000L);
    }
}