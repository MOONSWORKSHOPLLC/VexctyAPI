package com.moonsowrkshop.vexctyapi;

import com.moonsowrkshop.vexctyapi.lang.Lang;
import com.moonsowrkshop.vexctyapi.lang.LangCommand;
import com.moonsowrkshop.vexctyapi.lang.LangManager;
import com.moonsowrkshop.vexctyapi.rank.NametagManager;
import com.moonsowrkshop.vexctyapi.rank.Perks;
import com.moonsowrkshop.vexctyapi.rank.RankListener;
import com.moonsowrkshop.vexctyapi.rank.RankManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class VexctyAPI extends JavaPlugin {

    private LangManager langManager;
    private RankManager rankManager; // rank manager
    private NametagManager nametagManager; // name tag manager
    private Perks perks; // perks manager

    @Override
    public void onEnable() {

        rankManager = new RankManager(this);
        nametagManager = new NametagManager(this);
        perks = new Perks(this);

        langManager = new LangManager(this);

        Bukkit.getPluginManager().registerEvents(new RankListener(this), this);

        registerCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands() {
        getCommand("lang").setExecutor(new LangCommand(this));
    }

    public LangManager getLangManager() {
        return langManager;
    }

    public NametagManager getNametagManager() {
        return nametagManager;
    }

    public RankManager getRankManager() {
        return rankManager;
    }
}
