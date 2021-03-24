
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusPlanksStairs extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusplanksstairs")
	public static final Block block = null;

	public BlockVirusPlanksStairs(ElementsToomuchCommander instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusplanksstairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:virusplanksstairs", "inventory"));

	}

	public static class BlockCustom extends BlockStairs {

		public BlockCustom() {
			super(new Block(Material.WOOD).getDefaultState());

			setUnlocalizedName("virusplanksstairs");
			setSoundType(SoundType.WOOD);

			setHarvestLevel("axe", 1);

			setHardness(2F);
			setResistance(3F);
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
