/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.commands;

import de.skyfam.api.systemapi.SystemAPI;
import de.skyfam.api.systemapi.utils.U_Messages;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Gamemode implements CommandExecutor {

    private U_Messages messages = SystemAPI.getInstance().messages;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player player = (Player)sender;

            if(player.hasPermission("skyfam.system.gamemode")) {

                if(args.length == 1) {
                    if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                        player.setGameMode(GameMode.SURVIVAL);


                        messages.sendMessage(player, "GAMEMODE_0-SELF");
                    } else if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                        player.setGameMode(GameMode.CREATIVE);

                        messages.sendMessage(player, "GAMEMODE_1-SELF");
                    } else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                        player.setGameMode(GameMode.ADVENTURE);

                        messages.sendMessage(player, "GAMEMODE_2-SELF");
                    } else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                        player.setGameMode(GameMode.SPECTATOR);

                        messages.sendMessage(player, "GAMEMODE_3-SELF");
                    }
                } else if(args.length == 2) {
                    Player targetPlayer = Bukkit.getPlayer(args[1]);

                    if(args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("survival")) {
                        targetPlayer.setGameMode(GameMode.SURVIVAL);

                        messages.sendMessage(player, "GAMEMODE_0-OTHER_SUCCESS");
                        messages.sendMessage(targetPlayer, "GAMEMODE_0-OTHER_UPDATE");
                    } else if(args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("creative")) {
                        targetPlayer.setGameMode(GameMode.CREATIVE);

                        messages.sendMessage(player, "GAMEMODE_1-OTHER_SUCCESS");
                        messages.sendMessage(targetPlayer, "GAMEMODE_1-OTHER_UPDATE");
                    } else if(args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("adventure")) {
                        targetPlayer.setGameMode(GameMode.ADVENTURE);

                        messages.sendMessage(player, "GAMEMODE_2-OTHER_SUCCESS");
                        messages.sendMessage(targetPlayer, "GAMEMODE_2-OTHER_UPDATE");
                    } else if(args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("spectator")) {
                        targetPlayer.setGameMode(GameMode.SPECTATOR);

                        messages.sendMessage(player, "GAMEMODE_3-OTHER_SUCCESS");
                        messages.sendMessage(targetPlayer, "GAMEMODE_3-OTHER_UPDATE");
                    }
                } else {
                    messages.sendSyntax(player, "GAMEMODE_?-SYNTAX");
                }

            }

        }

        return false;
    }

}
