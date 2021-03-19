
package net.mcreator.tmc.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class LootTableBunkerChests extends ElementsToomuchCommander.ModElement {
	public LootTableBunkerChests(ElementsToomuchCommander instance) {
		super(instance, 95);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("tmc", "bunkerchests"));
	}
}
