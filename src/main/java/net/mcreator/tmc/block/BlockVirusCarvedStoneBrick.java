
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusCarvedStoneBrick extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:viruscarvedstonebrick")
	public static final Block block = null;

	public BlockVirusCarvedStoneBrick(ElementsToomuchCommander instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("viruscarvedstonebrick"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("tmc:viruscarvedstonebrick", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.ROCK);

			setUnlocalizedName("viruscarvedstonebrick");
			setSoundType(SoundType.STONE);

			setHardness(2.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTooMuchCommander.tab);

		}

	}

}
