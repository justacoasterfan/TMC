
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusMossyCobblestoneWall extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusmossycobblestonewall")
	public static final Block block = null;

	public BlockVirusMossyCobblestoneWall(ElementsToomuchCommander instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusmossycobblestonewall"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("tmc:virusmossycobblestonewall", "inventory"));

	}

	public static class BlockCustom extends BlockWall {

		public BlockCustom() {
			super(new Block(Material.ROCK));

			setUnlocalizedName("virusmossycobblestonewall");
			setSoundType(SoundType.STONE);

			setHardness(2.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabTooMuchCommander.tab);

		}

		@Override
		public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
			items.add(new ItemStack(this));
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

	}

}
