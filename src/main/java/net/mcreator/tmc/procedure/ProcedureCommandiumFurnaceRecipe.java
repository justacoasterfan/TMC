package net.mcreator.tmc.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;

import net.mcreator.tmc.block.BlockCommandiumFurnaceOn;
import net.mcreator.tmc.block.BlockCommandiumFurnaceOff;
import net.mcreator.tmc.ElementsToomuchCommander;

import java.util.Map;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureCommandiumFurnaceRecipe extends ElementsToomuchCommander.ModElement {
	public ProcedureCommandiumFurnaceRecipe(ElementsToomuchCommander instance) {
		super(instance, 84);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CommandiumFurnaceRecipe!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CommandiumFurnaceRecipe!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CommandiumFurnaceRecipe!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CommandiumFurnaceRecipe!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCommandiumFurnaceOff.block.getDefaultState()
				.getBlock()) && (((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) > 0) && ((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (1))) > 0)))) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				IBlockState _bs = BlockCommandiumFurnaceOn.block.getDefaultState();
				IBlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
					IProperty _property = entry.getKey();
					if (_bs.getPropertyKeys().contains(_property))
						_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
				}
				TileEntity _te = world.getTileEntity(_bp);
				NBTTagCompound _bnbt = null;
				if (_te != null) {
					_bnbt = _te.writeToNBT(new NBTTagCompound());
					_te.invalidate();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.readFromNBT(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == BlockCommandiumFurnaceOn.block.getDefaultState()
				.getBlock())) {
			if ((((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "burnTime")) == 0) && ((new Object() {
				public int getAmount(BlockPos pos, int sltid) {
					TileEntity inv = world.getTileEntity(pos);
					if (inv instanceof TileEntityLockableLoot) {
						ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (0))) > 0))) {
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("world", world);
					$_dependencies.put("x", (int) (x));
					$_dependencies.put("y", (int) (y));
					$_dependencies.put("z", (int) (z));
					ProcedureCommandiumFurnaceFuelBurnTime.executeProcedure($_dependencies);
				}
			} else if (((new Object() {
				public double getValue(BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(new BlockPos((int) x, (int) y, (int) z), "burnTime")) > 0)) {
				if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "burnTime")) > 0)) {
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("burnTime", ((new Object() {
								public double getValue(BlockPos pos, String tag) {
									TileEntity tileEntity = world.getTileEntity(pos);
									if (tileEntity != null)
										return tileEntity.getTileData().getDouble(tag);
									return -1;
								}
							}.getValue(new BlockPos((int) x, (int) y, (int) z), "burnTime")) - 1));
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				if (((new Object() {
					public double getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(new BlockPos((int) x, (int) y, (int) z), "furnaceSpeed")) >= 200)) {
					if ((((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot) {
								ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 64) && (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof TileEntityLockableLoot)
								return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							return ItemStack.EMPTY;
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.COBBLESTONE, (int) (1))
							.getItem()) && ((((new Object() {
								public int getAmount(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot) {
										ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										if (stack != null)
											return stack.getCount();
									}
									return 0;
								}
							}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) <= 63) && ((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									TileEntity inv = world.getTileEntity(pos);
									if (inv instanceof TileEntityLockableLoot)
										return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
									return ItemStack.EMPTY;
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.STONE, (int) (1), 0)
									.getItem())) || ((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											TileEntity inv = world.getTileEntity(pos);
											if (inv instanceof TileEntityLockableLoot)
												return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
											return ItemStack.EMPTY;
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
											.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))))) {
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv instanceof TileEntityLockableLoot)
								((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
						}
						{
							java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
							$_dependencies.put("world", world);
							$_dependencies.put("x", (int) (x));
							$_dependencies.put("y", (int) (y));
							$_dependencies.put("z", (int) (z));
							ProcedureCommandiumFurnaceXpRewardXpAmount.executeProcedure($_dependencies);
						}
						{
							TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
							if (inv != null && (inv instanceof TileEntityLockableLoot)) {
								ItemStack _setstack = new ItemStack(Blocks.STONE, (int) (1), 0);
								_setstack.setCount(((new Object() {
									public int getAmount(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot) {
											ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (2))) + 1));
								((TileEntityLockableLoot) inv).setInventorySlotContents((int) (2), _setstack);
							}
						}
						world.playSound((EntityPlayer) null, x, y, z, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation("block.furnace.fire_crackle")), SoundCategory.NEUTRAL, (float) 1, (float) 1);
					}
					if (!world.isRemote) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						IBlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().setDouble("furnaceSpeed", 0);
						world.notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				if (!world.isRemote) {
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					TileEntity _tileEntity = world.getTileEntity(_bp);
					IBlockState _bs = world.getBlockState(_bp);
					if (_tileEntity != null)
						_tileEntity.getTileData().setDouble("furnaceSpeed", ((new Object() {
							public double getValue(BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(new BlockPos((int) x, (int) y, (int) z), "furnaceSpeed")) + 1));
					world.notifyBlockUpdate(_bp, _bs, _bs, 3);
				}
			} else {
				{
					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
					IBlockState _bs = BlockCommandiumFurnaceOff.block.getDefaultState();
					IBlockState _bso = world.getBlockState(_bp);
					for (Map.Entry<IProperty<?>, Comparable<?>> entry : _bso.getProperties().entrySet()) {
						IProperty _property = entry.getKey();
						if (_bs.getPropertyKeys().contains(_property))
							_bs = _bs.withProperty(_property, (Comparable) entry.getValue());
					}
					TileEntity _te = world.getTileEntity(_bp);
					NBTTagCompound _bnbt = null;
					if (_te != null) {
						_bnbt = _te.writeToNBT(new NBTTagCompound());
						_te.invalidate();
					}
					world.setBlockState(_bp, _bs, 3);
					if (_bnbt != null) {
						_te = world.getTileEntity(_bp);
						if (_te != null) {
							try {
								_te.readFromNBT(_bnbt);
							} catch (Exception ignored) {
							}
						}
					}
				}
			}
		}
	}
}
