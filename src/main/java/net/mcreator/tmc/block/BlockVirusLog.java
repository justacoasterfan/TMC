
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusLog extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:viruslog")
	public static final Block block = null;

	public BlockVirusLog(ElementsToomuchCommander instance) {
		super(instance, 42);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("viruslog"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:viruslog", "inventory"));

	}

	public static class BlockCustom extends Block {

		public static final PropertyDirection FACING = BlockDirectional.FACING;

		public BlockCustom() {
			super(Material.WOOD);

			setUnlocalizedName("viruslog");
			setSoundType(SoundType.WOOD);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTooMuchCommander.tab);

			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH));

		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			if (rot == Rotation.CLOCKWISE_90 || rot == Rotation.COUNTERCLOCKWISE_90) {
				if ((EnumFacing) state.getValue(FACING) == EnumFacing.WEST || (EnumFacing) state.getValue(FACING) == EnumFacing.EAST) {
					return state.withProperty(FACING, EnumFacing.UP);
				} else if ((EnumFacing) state.getValue(FACING) == EnumFacing.UP || (EnumFacing) state.getValue(FACING) == EnumFacing.DOWN) {
					return state.withProperty(FACING, EnumFacing.WEST);
				}
			}
			return state;
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.getFront(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta,
				EntityLivingBase placer) {
			if (facing == EnumFacing.WEST || facing == EnumFacing.EAST)
				facing = EnumFacing.UP;
			else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
				facing = EnumFacing.EAST;
			else
				facing = EnumFacing.SOUTH;
			return this.getDefaultState().withProperty(FACING, facing);
		}

	}

}
