
package net.mcreator.tmc.item.crafting;

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
