package EnderCrystalProtection;

import org.bukkit.plugin.java.JavaPlugin;

public class EnderCrystalProtection extends JavaPlugin
{
	/*
	 * Message consol on Start of the server
	 */
	@Override
	public void onEnable()
	{
		new EventListener(this);
	}
}
