package rip.skyland.soup.kit.impl;

import rip.skyland.core.util.CC;
import rip.skyland.core.util.ItemBuilder;
import rip.skyland.soup.kit.Kit;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;


@Getter
public class PvpKit extends Kit {

    private boolean abilityKit;
    private String name, description;
    private ItemStack icon;
    private ItemStack[] armor, items;
    private PotionEffect[] potionEffects;
    private CC color;
    private boolean actualKit;

    public PvpKit() {
        this.actualKit = true;

        abilityKit = false;
        this.name = "PvP";
        this.description = "The normal PvP kit.";
        this.icon = new ItemStack(Material.DIAMOND_SWORD);
        this.color = CC.PINK;

        this.armor = getArmor();
        this.items = getItems();

        this.potionEffects = null;
    }

    public ItemStack[] getArmor() {
        return new ItemStack[] {
                new ItemBuilder(Material.IRON_BOOTS).create(),
                new ItemBuilder(Material.IRON_LEGGINGS).create(),
                new ItemBuilder(Material.IRON_CHESTPLATE).create(),
                new ItemBuilder(Material.IRON_HELMET).create(),
        };
    }
    public ItemStack[] getItems() {
        ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
        sword.addEnchantment(Enchantment.DURABILITY, 3);
        sword.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        return new ItemStack[]{
                sword,
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
                new ItemBuilder(Material.MUSHROOM_SOUP).create(),
        };
    }
}
