package net.mcreator.tmc.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;

import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureCommandiumFurnaceXpRewardXpAmount extends ElementsToomuchCommander.ModElement {
	public ProcedureCommandiumFurnaceXpRewardXpAmount(ElementsToomuchCommander instance) {
		super(instance, 72);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CommandiumFurnaceXpRewardXpAmount!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CommandiumFurnaceXpRewardXpAmount!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CommandiumFurnaceXpRewardXpAmount!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CommandiumFurnaceXpRewardXpAmount!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double xp_roll = 0;
		xp_roll = (double) Math.random();
		if (((xp_roll) >= 0.75)) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("xpAmount", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "xpAmount")) + 7));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((xp_roll) >= 0.5)) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("xpAmount", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "xpAmount")) + 5));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if (((xp_roll) >= 0.25)) {
			if (!world.isRemote) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				IBlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().setDouble("xpAmount", ((new Object() {
						public double getValue(BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getDouble(tag);
							return -1;
						}
					}.getValue(new BlockPos((int) x, (int) y, (int) z), "xpAmount")) + 3));
				world.notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}
}
