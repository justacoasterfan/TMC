
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusStoneBrickStairs extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusstonebrickstairs")
	public static final Block block = null;

	public BlockVirusStoneBrickStairs(ElementsToomuchCommander instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusstonebrickstairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("tmc:virusstonebrickstairs", "inventory"));

	}

	public static class BlockCustom extends BlockStairs {

		public BlockCustom() {
			super(new Block(Material.ROCK).getDefaultState());

			setUnlocalizedName("virusstonebrickstairs");
			setSoundType(SoundType.STONE);

			setHardness(2.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabTooMuchCommander.tab);

		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

	}

}
