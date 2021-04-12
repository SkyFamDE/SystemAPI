/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.inventorys;

import de.skyfam.api.systemapi.SystemAPI;
import de.skyfam.api.systemapi.utils.U_ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class I_Language {

    public SystemAPI main = SystemAPI.getInstance();

    public void openLanguage(Player player) {
        Inventory langInventory = Bukkit.createInventory(null, 9*3, main.messages.sendInvTitle(player, "LANGUAGE_INV-TITLE"));

        for(int i = 0; i < langInventory.getSize(); i++) {
            langInventory.setItem(i, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 8).setName("§c").build());
        }

        langInventory.setItem(10, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWU3ODk5YjQ4MDY4NTg2OTdlMjgzZjA4NGQ5MTczZmU0ODc4ODY0NTM3NzQ2MjZiMjRiZDhjZmVjYzc3YjNmIn19fQ==")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_GERMAN")).build());
        langInventory.setItem(11, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvODc5ZDk5ZDljNDY0NzRlMjcxM2E3ZTg0YTk1ZTRjZTdlOGZmOGVhNGQxNjQ0MTNhNTkyZTQ0MzVkMmM2ZjlkYyJ9fX0=")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_ENGLISH")).build());
        langInventory.setItem(12, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTcyZmZhYmM0MGEzYTgyYTlkYmIwODEwMzhmOTgzNDcwN2I4YTdhNTk1ZTQ3ZDYzZTRjN2E3ZTI0YTZjODgyOSJ9fX0=")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_SWITZER")).build());


        langInventory.setItem(13, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullOwner("MHF_Question")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_SOON")).build());
        langInventory.setItem(14, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullOwner("MHF_Question")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_SOON")).build());
        langInventory.setItem(15, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullOwner("MHF_Question")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_SOON")).build());
        langInventory.setItem(16, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3)
                .setSkullOwner("MHF_Question")
                .setName(main.messages.sendInvTitle(player, "LANGUAGE_INV-CHOOSE_SOON")).build());

        player.openInventory(langInventory);

    }

}
