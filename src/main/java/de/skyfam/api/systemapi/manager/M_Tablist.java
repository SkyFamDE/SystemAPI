/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.manager;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class M_Tablist {

    public void setTablist(Player player) {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objective = scoreboard.getObjective("main-content");

        if(objective == null) {
            objective = scoreboard.registerNewObjective("main-content", "dummy");
        }


        /* MANAGEMENT */
        Team Kronos = scoreboard.registerNewTeam("000000Kronos");
        Kronos.setPrefix("§4Kronos §8» §4");
        Kronos.setSuffix("");
        Team Horen = scoreboard.registerNewTeam("000001Horen");
        Horen.setPrefix("§4Horen §8» §4");
        Horen.setSuffix("");
        Team Athene = scoreboard.registerNewTeam("000002Athene");
        Athene.setPrefix("§4Athene §8» §4");
        Athene.setSuffix("");


        /* TEAM */
        Team Plutos = scoreboard.registerNewTeam("000003Plutos");
        Plutos.setPrefix("§bPlutos §8» §b");
        Plutos.setSuffix("");
        Team Zelos = scoreboard.registerNewTeam("000005Zelos");
        Zelos.setPrefix("§bZelos §8» §b");
        Zelos.setSuffix("");
        Team Tyche = scoreboard.registerNewTeam("000006Tyche");
        Tyche.setPrefix("§cTyche §8» §c");
        Tyche.setSuffix("");
        Team Iris = scoreboard.registerNewTeam("000007Iris");
        Iris.setPrefix("§9Iris §8» §9");
        Iris.setSuffix("");
        Team Demeter = scoreboard.registerNewTeam("000008Demeter");
        Demeter.setPrefix("§2Demeter §8» §2");
        Demeter.setSuffix("");


        /* EXTRAS */
        Team Dionysos = scoreboard.registerNewTeam("001000Dionysos");
        Dionysos.setPrefix("§aDio §8» §a");
        Dionysos.setSuffix("");
        Team Prometheus = scoreboard.registerNewTeam("001001Prometheus");
        Prometheus.setPrefix("§6Pro §8» §6");
        Prometheus.setSuffix("");


        /* PLAYER */
        Team Hermes = scoreboard.registerNewTeam("009999Hermes");
        Hermes.setPrefix("§5Hermes §8» §5");
        Hermes.setSuffix("");
        Team SkyBiest = scoreboard.registerNewTeam("010000SkyBiest");
        SkyBiest.setPrefix("§bS§9B §8» §9");
        SkyBiest.setSuffix("");
        Team SkyLegende = scoreboard.registerNewTeam("010001SkyL");
        SkyLegende.setPrefix("§bS§cL §8» §c");
        SkyLegende.setSuffix("");
        Team SkyGott = scoreboard.registerNewTeam("010002SkyGott");
        SkyGott.setPrefix("§bS§3G §8» §3");
        SkyGott.setSuffix("");
        Team SkyKing = scoreboard.registerNewTeam("010003SkyKing");
        SkyKing.setPrefix("§bS§1K §8» §1");
        SkyKing.setSuffix("");
        Team SkyHunter = scoreboard.registerNewTeam("010004SkyHunter");
        SkyHunter.setPrefix("§bS§6H §8» §6");
        SkyHunter.setSuffix("");


        /* REGISTER TEAMS & ADD PLAYER */
        for(Player onlinePlayers : Bukkit.getOnlinePlayers()) {
            /* MANAGEMENT */
            if(PermissionsEx.getUser(onlinePlayers).inGroup("Kronos")) {
                Kronos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Horen")) {
                Horen.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Athene")) {
                Athene.addPlayer(onlinePlayers);
            /* TEAM */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Plutos")) {
                Plutos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Zelos")) {
                Zelos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Tyche")) {
                Tyche.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Iris")) {
                Iris.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Demeter")) {
                Demeter.addPlayer(onlinePlayers);
            /* EXTRAS */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Dionysos")) {
                Dionysos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Prometheus")) {
                Prometheus.addPlayer(onlinePlayers);
            /* PLAYER */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Hermes")) {
                Hermes.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyBiest")) {
                SkyBiest.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyLegende")) {
                SkyLegende.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyGott")) {
                SkyGott.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyKing")) {
                SkyKing.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyHunter")) {
                SkyHunter.addPlayer(onlinePlayers);
            }

        }

        player.setScoreboard(scoreboard);
    }

    public void updateTablist(Player player) {
        Scoreboard scoreboard = player.getScoreboard();

        if(player.getScoreboard() == null) {
            setTablist(player);
        }

        /* MANAGEMENT */
        Team Kronos = scoreboard.getTeam("000000Kronos");
        Team Horen = scoreboard.getTeam("000001Horen");
        Team Athene = scoreboard.getTeam("000002Athene");


        /* TEAM */
        Team Plutos = scoreboard.getTeam("000003Plutos");
        Team Zelos = scoreboard.getTeam("000005Zelos");
        Team Tyche = scoreboard.getTeam("000006Tyche");
        Team Iris = scoreboard.getTeam("000007Iris");
        Team Demeter = scoreboard.getTeam("000008Demeter");


        /* EXTRAS */
        Team Dionysos = scoreboard.getTeam("001000Partner");
        Team Prometheus = scoreboard.getTeam("001001Freund");


        /* PLAYER */
        Team Hermes = scoreboard.getTeam("009999Hermes");
        Team SkyBiest = scoreboard.getTeam("010000SkyBiest");
        Team SkyLegende = scoreboard.getTeam("010001SkyL");
        Team SkyGott = scoreboard.getTeam("010002SkyGott");
        Team SkyKing = scoreboard.getTeam("010003SkyKing");
        Team SkyHunter = scoreboard.getTeam("010004SkyHunter");


        /* REGISTER TEAM IF NULL */
        if(Kronos == null) {
            Kronos = scoreboard.registerNewTeam("000000Kronos");
        }
        if(Horen == null) {
            Horen = scoreboard.registerNewTeam("000001Horen");
        }
        if(Athene == null) {
            Athene = scoreboard.registerNewTeam("000002Athene");
        }


        if(Plutos == null) {
            Plutos = scoreboard.registerNewTeam("000003Plutos");
        }
        if(Zelos == null) {
            Zelos = scoreboard.registerNewTeam("000005Zelos");
        }
        if(Tyche == null) {
            Tyche = scoreboard.registerNewTeam("000006Tyche");
        }
        if(Iris == null) {
            Iris = scoreboard.registerNewTeam("000007Iris");
        }
        if(Demeter == null) {
            Demeter = scoreboard.registerNewTeam("000008Demeter");
        }


        if(Dionysos == null) {
            Dionysos = scoreboard.registerNewTeam("001000Partner");
        }
        if(Prometheus == null) {
            Prometheus = scoreboard.registerNewTeam("001001Freund");
        }


        if(Hermes == null) {
            Hermes = scoreboard.registerNewTeam("009999Hermes");
        }
        if(SkyBiest == null) {
            SkyBiest = scoreboard.registerNewTeam("010000SkyBiest");
        }
        if(SkyLegende == null) {
            SkyLegende = scoreboard.registerNewTeam("010001SkyL");
        }
        if(SkyGott == null) {
            SkyGott = scoreboard.registerNewTeam("010002SkyGott");
        }
        if(SkyKing == null) {
            SkyKing = scoreboard.registerNewTeam("010003SkyKing");
        }
        if(SkyHunter == null) {
            SkyHunter = scoreboard.registerNewTeam("010004SkyHunter");
        }


        /* SET TEAM PREFIX & SUFFIX */
        Kronos.setPrefix("§4Kronos §8» §4");
        Kronos.setSuffix("");
        Horen.setPrefix("§4Horen §8» §4");
        Horen.setSuffix("");
        Athene.setPrefix("§4Athene §8» §4");
        Athene.setSuffix("");


        /* TEAM */
        Plutos.setPrefix("§bPlutos §8» §b");
        Plutos.setSuffix("");
        Zelos.setPrefix("§bZelos §8» §b");
        Zelos.setSuffix("");
        Tyche.setPrefix("§cTyche §8» §c");
        Tyche.setSuffix("");
        Iris.setPrefix("§9Iris §8» §9");
        Iris.setSuffix("");
        Demeter.setPrefix("§2Demeter §8» §2");
        Demeter.setSuffix("");


        /* EXTRAS */
        Dionysos.setPrefix("§aDio §8» §a");
        Dionysos.setSuffix("");
        Prometheus.setPrefix("§6Pro §8» §6");
        Prometheus.setSuffix("");


        /* PLAYER */
        Hermes.setPrefix("§5Hermes §8» §5");
        Hermes.setSuffix("");
        SkyBiest.setPrefix("§bS§9B §8» §9");
        SkyBiest.setSuffix("");
        SkyLegende.setPrefix("§bS§cL §8» §c");
        SkyLegende.setSuffix("");
        SkyGott.setPrefix("§bS§3G §8» §3");
        SkyGott.setSuffix("");
        SkyKing.setPrefix("§bS§1K §8» §1");
        SkyKing.setSuffix("");
        SkyHunter.setPrefix("§bS§6H §8» §6");
        SkyHunter.setSuffix("");


        for(Player onlinePlayers : Bukkit.getOnlinePlayers()) {
            /* MANAGEMENT */
            if(PermissionsEx.getUser(onlinePlayers).inGroup("Kronos")) {
                Kronos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Horen")) {
                Horen.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Athene")) {
                Athene.addPlayer(onlinePlayers);
                /* TEAM */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Plutos")) {
                Plutos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Zelos")) {
                Zelos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Tyche")) {
                Tyche.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Iris")) {
                Iris.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Demeter")) {
                Demeter.addPlayer(onlinePlayers);
                /* EXTRAS */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Dionysos")) {
                Dionysos.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Prometheus")) {
                Prometheus.addPlayer(onlinePlayers);
                /* PLAYER */
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("Hermes")) {
                Hermes.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyBiest")) {
                SkyBiest.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyLegende")) {
                SkyLegende.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyGott")) {
                SkyGott.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyKing")) {
                SkyKing.addPlayer(onlinePlayers);
            } else if(PermissionsEx.getUser(onlinePlayers).inGroup("SkyHunter")) {
                SkyHunter.addPlayer(onlinePlayers);
            }

        }

    }

    public void startScheduler() {

        new BukkitRunnable() {

            @Override
            public void run() {
                for(Player all : Bukkit.getOnlinePlayers()) {
                    updateTablist(all);
                }
            }
        }.runTaskTimer(SystemAPI.getPlugin(SystemAPI.class), 5, 5);

    }

}
