/*
 * © Copyright by WurmliTV
 */

package de.skyfam.api.systemapi.utils;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.beans.ConstructorProperties;
import java.lang.reflect.Field;
import java.util.*;

public class U_ItemBuilder implements Cloneable {

    private ItemStack itemStack;

    @ConstructorProperties({"material"})
    public U_ItemBuilder(Material material) {
        this(material, 1);
    }

    public U_ItemBuilder(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public U_ItemBuilder(Material material, int amount) {
        this.itemStack = new ItemStack(material, amount);
    }

    public U_ItemBuilder(Material material, int amount, byte durability) {
        this.itemStack = new ItemStack(material, amount, (short) durability);
    }

    public U_ItemBuilder clone() {
        return new U_ItemBuilder(this.itemStack);
    }

    public U_ItemBuilder setDurability(short durability) {
        this.itemStack.setDurability(durability);
        return this;
    }

    public U_ItemBuilder setName(String name) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.setDisplayName(name);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder addUnsafeEnchantment(Enchantment enchantment, int level) {
        this.itemStack.addUnsafeEnchantment(enchantment, level);
        return this;
    }

    public U_ItemBuilder removeEnchantment(Enchantment enchantment) {
        this.itemStack.removeEnchantment(enchantment);
        return this;
    }

    public U_ItemBuilder setSkullOwner(String owner) {
        try {
            SkullMeta itemMeta = (SkullMeta)this.itemStack.getItemMeta();
            itemMeta.setOwner(owner);
            this.itemStack.setItemMeta(itemMeta);
        } catch (ClassCastException classCastException) {}
        return this;
    }

    public U_ItemBuilder addEnchant(Enchantment enchantment, int level) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.addEnchant(enchantment, level, true);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder setUnbreakable(boolean unbreakable) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.spigot().setUnbreakable(unbreakable);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder addItemFlags(ItemFlag... flags) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.addItemFlags(flags);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder addEnchantments(Map<Enchantment, Integer> enchantments) {
        this.itemStack.addEnchantments(enchantments);
        return this;
    }

    public U_ItemBuilder setInfinityDurability() {
        this.itemStack.setDurability((short) -1);
        return this;
    }

    public U_ItemBuilder setLore(String... lore) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.setLore(Arrays.asList(lore));
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder setLore(List<String> lore) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        itemMeta.setLore(lore);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder removeLoreLine(String line) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        List<String> lore = new ArrayList<>(itemMeta.getLore());
        if (!lore.contains(line))
            return this;
        lore.remove(line);
        itemMeta.setLore(lore);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder removeLoreLine(int index) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        List<String> lore = new ArrayList<>(itemMeta.getLore());
        if (index < 0 || index > lore.size())
            return this;
        lore.remove(index);
        itemMeta.setLore(lore);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder addLoreLine(String line) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        List<String> lore = new ArrayList<>();
        if (itemMeta.hasLore())
            lore = new ArrayList<>(itemMeta.getLore());
        lore.add(line);
        itemMeta.setLore(lore);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder addLoreLine(String line, int pos) {
        ItemMeta itemMeta = this.itemStack.getItemMeta();
        List<String> lore = new ArrayList<>(itemMeta.getLore());
        lore.set(pos, line);
        itemMeta.setLore(lore);
        this.itemStack.setItemMeta(itemMeta);
        return this;
    }

    public U_ItemBuilder setLeatherArmorColor(Color color) {
        try {
            LeatherArmorMeta itemMeta = (LeatherArmorMeta)this.itemStack.getItemMeta();
            itemMeta.setColor(color);
            this.itemStack.setItemMeta((ItemMeta)itemMeta);
        } catch (ClassCastException classCastException) {}
        return this;
    }

    public U_ItemBuilder setSkullTextures(String textures) {
        SkullMeta headMeta = (SkullMeta)this.itemStack.getItemMeta();
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        profile.getProperties().put("textures", new Property("textures", textures));
        try {
            Field profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);
            this.itemStack.setItemMeta(headMeta);
        } catch (NoSuchFieldException|IllegalAccessException noSuchFieldException) {}
        return this;
    }

    public ItemStack build() {
        return this.itemStack;
    }

}
