
package net.mcreator.tmc.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.tmc.item.ItemLeamiumIngot;
import net.mcreator.tmc.block.BlockLeamiumOre;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeLeamiumSmelting extends ElementsToomuchCommander.ModElement {
	public RecipeLeamiumSmelting(ElementsToomuchCommander instance) {
		super(instance, 53);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLeamiumOre.block, (int) (1)), new ItemStack(ItemLeamiumIngot.block, (int) (1)), 1F);
	}
}
