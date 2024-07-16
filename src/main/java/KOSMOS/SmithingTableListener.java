package KOSMOS;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;

public class SmithingTableListener
        implements Listener {
    private FileConfiguration config;

    public SmithingTableListener(FileConfiguration config) {
        this.config = config;
    }

    @EventHandler
    public void onInventoryOpenEvent(InventoryOpenEvent event) {
        if (event.getInventory().getType() == InventoryType.SMITHING) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', this.config.getString("smithing-deny-message")));
        }
    }
}
