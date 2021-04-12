/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.scoreboards;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class SB_LobbySystem {

    private static Integer Counter_Title;

    private String[] Animation_Title = new String[] {

            "§8» §8«",
            "§8» §bS §8«",
            "§8» §bSk §8«",
            "§8» §bSky §8«",
            "§8» §bSky§9F §8«",
            "§8» §bSky§9Fa §8«",
            "§8» §bSky§9Fam §8«",
            "§8» §bSky§9Fam§7. §8«",
            "§8» §bSky§9Fam§7.§cd §8«",

            "§8» §bSky§9Fam§7.§cde §8«",
            "§8» §bSky§9Fam§7.§cde §8«",
            "§8» §bSky§9Fam§7.§cde §8«",
            "§8» §bSky§9Fam§7.§cde §8«",
            "§8» §bSky§9Fam§7.§cde §8«",
            "§8» §bSky§9Fam§7.§cde §8«",

            "§8» §bSky§9Fam§7.§cd §8«",
            "§8» §bSky§9Fam§7. §8«",
            "§8» §bSky§9Fam §8«",
            "§8» §bSky§9Fa §8«",
            "§8» §bSky§9F §8«",
            "§8» §bSky §8«",
            "§8» §bSk §8«",
            "§8» §bS §8«",
            "§8» §8«"

    };

    public void setScoreboard(Player player) {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.getObjective("main-content");



        //Create Objective | setDisplaySlot
        if(objective == null)
            objective = scoreboard.registerNewObjective("main-content", "dummy");

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);


        //Team Register
        Team Profile = scoreboard.registerNewTeam("Profil");
        Team Nickel = scoreboard.registerNewTeam("Nickel");
        Team Lobby = scoreboard.registerNewTeam("Lobby");
        Team Social = scoreboard.registerNewTeam("Social");


        //Team Prefix, Suffix & Entry | String set
        String playerName = player.getDisplayName();
        String playerNickel = "";
        String activeLobby = Bukkit.getServerName();

        Profile.setPrefix("§7➥ §6");
        Profile.setSuffix("§6" + playerName);
        Profile.addEntry(ChatColor.GOLD.toString());

        Lobby.setPrefix("§7➥ §6");
        Lobby.setSuffix("§6" + activeLobby);
        Lobby.addEntry(ChatColor.BLUE.toString());

        Nickel.setPrefix("§7➥ §6");
        Nickel.setSuffix("§6" + playerNickel);
        Nickel.addEntry(ChatColor.AQUA.toString());


        //Scoreboard Design
        objective.getScore("§0 ").setScore(12);
        objective.getScore("§7» §a§oProfil").setScore(11);
        objective.getScore(ChatColor.GOLD.toString()).setScore(10);
        objective.getScore("§1 ").setScore(9);
        objective.getScore("§7» §a§oLobby").setScore(8);
        objective.getScore(ChatColor.BLUE.toString()).setScore(7);
        objective.getScore("§2 ").setScore(6);
        objective.getScore("§7» §a§oDeine Nickel").setScore(5);
        objective.getScore(ChatColor.AQUA.toString()).setScore(4);
        objective.getScore("§3 ").setScore(3);
        objective.getScore("§7» §a§oDiscord").setScore(2);
        objective.getScore("§7➥ §6Kt6fj6y").setScore(1);
        objective.getScore("§4 ").setScore(0);

    }

    public void updateScoreboard(Player player) {
        Scoreboard scoreboard = player.getScoreboard();
        Objective objective = scoreboard.getObjective("main-content");


        //Team Management
        Team Profile = scoreboard.getTeam("Profil");
        Team Nickel = scoreboard.getTeam("Nickel");
        Team Lobby = scoreboard.getTeam("Lobby");
        Team Social = scoreboard.getTeam("Social");


        //Team Register
        if(Profile == null)
            Profile = scoreboard.registerNewTeam("Profil");
        if(Lobby == null)
            Lobby = scoreboard.registerNewTeam("Lobby");
        if(Nickel == null)
            Nickel = scoreboard.registerNewTeam("Nickel");
        if(Social == null)
            Social = scoreboard.registerNewTeam("Social");


        //Team Prefix, Suffix & Entry | String set
        String playerName = player.getDisplayName();
        String playerNickel = "";
        String activeLobby = Bukkit.getServerName();

        Profile.setPrefix("§7➥ §6");
        Profile.setSuffix("§6" + playerName);
        Profile.addEntry(ChatColor.GOLD.toString());

        Lobby.setPrefix("§7➥ §6");
        Lobby.setSuffix("§6" + activeLobby);
        Lobby.addEntry(ChatColor.BLUE.toString());

        Nickel.setPrefix("§7➥ §6");
        Nickel.setSuffix("§6" + playerNickel);
        Nickel.addEntry(ChatColor.AQUA.toString());


        //Scoreboard Design
        objective.getScore("§0 ").setScore(12);
        objective.getScore("§7» §a§oProfil").setScore(11);
        objective.getScore(ChatColor.GOLD.toString()).setScore(10);
        objective.getScore("§1 ").setScore(9);
        objective.getScore("§7» §a§oLobby").setScore(8);
        objective.getScore(ChatColor.BLUE.toString()).setScore(7);
        objective.getScore("§2 ").setScore(6);
        objective.getScore("§7» §a§oDeine Nickel").setScore(5);
        objective.getScore(ChatColor.AQUA.toString()).setScore(4);
        objective.getScore("§3 ").setScore(3);
        objective.getScore("§7» §a§oDiscord").setScore(2);
        objective.getScore("§7➥ §6Kt6fj6y").setScore(1);
        objective.getScore("§4 ").setScore(0);

    }

    public void startAnimation() {
        Counter_Title = 0;
        Bukkit.getScheduler().runTaskTimer(SystemAPI.getPlugin(SystemAPI.class), new Runnable() {

            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(current -> {
                    if(current.getScoreboard() == null)
                        setScoreboard(current);


                    current.getScoreboard()
                            .getObjective(DisplaySlot.SIDEBAR)
                            .setDisplayName(Animation_Title[Counter_Title]);

                });
                Counter_Title++;

                if(Counter_Title == Animation_Title.length)
                    Counter_Title = 0;

            }
        }, 0, (long) 7.5);

    }

    public void startScheduler() {

        new BukkitRunnable() {

            @Override
            public void run() {
                for(Player onlinePlayers : Bukkit.getOnlinePlayers()) {
                    updateScoreboard(onlinePlayers);
                }
            }
        }.runTaskTimer(SystemAPI.getPlugin(SystemAPI.class), 5, 5);

    }

}
