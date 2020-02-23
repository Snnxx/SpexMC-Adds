package de.snx.spexmc.listener;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import sun.misc.BASE64Decoder;

import java.io.IOException;

public class PlayerJoinListener implements Listener {

    private String decodedMessage;

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) throws IOException {
        Player player = event.getPlayer();
        String encodedMessage = "RGllc2VyIFNlcnZlciB3aXJkIHZvbiBTcGV4TUMuZGUgZ2VzcG9uc2VydC4";
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] decodedBytes = decoder.decodeBuffer(encodedMessage);
        event.getPlayer().sendMessage(ChatColor.GREEN + decodedBytes.toString());
    }
}