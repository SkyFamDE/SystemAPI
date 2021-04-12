/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.inventorys;

import de.skyfam.api.systemapi.SystemAPI;
import de.skyfam.api.systemapi.events.*;
import de.skyfam.api.systemapi.utils.U_ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class I_SantaClaus implements Listener {

    public SystemAPI main = SystemAPI.getInstance();

    public void openSanta(Player player) {
        Inventory santaInventory = Bukkit.createInventory(null, 9*6, main.messages.sendInvTitle(player, "SANTA_INV-TITLE"));

        santaInventory.setItem(0, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(1, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(2, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(3, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(4, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(5, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(6, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(7, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(8, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(9, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());


        santaInventory.setItem(11, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_01")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGQyNDU0ZTRjNjdiMzIzZDViZTk1M2I1YjNkNTQxNzRhYTI3MTQ2MDM3NGVlMjg0MTBjNWFlYWUyYzExZjUifX19").build());

        santaInventory.setItem(12, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_02")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYjEzYjc3OGM2ZTUxMjgwMjQyMTRmODU5YjRmYWRjNzczOGM3YmUzNjdlZTRiOWI4ZGJhZDc5NTRjZmYzYSJ9fX0=").build());

        santaInventory.setItem(13, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_03")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMDMxZjY2YmUwOTUwNTg4NTk4ZmVlZWE3ZTZjNjc3OTM1NWU1N2NjNmRlOGI5MWE0NDM5MWIyZTlmZDcyIn19fQ==").build());

        santaInventory.setItem(14, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_04")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTViYzQyYzY5ODQ2YzNkYTk1MzFhYzdkYmEyYjU1MzYzZjhmOTQ3MjU3NmUxN2Q0MjNiN2E5YjgxYzkxNTEifX19").build());

        santaInventory.setItem(15, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_05")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGYzZjU2NWE4ODkyOGVlNWE5ZDY4NDNkOTgyZDc4ZWFlNmI0MWQ5MDc3ZjJhMWU1MjZhZjg2N2Q3OGZiIn19fQ==").build());


        santaInventory.setItem(17, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(18, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());


        santaInventory.setItem(19, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_06")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVkYTFjYjZjNGMyMzcxMDIyNGI0ZjRlOGQ2ZmZjZjhiNGI1NWY3ZmU4OTFjMTIwNGFmNzQ4NWNmMjUyYTFkOCJ9fX0=").build());
        santaInventory.setItem(20, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_07")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWY0ZTdhNWNmNWI1YTRkMmZmNGZiMDQzM2IxYTY4NzUxYWExMmU5YTAyMWQzOTE4ZTkyZTIxOWE5NTNiIn19fQ==").build());
        santaInventory.setItem(21, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_08")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTY4MzQ0MGM2NDQ3YzE5NWFhZjc2NGUyN2ExMjU5MjE5ZTkxYzZkOGFiNmJkODlhMTFjYThkMmNjNzk5ZmE4In19fQ==").build());
        santaInventory.setItem(22, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_09")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjg5NzdhZGVkZmE2YzgxYTY3ZjgyNWVhMzdjNGQ1YWE5MGRmZTNjMmE3MmRkOTg3OTFmNDUyMWUxZGEzNiJ9fX0=").build());
        santaInventory.setItem(23, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_10")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjU5ODdmNDNmZjU3ZDRkYWJhYTJkMmNlYjlmMDFmYzZlZTQ2ZGIxNjJhNWUxMmRmZGJiNTdmZDQ2ODEzMmI4In19fQ==").build());
        santaInventory.setItem(24, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_11")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDkyNTM2Yzc1M2Q3MzA4YzlhZmUzNzFlZDhhODUzYjVmOTg4Yjg0Yzk0M2RmZTliNmFhNjBmYWM3YWE0ZGJiIn19fQ==").build());
        santaInventory.setItem(25, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_12")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGJlZGZlMzQ5YmMzMmNmZDk2MWFiZTQwYTg1NjE5N2I1OWU1ZDQ1ZTY5Y2U5NzE1NTg5ZGM4ZTgyMGJlMjlmIn19fQ==").build());


        santaInventory.setItem(26, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(27, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());


        santaInventory.setItem(28, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_13")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmNmYTNlMTgxZmMyZDgxZjQ2NTU1ODExZTc5NzU4NjU1ZDljYzhlZDhmNDM3M2YyMDNlZmM5ZDZiOTRmIn19fQ==").build());
        santaInventory.setItem(29, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_14")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvM2U4MTE3ZTY2YTc5YWU0NzA1NDlmMmFiMzRjOTY4OWZlOGM3ZTdhOTg2NjkxNzY1ODI1YWM5MTI3MjQwZCJ9fX0=").build());
        santaInventory.setItem(30, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_15")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGY2MmMxMmJkZDY1MmViYzUzYWZlNjkyZmFkOWJhZDgzZGRjNjc5MjgxOGJmNDEzYjU0MTU0ZTg3ZTI5In19fQ==").build());
        santaInventory.setItem(31, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_16")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYWUzZTRiYzcxZTNhYzMzMDgzNjE4MWVkYTk2YmM2ZjEyOGU1YzUzMTNhYjk1MmM4ZmY2ZGVkNTQ5ZTEzYTUifX19").build());
        santaInventory.setItem(32, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_17")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjgxZjAyYzhhM2JiMzcwYWI1NTQyODE4MmZlODg4OGFlY2YwZDdmMTY5MjE0NjRjMWQzZTViMzFjZTFkIn19fQ==").build());
        santaInventory.setItem(33, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_18")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTdkODk4ODNkZjdmZDQxZjQ5NmU5YTQxYjcyOTYzOTQ1NmIyOGRlY2FhZGQxMjFlOTMyZTQ4ZmJiOWRkODZjIn19fQ==").build());
        santaInventory.setItem(34, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_19")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNTVkNjg0OGFiYzVlNzE4MWVkYzFiYTE0ZjdlYjc1NTViZDhmYjZjOTcxMGM3YWU1MTYxZWY5YzNkNjZmNmQ4In19fQ==").build());


        santaInventory.setItem(35, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(36, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());


        santaInventory.setItem(38, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_20")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzZhZjgwNTlmOGI5YTFmOTlmYjE4MmZhZmYzMDU4ZTc3MTI1NDM0YTk1ODA1ZDg2ZWUxZWY4OTMyMWNlZTkifX19").build());
        santaInventory.setItem(39, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_21")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmNmOTYxODUzNTY2ZTJlNmY3MzFmYzUzZDJmZTIxZGIyNGZiMjQ2OTgzNjM5ZWUzNzE1NzY3N2UyYjExNzAifX19").build());
        santaInventory.setItem(40, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_22")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZDFiM2RkN2M4MzJhNGViYzc2MzkzNWFmMmM4YjdhOTk5NzRkNTJlOTg5ZWQ4MjE1ZWEzYWQ1NmVhYTkxNjgifX19").build());
        santaInventory.setItem(41, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_23")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNGQ1MDFkZWU1ZTkzMzFmNmZlNTI0ZTJjN2ZlZWY4YWRiNGEwMWZjZTU2N2M1OGJiZGU2M2E3OWY5ZWQ3In19fQ==").build());
        santaInventory.setItem(42, new U_ItemBuilder(Material.SKULL_ITEM, 1, (byte) 3).
                setName(main.messages.sendInvTitle(player, "SANTA_INV-NUMBER_24")).
                setSkullTextures("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZWM5YWI1N2VlODE2ODU5NWVjNDFkMWVjNDhkNjUxMjgzMWY4YjU2YWE4ZWJjMTM5ZTNjMmE1MjY5NmUzYjkxZiJ9fX0=").build());


        santaInventory.setItem(44, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(45, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(46, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(47, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(48, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(49, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(50, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(51, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());
        santaInventory.setItem(52, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 14).
                setName(" ").build());
        santaInventory.setItem(53, new U_ItemBuilder(Material.STAINED_GLASS_PANE, 1, (byte) 0).
                setName(" ").build());


        player.openInventory(santaInventory);

    }

    @EventHandler
    public void clickSanta(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();


        if(event.getInventory().getTitle().equalsIgnoreCase(main.messages.sendInvTitle(player, "SANTA_INV-TITLE"))) {

            if(event.getSlot() == 11) {

            }

        }

    }

}
