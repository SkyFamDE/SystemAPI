/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.inventorys;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class I_ItsMe {

    String invTitle;

    public Inventory itsMeInventory(Player player) {

        Inventory itsMeInv = Bukkit.createInventory(null, 9*3, invTitle);




        return itsMeInv;
    }

}
