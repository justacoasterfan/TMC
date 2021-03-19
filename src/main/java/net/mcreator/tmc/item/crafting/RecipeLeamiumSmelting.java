
package net.mcreator.tmc.item.crafting;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeLeamiumSmelting extends ElementsToomuchCommander.ModElement {

	public RecipeLeamiumSmelting(ElementsToomuchCommander instance) {
		super(instance, 32);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLeamiumOre.block, (int) (1)), new ItemStack(ItemLeamiumIngot.block, (int) (1)), 1F);
	}

}
