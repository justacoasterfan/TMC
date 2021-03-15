
package net.mcreator.tmc.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.tmc.item.ItemRawBonechops;
import net.mcreator.tmc.item.ItemCookedBonechops;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeCookedBonechopsSmoker extends ElementsToomuchCommander.ModElement {
	public RecipeCookedBonechopsSmoker(ElementsToomuchCommander instance) {
		super(instance, 47);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawBonechops.block, (int) (1)), new ItemStack(ItemCookedBonechops.block, (int) (1)), 1F);
	}
}
