package EnderCrystalProtection;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class EventListener implements Listener
{
	public EventListener(EnderCrystalProtection plugin)
	{
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onTouch(EntityExplodeEvent event)
	{
		Entity entity = event.getEntity();
		if (entity.getType().equals(EntityType.ENDER_CRYSTAL))
		{
			event.blockList().clear();
		}
	}
}