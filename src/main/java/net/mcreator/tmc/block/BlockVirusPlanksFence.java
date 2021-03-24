
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusPlanksFence extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusplanksfence")
	public static final Block block = null;

	public BlockVirusPlanksFence(ElementsToomuchCommander instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusplanksfence"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:virusplanksfence", "inventory"));

	}

	public static class BlockCustom extends BlockFence {

		public BlockCustom() {
			super(Material.WOOD, Material.WOOD.getMaterialMapColor());

			setUnlocalizedName("virusplanksfence");
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
