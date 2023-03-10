package com.moonsowrkshop.vexctyapi.rank;

import com.moonsowrkshop.vexctyapi.VexctyAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class NametagManager {

    private VexctyAPI main;

    public NametagManager(VexctyAPI main) {
        this.main = main;
    }



    public void setNametags(Player player) {
        player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
        for (PlayerRank rank : PlayerRank.values()) {
            Team team = player.getScoreboard().registerNewTeam(rank.name());
            team.setPrefix(rank.getDisplay() + " ");
        }
        for (Player tar : Bukkit.getOnlinePlayers()) {

            if (player.getUniqueId() != tar.getUniqueId()) {
                player.getScoreboard().getTeam(main.getRankManager().getRank(tar.getUniqueId()).name()).addEntry(tar.getName());
            }
        }
    }

    public void newTag(Player player) {
        PlayerRank rank = main.getRankManager().getRank(player.getUniqueId());
        for (Player tar : Bukkit.getOnlinePlayers()) {
            tar.getScoreboard().getTeam(rank.name()).addEntry(player.getName());
        }
    }

    public void removeTag(Player player) {
        for (Player tar : Bukkit.getOnlinePlayers()) {
            tar.getScoreboard().getEntryTeam(player.getName()).removeEntry(player.getName());
        }
    }
}
