/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.manager;

import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ru.tehkode.permissions.bukkit.PermissionsEx;

public class M_Chat implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void asyncPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        String message = event.getMessage();

        /* Team Ranks */
        if(PermissionsEx.getUser(player).inGroup("Kronos")) {
            setFormat(event, player, "§4", "Kronos", message);
        } else if(PermissionsEx.getUser(player).inGroup("Horen")) {
            setFormat(event, player, "§4", "Horen", message);
        } else if(PermissionsEx.getUser(player).inGroup("Athene")) {
            setFormat(event, player, "§4", "Athene", message);
        } else if(PermissionsEx.getUser(player).inGroup("Plutos")) {
            setFormat(event, player, "§9", "Plutos", message);
        } else if(PermissionsEx.getUser(player).inGroup("Zelos")) {
            setFormat(event, player, "§d", "Zelos", message);
        } else if(PermissionsEx.getUser(player).inGroup("Tyche")) {
            setFormat(event, player, "§c", "Tyche", message);
        } else if(PermissionsEx.getUser(player).inGroup("Iris")) {
            setFormat(event, player, "§3", "Iris", message);
        } else if(PermissionsEx.getUser(player).inGroup("Demeter")) {
            setFormat(event, player, "§2", "Demeter", message);
        }

        /* Partner / Friend / YouTuber Rank */
        else if(PermissionsEx.getUser(player).inGroup("Dionysos")) {
            setFormat(event, player, "§2", "Dionysos", message);
        } else if(PermissionsEx.getUser(player).inGroup("Prometheus")) {
            setFormat(event, player, "§6", "Prometheus", message);
        } else if(PermissionsEx.getUser(player).inGroup("Hermes")) {
            setFormat(event, player, "§f", "Hermes", message);
        }

        /* Player Ranks */
        else if(PermissionsEx.getUser(player).inGroup("SkyBiest")) {
            setFormat(event, player, "§9", "SkyBiest", message);
        } else if(PermissionsEx.getUser(player).inGroup("SkyLegende")) {
            setFormat(event, player, "§5", "SkyLegende", message);
        } else if(PermissionsEx.getUser(player).inGroup("SkyGott")) {
            setFormat(event, player, "§1", "SkyGott", message);
        } else if(PermissionsEx.getUser(player).inGroup("SkyKing")) {
            setFormat(event, player, "§9", "SkyKing", message);
        } else if(PermissionsEx.getUser(player).inGroup("SkyHunter") ||
                  PermissionsEx.getUser(player).inGroup("default")) {
            setFormat(event, player, "§6", "SkyHunter", message);
        }

    }

    private void setFormat(AsyncPlayerChatEvent event, Player player, String color, String rank, String message) {
        event.setFormat(color + rank + "§8 × " + color + player.getDisplayName() + "§8 » §7" +
                message.replaceAll("%", "%")
                        /* Color - Numbers */
                        .replaceAll("&0", "§0")
                        .replaceAll("&1", "§1")
                        .replaceAll("&2", "§2")
                        .replaceAll("&3", "§3")
                        .replaceAll("&4", "§4")
                        .replaceAll("&5", "§5")
                        .replaceAll("&6", "§6")
                        .replaceAll("&7", "§7")
                        .replaceAll("&8", "§8")
                        .replaceAll("&9", "§9")
                        /* Color - Letters */
                        .replaceAll("&a", "§a")
                        .replaceAll("&b", "§b")
                        .replaceAll("&c", "§c")
                        .replaceAll("&d", "§d")
                        .replaceAll("&e", "§e")
                        .replaceAll("&f", "§f")
                        /* Color - Extras */
                        .replaceAll("&k", "§k")
                        .replaceAll("&l", "§l")
                        .replaceAll("&m", "§m")
                        .replaceAll("&n", "§n")
                        .replaceAll("&o", "§o")
                        .replaceAll("&r", "§r")
                        /* Symbols - Normal */
                        .replaceAll("<<", "«")
                        .replaceAll(">>", "»")
                        .replaceAll("<3", "❤")
                        /* Symbols - Extra */
                        .replaceAll(":copyright:", "©")
                        .replaceAll(":check:", "✔")
                        .replaceAll(":deny:", "✗"));
    }

}
