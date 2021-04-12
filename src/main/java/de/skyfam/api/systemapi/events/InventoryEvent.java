/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.events;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;

import java.util.List;

public class InventoryEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    protected InventoryView transaction;

    public InventoryEvent(InventoryView transaction) {
        this.transaction = transaction;
    }

    public Inventory getInventory() {
        return this.transaction.getTopInventory();
    }

    public List<HumanEntity> getViewers() {
        return this.transaction.getTopInventory().getViewers();
    }

    public InventoryView getView() {
        return this.transaction;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

}
