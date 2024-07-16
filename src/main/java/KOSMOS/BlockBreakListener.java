package KOSMOS;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlockBreakListener
        implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        if (e.isCancelled()) {
            return;
        }
        if (e.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
            return;
        }
        if (e.getBlock().getType() == Material.ANCIENT_DEBRIS && !e.getBlock().getDrops(e.getPlayer().getEquipment().getItemInMainHand()).isEmpty()) {
            e.setDropItems(false);
            ItemStack drop = new ItemStack(Material.NETHERITE_INGOT, 1);
            e.getBlock().getLocation().getWorld().dropItemNaturally(e.getBlock().getLocation(), drop);
        }
    }
}
