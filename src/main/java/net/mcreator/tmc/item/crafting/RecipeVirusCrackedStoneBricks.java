
package net.mcreator.tmc.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.tmc.block.BlockVirusStoneBrick;
import net.mcreator.tmc.block.BlockVirusCrackedStoneBrick;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeVirusCrackedStoneBricks extends ElementsToomuchCommander.ModElement {
	public RecipeVirusCrackedStoneBricks(ElementsToomuchCommander instance) {
		super(instance, 95);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockVirusStoneBrick.block, (int) (1)), new ItemStack(BlockVirusCrackedStoneBrick.block, (int) (1)),
				1F);
	}
}
