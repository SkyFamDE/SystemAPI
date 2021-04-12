/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.commands;

import de.skyfam.api.systemapi.SystemAPI;
import de.skyfam.api.systemapi.inventorys.I_Language;
import de.skyfam.api.systemapi.mysql.DB_System;
import de.skyfam.api.systemapi.utils.U_Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Language implements CommandExecutor {

    private U_Messages messages = SystemAPI.getInstance().messages;
    private DB_System systemDatabase = SystemAPI.getInstance().systemDatabase;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;

            if(command.getName().equalsIgnoreCase("language") || command.getName().equalsIgnoreCase("lang")) {
                if(systemDatabase.isCommandActive("LANGUAGE")) {
                    if(systemDatabase.isCommandBeta("LANGUAGE")) {
                        if(player.hasPermission("skyfam.command.language.beta")) {
                            new I_Language().openLanguage(player);
                        } else {
                            messages.sendMessage(player, "LANGUAGE-INACTIVE_BETA");
                        }
                    } else if(systemDatabase.isCommandProduct("LANGUAGE")) {
                        if(player.hasPermission("skyfam.command.language.team")) {
                            new I_Language().openLanguage(player);
                        } else {
                            messages.sendMessage(player, "LANGUAGE-INACTIVE_PRODUCTION");
                        }
                    } else if(!systemDatabase.isCommandBeta("LANGUAGE") && !systemDatabase.isCommandProduct("LANGUAGE")) {
                        new I_Language().openLanguage(player);
                    }
                } else {
                    messages.sendMessage(player, "LANGUAGE-INACTIVE_FULL");
                }
            }
        }

        return false;
    }

}