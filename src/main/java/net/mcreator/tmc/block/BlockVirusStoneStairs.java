
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusStoneStairs extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusstonestairs")
	public static final Block block = null;

	public BlockVirusStoneStairs(ElementsToomuchCommander instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusstonestairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:virusstonestairs", "inventory"));

	}

	public static class BlockCustom extends BlockStairs {

		public BlockCustom() {
			super(new Block(Material.ROCK).getDefaultState());

			setUnlocalizedName("virusstonestairs");
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

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(BlockVirusCobblestone.block, (int) (1)));
		}

	}

}
