package net.mcreator.tmc.procedure;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureCommandiumFurnaceFuelBurnTime extends ElementsToomuchCommander.ModElement {

	public ProcedureCommandiumFurnaceFuelBurnTime(ElementsToomuchCommander instance) {
		super(instance, 70);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CommandiumFurnaceFuelBurnTime!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CommandiumFurnaceFuelBurnTime!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CommandiumFurnaceFuelBurnTime!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CommandiumFurnaceFuelBurnTime!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemCommanderBoneDust.block, (int) (1))
				.getItem())) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("burnTime", 800);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(BlockCommanderBoneBlock.block, (int) (1))
				.getItem())) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("burnTime", 7500);
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
		}

	}

}
