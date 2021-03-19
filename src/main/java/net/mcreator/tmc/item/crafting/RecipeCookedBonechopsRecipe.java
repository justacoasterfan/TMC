
package net.mcreator.tmc.item.crafting;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeCookedBonechopsRecipe extends ElementsToomuchCommander.ModElement {

	public RecipeCookedBonechopsRecipe(ElementsToomuchCommander instance) {
		super(instance, 46);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemRawBonechops.block, (int) (1)), new ItemStack(ItemCookedBonechops.block, (int) (1)), 1F);
	}

}
