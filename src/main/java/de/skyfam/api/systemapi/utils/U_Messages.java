/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.utils;

import de.skyfam.api.systemapi.SystemAPI;
import org.bukkit.entity.Player;

public class U_Messages {

    public void sendMessage(Player player, String messageCode) {
        String playerLanguage = SystemAPI.getInstance().systemDatabase.getLanguage(player.getUniqueId().toString());


        /* Message Code */
        String germanLang = SystemAPI.getInstance().languageDatabase.getGerman(messageCode);
        String britainLang = SystemAPI.getInstance().languageDatabase.getBritain(messageCode);
        String switzerLang = SystemAPI.getInstance().languageDatabase.getSwitzerland(messageCode);


        /* Get Language & Send Message */
        if(playerLanguage.equals("de_DE")) {
            player.sendMessage(SystemAPI.getInstance().strings.Prefix + germanLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName()));
        } else if(playerLanguage.equals("en_GB")) {
            player.sendMessage(SystemAPI.getInstance().strings.Prefix + britainLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName()));
        } else if(playerLanguage.equals("ch_CH")) {
            player.sendMessage(SystemAPI.getInstance().strings.Prefix + switzerLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName()));
        } else {
            player.sendMessage(SystemAPI.getInstance().strings.Prefix + britainLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName()));
        }

    }

    public void sendSyntax(Player player, String messageCode) {
        String playerLanguage = SystemAPI.getInstance().systemDatabase.getLanguage(player.getUniqueId().toString());


        /* Message Code */
        String germanLang = SystemAPI.getInstance().languageDatabase.getGerman(messageCode);
        String britainLang = SystemAPI.getInstance().languageDatabase.getBritain(messageCode);
        String switzerLang = SystemAPI.getInstance().languageDatabase.getSwitzerland(messageCode);


        /* Get Language & Send Message */
        if(playerLanguage.equals("de_DE")) {
            player.sendMessage(SystemAPI.getInstance().strings.Syntax + germanLang.replaceAll("&", "§"));
        } else if(playerLanguage.equals("en_GB")) {
            player.sendMessage(SystemAPI.getInstance().strings.Syntax + britainLang.replaceAll("&", "§"));
        } else if(playerLanguage.equals("ch_CH")) {
            player.sendMessage(SystemAPI.getInstance().strings.Syntax + switzerLang.replaceAll("&", "§"));
        } else {
            player.sendMessage(SystemAPI.getInstance().strings.Syntax + britainLang.replaceAll("&", "§"));
        }

    }

    public String sendInvTitle(Player player, String messageCode) {
        String playerLanguage = SystemAPI.getInstance().systemDatabase.getLanguage(player.getUniqueId().toString());


        /* Message Code */
        String germanLang = SystemAPI.getInstance().languageDatabase.getGerman(messageCode);
        String britainLang = SystemAPI.getInstance().languageDatabase.getBritain(messageCode);
        String switzerLang = SystemAPI.getInstance().languageDatabase.getSwitzerland(messageCode);


        /* Get Language & Send Message */
        if(playerLanguage.equals("de_DE")) {
            return germanLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName());
        } else if(playerLanguage.equals("en_GB")) {
            return britainLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName());
        } else if(playerLanguage.equals("ch_CH")) {
            return switzerLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName());
        } else {
            return britainLang.
                    replaceAll("&", "§").
                    replaceAll("%pName%", player.getName()).
                    replaceAll("%dpName%", player.getDisplayName());
        }
    }

    public void sendTitle(Player player, String title, String subTitle) {
        player.sendTitle("§8« §c" + title + " §8»", "§7➥ §7" + subTitle);
    }

}
