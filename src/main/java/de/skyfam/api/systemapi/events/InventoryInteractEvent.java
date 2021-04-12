/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.events;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.InventoryView;

public class InventoryInteractEvent extends InventoryEvent implements Cancellable {

    private Result result;

    public InventoryInteractEvent(InventoryView transaction) {
        super(transaction);
        this.result = Result.DEFAULT;
    }

    public HumanEntity getWhoClicked() {
        return this.getView().getPlayer();
    }

    public void setResult(Result newResult) {
        this.result = newResult;
    }

    public Result getResult() {
        return this.result;
    }

    public boolean isCancelled() {
        return this.getResult() == Result.DENY;
    }

    public void setCancelled(boolean toCancel) {
        this.setResult(toCancel ? Result.DENY : Result.ALLOW);
    }

}
