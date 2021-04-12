/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.listener;

import de.skyfam.api.systemapi.*;
import de.skyfam.api.systemapi.manager.*;
import de.skyfam.api.systemapi.npcs.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;

public class L_JoinQuit implements Listener {

    public SystemAPI systemapi = SystemAPI.getInstance();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(null);

        //Packet Reader
        NPC_PacketReader packetReader = new NPC_PacketReader(player);
        packetReader.inject();


        //Manager
        new M_Tablist().setTablist(player);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage(null);
    }

}
