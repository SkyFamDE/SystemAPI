/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.listener;

import de.skyfam.api.systemapi.SystemAPI;
import de.skyfam.api.systemapi.events.*;
import de.skyfam.api.systemapi.utils.U_Messages;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class L_InteractInventory implements Listener {

    private U_Messages messages = SystemAPI.getInstance().messages;

    @EventHandler
    public void onInteractWithInventory(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();


        if(event.getInventory().getTitle().equalsIgnoreCase(messages.sendInvTitle(player, "LANGUAGE_INV-TITLE"))) {
            event.setCancelled(true);
        }

        if(event.getInventory().getTitle().equalsIgnoreCase(messages.sendInvTitle(player, "SANTA_INV-TITLE"))) {
            event.setCancelled(true);
        }

    }

}
