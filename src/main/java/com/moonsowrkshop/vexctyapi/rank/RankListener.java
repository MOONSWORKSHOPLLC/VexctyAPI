package com.moonsowrkshop.vexctyapi.rank;

import com.moonsowrkshop.vexctyapi.VexctyAPI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class RankListener implements Listener {

    private VexctyAPI main;

    public RankListener(VexctyAPI main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        main.getNametagManager().setNametags(player);
        main.getNametagManager().newTag(player);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        main.getNametagManager().removeTag(e.getPlayer());
    }

}
