package josev.woo;

import josev.woo.block.ModBlocks;
import josev.woo.component.ModDataComponentTypes;
import josev.woo.item.ModItemGroups;
import josev.woo.item.ModItems;
import josev.woo.util.HammerUsageEvent;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WorldOfOres implements ModInitializer {
	public static final String MOD_ID = "world-of-ores";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModDataComponentTypes.registerDataComponentsTypes();
		FuelRegistry.INSTANCE.add(ModItems.URANIUM, 4000);
		PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());
	}
}