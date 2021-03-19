
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockInfestedPlanksFence extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:infestedplanksfence")
	public static final Block block = null;

	public BlockInfestedPlanksFence(ElementsToomuchCommander instance) {
		super(instance, 59);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("infestedplanksfence"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("tmc:infestedplanksfence", "inventory"));

	}

	public static class BlockCustom extends BlockFence {

		public BlockCustom() {
			super(Material.WOOD, Material.WOOD.getMaterialMapColor());

			setUnlocalizedName("infestedplanksfence");
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
