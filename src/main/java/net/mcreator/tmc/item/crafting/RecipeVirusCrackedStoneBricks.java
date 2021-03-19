
package net.mcreator.tmc.item.crafting;

@ElementsToomuchCommander.ModElement.Tag
public class RecipeVirusCrackedStoneBricks extends ElementsToomuchCommander.ModElement {

	public RecipeVirusCrackedStoneBricks(ElementsToomuchCommander instance) {
		super(instance, 94);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockVirusStoneBrick.block, (int) (1)), new ItemStack(BlockVirusCrackedStoneBrick.block, (int) (1)),
				1F);
	}

}
