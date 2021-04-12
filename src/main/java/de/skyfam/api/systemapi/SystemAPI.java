/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi;

import de.skyfam.api.systemapi.commands.*;
import de.skyfam.api.systemapi.listener.*;
import de.skyfam.api.systemapi.manager.*;
import de.skyfam.api.systemapi.mysql.*;
import de.skyfam.api.systemapi.npcs.*;
import de.skyfam.api.systemapi.scoreboards.*;
import de.skyfam.api.systemapi.utils.*;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SystemAPI extends JavaPlugin {

    private static SystemAPI instance;

    public U_Strings strings;
    public U_Messages messages;


    /* MySQL */
    public MySQL_System sqlSystem;
    public MySQL_ACP sqlACP;
    public MySQL_Language sqlLanguage;

    /* Databases */
    public DB_System systemDatabase;
    public DB_Login loginDatabase;
    public DB_Language languageDatabase;
    public DB_Player playerDatabase;

    /* Locations */


    /* NPCs */


    @Override
    public void onEnable() {
        instance = this;
        strings = new U_Strings();
        messages = new U_Messages();


        sqlSystem = new MySQL_System("127.0.0.1", 3306, "systemapi", "Blgt^966");
        sqlACP = new MySQL_ACP("127.0.0.1", 3306, "acp_admin", "r9n2l7D@");
        sqlLanguage = new MySQL_Language("127.0.0.1", 3306, "lang_admin", "E51%fge3");


        systemDatabase = new DB_System();
        loginDatabase = new DB_Login();
        languageDatabase = new DB_Language();
        playerDatabase = new DB_Player();


        if(Bukkit.getServer().getPluginManager().getPlugin("LabyModAPI") == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            Bukkit.getConsoleSender().sendMessage(strings.API + "SystemAPI wurde deaktiviert!");
            Bukkit.getConsoleSender().sendMessage(strings.API + "Grund: LabyModAPI wurde nicht gefunden...");
        }
        if(Bukkit.getServer().getPluginManager().getPlugin("HeadDatabase") == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            Bukkit.getConsoleSender().sendMessage(strings.API + "SystemAPI wurde deaktiviert!");
            Bukkit.getConsoleSender().sendMessage(strings.API + "Grund: HeadDatabase wurde nicht gefunden...");
        }


        Bukkit.getConsoleSender().sendMessage(strings.API + "SystemAPI wurde aktiviert!");


        /* Register | Commands */
        getCommand("gamemode").setExecutor(new CMD_Gamemode());
        getCommand("vanish").setExecutor(new CMD_Vanish());
        getCommand("language").setExecutor(new CMD_Language());


        /* Register | Listener */
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new L_JoinQuit(), this);
        pluginManager.registerEvents(new L_InteractInventory(), this);


        /* Register | Scoreboard's */
        SB_LobbySystem lobbyScoreboard = new SB_LobbySystem();


        /* Register | Manager */
        pluginManager.registerEvents(new M_Chat(), this);
        new M_Tablist().startScheduler();

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(strings.API + "SystemAPI wurde deaktiviert!");

    }

    public static SystemAPI getInstance() {
        return instance;
    }
}
