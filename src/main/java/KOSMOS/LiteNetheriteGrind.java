package KOSMOS;

import KOSMOS.BlockBreakListener;
import KOSMOS.SmithingTableListener;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class LiteNetheriteGrind
extends JavaPlugin {
    public void onEnable() {
        ShapedRecipe recipe;
        NamespacedKey key;
        ItemStack item;
        this.getLogger().info("Enabled LiteNetheriteGrind v1.1");
        this.saveDefaultConfig();
        FileConfiguration config = this.getConfig();
        if (config.getBoolean("disable-smithing-table")) {
            this.getServer().getPluginManager().registerEvents(new SmithingTableListener(config), this);
        }
        if (config.getBoolean("ancient-debris-drops-netherite-ingot")) {
            this.getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_HELMET")) {
            item = new ItemStack(Material.NETHERITE_HELMET);
            key = new NamespacedKey(this, "NEW_NETHERITE_HELMET");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NIN", "C C"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('I', Material.IRON_INGOT);
            recipe.setIngredient('C', Material.NETHERITE_SCRAP);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_CHESTPLATE")) {
            item = new ItemStack(Material.NETHERITE_CHESTPLATE);
            key = new NamespacedKey(this, "NEW_NETHERITE_CHESTPLATE");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"C C", "NIN", "INI"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('C', Material.NETHERITE_SCRAP);
            recipe.setIngredient('I', Material.IRON_INGOT);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_LEGGINGS")) {
            item = new ItemStack(Material.NETHERITE_LEGGINGS);
            key = new NamespacedKey(this, "NEW_NETHERITE_LEGGINGS");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"III", "N N", "C C"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('I', Material.IRON_INGOT);
            recipe.setIngredient('C', Material.NETHERITE_SCRAP);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_BOOTS")) {
            item = new ItemStack(Material.NETHERITE_BOOTS);
            key = new NamespacedKey(this, "NEW_NETHERITE_BOOTS");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"I I", "N N"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('I', Material.IRON_INGOT);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_SWORD")) {
            item = new ItemStack(Material.NETHERITE_SWORD);
            key = new NamespacedKey(this, "NEW_NETHERITE_SWORD");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"N", "N", "S"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_PICKAXE")) {
            item = new ItemStack(Material.NETHERITE_PICKAXE);
            key = new NamespacedKey(this, "NEW_NETHERITE_PICKAXE");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NNN", " S ", " S "});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_AXE")) {
            item = new ItemStack(Material.NETHERITE_AXE);
            key = new NamespacedKey(this, "NEW_NETHERITE_AXE_LEFT");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NN", "NS", " S"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
            item = new ItemStack(Material.NETHERITE_AXE);
            key = new NamespacedKey(this, "NEW_NETHERITE_AXE_RIGHT");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NN", "SN", "S "});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_SHOVEL")) {
            item = new ItemStack(Material.NETHERITE_SHOVEL);
            key = new NamespacedKey(this, "NEW_NETHERITE_SHOVEL");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"N", "S", "S"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }
        if (!config.getStringList("disable-crafting").contains("NETHERITE_HOE")) {
            item = new ItemStack(Material.NETHERITE_HOE);
            key = new NamespacedKey(this, "NEW_NETHERITE_HOE_LEFT");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NN", " S", " S"});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
            item = new ItemStack(Material.NETHERITE_HOE);
            key = new NamespacedKey(this, "NEW_NETHERITE_HOE_RIGHT");
            recipe = new ShapedRecipe(key, item);
            recipe.shape(new String[]{"NN", "S ", "S "});
            recipe.setIngredient('N', Material.NETHERITE_INGOT);
            recipe.setIngredient('S', Material.STICK);
            Bukkit.addRecipe(recipe);
        }
    }

    public void onDisable() {
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_HELMET"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_CHESTPLATE"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_LEGGINGS"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_BOOTS"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_SWORD"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_PICKAXE"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_AXE_LEFT"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_AXE_RIGHT"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_SHOVEL"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_HOE_LEFT"));
        Bukkit.removeRecipe(new NamespacedKey(this, "NEW_NETHERITE_HOE_RIGHT"));
        this.getLogger().info("Disabled LiteNetheriteGrind v1.1");
    }
}
