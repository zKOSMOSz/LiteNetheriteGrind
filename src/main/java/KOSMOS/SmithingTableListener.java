package KOSMOS;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SmithingTableListener
        implements Listener {
    private final FileConfiguration config;

    public SmithingTableListener(FileConfiguration config) {
        this.config = config;
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getInventory().getType() == InventoryType.SMITHING) {
            Inventory inv = event.getInventory();
            for (int i = 0; i < inv.getSize(); i++) {
                ItemStack item = inv.getItem(i);
                if (item != null && item.getType().name().equalsIgnoreCase("NETHERITE_UPGRADE_SMITHING_TEMPLATE")) {
                    if (event.getWhoClicked() instanceof Player) {
                        Player player = (Player) event.getWhoClicked();
                        player.closeInventory();
                        player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.config.getString("smithing-deny-message")));
                    }
                    event.setCancelled(true);
                    return;
                }
            }
        }
    }
}
