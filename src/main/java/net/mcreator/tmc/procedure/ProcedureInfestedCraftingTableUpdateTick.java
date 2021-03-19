package net.mcreator.tmc.procedure;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureInfestedCraftingTableUpdateTick extends ElementsToomuchCommander.ModElement {

	public ProcedureInfestedCraftingTableUpdateTick(ElementsToomuchCommander instance) {
		super(instance, 73);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure InfestedCraftingTableUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure InfestedCraftingTableUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure InfestedCraftingTableUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure InfestedCraftingTableUpdateTick!");
			return;
		}

		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");

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
		}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (9))) != 64) && ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof TileEntityLockableLoot)
					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem()
				&& (new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1))
						.getMetadata())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(ItemCommanderBone.block, (int) (1))
						.getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
								.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1)).getMetadata())
						&& (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
								.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2)))
										.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1)).getMetadata())
								&& (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
										.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem() && (new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
												.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1)).getMetadata())
										&& (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												TileEntity inv = world.getTileEntity(pos);
												if (inv instanceof TileEntityLockableLoot)
													return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
												return ItemStack.EMPTY;
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
												.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem() && (new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
														.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1)).getMetadata())
												&& (((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														TileEntity inv = world.getTileEntity(pos);
														if (inv instanceof TileEntityLockableLoot)
															return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
														return ItemStack.EMPTY;
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
														.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem() && (new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
																.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1)).getMetadata())
														&& (((new Object() {
															public ItemStack getItemStack(BlockPos pos, int sltid) {
																TileEntity inv = world.getTileEntity(pos);
																if (inv instanceof TileEntityLockableLoot)
																	return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																return ItemStack.EMPTY;
															}
														}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem()
																&& (new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
																		.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1))
																				.getMetadata())
																&& (((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		TileEntity inv = world.getTileEntity(pos);
																		if (inv instanceof TileEntityLockableLoot)
																			return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																		return ItemStack.EMPTY;
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																		.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1)).getItem()
																		&& (new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
																				.getMetadata() == new ItemStack(ItemCommanderBone.block, (int) (1))
																						.getMetadata())
																		&& (((new Object() {
																			public ItemStack getItemStack(BlockPos pos, int sltid) {
																				TileEntity inv = world.getTileEntity(pos);
																				if (inv instanceof TileEntityLockableLoot)
																					return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
																				return ItemStack.EMPTY;
																			}
																		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10)))
																				.getItem() == new ItemStack(ItemCommanderBone.block, (int) (1))
																						.getItem()
																				&& (new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (10)))
																						.getMetadata() == new ItemStack(ItemCommanderBone.block,
																								(int) (1)).getMetadata())
																				&& (((new Object() {
																					public ItemStack getItemStack(BlockPos pos, int sltid) {
																						TileEntity inv = world.getTileEntity(pos);
																						if (inv instanceof TileEntityLockableLoot)
																							return ((TileEntityLockableLoot) inv)
																									.getStackInSlot(sltid);
																						return ItemStack.EMPTY;
																					}
																				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (11)))
																						.getItem() == new ItemStack(ItemCommanderBone.block,
																								(int) (1)).getItem()
																						&& (new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof TileEntityLockableLoot)
																									return ((TileEntityLockableLoot) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (11)))
																										.getMetadata() == new ItemStack(
																												ItemCommanderBone.block, (int) (1))
																														.getMetadata())
																						&& (((new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								TileEntity inv = world.getTileEntity(pos);
																								if (inv instanceof TileEntityLockableLoot)
																									return ((TileEntityLockableLoot) inv)
																											.getStackInSlot(sltid);
																								return ItemStack.EMPTY;
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (12)))
																										.getItem() == new ItemStack(
																												ItemCommanderBone.block, (int) (1))
																														.getItem()
																								&& (new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof TileEntityLockableLoot)
																											return ((TileEntityLockableLoot) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (12))).getMetadata() == new ItemStack(
																												ItemCommanderBone.block, (int) (1))
																														.getMetadata())
																								&& (((new Object() {
																									public ItemStack getItemStack(BlockPos pos,
																											int sltid) {
																										TileEntity inv = world.getTileEntity(pos);
																										if (inv instanceof TileEntityLockableLoot)
																											return ((TileEntityLockableLoot) inv)
																													.getStackInSlot(sltid);
																										return ItemStack.EMPTY;
																									}
																								}.getItemStack(
																										new BlockPos((int) x, (int) y, (int) z),
																										(int) (13))).getItem() == new ItemStack(
																												ItemCommanderBone.block, (int) (1))
																														.getItem()
																										&& (new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof TileEntityLockableLoot)
																													return ((TileEntityLockableLoot) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (13)))
																														.getMetadata() == new ItemStack(
																																ItemCommanderBone.block,
																																(int) (1))
																																		.getMetadata())
																										&& (((new Object() {
																											public ItemStack getItemStack(
																													BlockPos pos, int sltid) {
																												TileEntity inv = world
																														.getTileEntity(pos);
																												if (inv instanceof TileEntityLockableLoot)
																													return ((TileEntityLockableLoot) inv)
																															.getStackInSlot(sltid);
																												return ItemStack.EMPTY;
																											}
																										}.getItemStack(
																												new BlockPos((int) x, (int) y,
																														(int) z),
																												(int) (14)))
																														.getItem() == new ItemStack(
																																ItemCommanderBone.block,
																																(int) (1)).getItem()
																												&& (new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof TileEntityLockableLoot)
																															return ((TileEntityLockableLoot) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (14)))
																																.getMetadata() == new ItemStack(
																																		ItemCommanderBone.block,
																																		(int) (1))
																																				.getMetadata())
																												&& (((new Object() {
																													public ItemStack getItemStack(
																															BlockPos pos, int sltid) {
																														TileEntity inv = world
																																.getTileEntity(pos);
																														if (inv instanceof TileEntityLockableLoot)
																															return ((TileEntityLockableLoot) inv)
																																	.getStackInSlot(
																																			sltid);
																														return ItemStack.EMPTY;
																													}
																												}.getItemStack(
																														new BlockPos((int) x, (int) y,
																																(int) z),
																														(int) (15)))
																																.getItem() == new ItemStack(
																																		ItemCommanderBone.block,
																																		(int) (1))
																																				.getItem()
																														&& (new Object() {
																															public ItemStack getItemStack(
																																	BlockPos pos,
																																	int sltid) {
																																TileEntity inv = world
																																		.getTileEntity(
																																				pos);
																																if (inv instanceof TileEntityLockableLoot)
																																	return ((TileEntityLockableLoot) inv)
																																			.getStackInSlot(
																																					sltid);
																																return ItemStack.EMPTY;
																															}
																														}.getItemStack(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z),
																																(int) (15)))
																																		.getMetadata() == new ItemStack(
																																				ItemCommanderBone.block,
																																				(int) (1))
																																						.getMetadata())
																														&& (((new Object() {
																															public ItemStack getItemStack(
																																	BlockPos pos,
																																	int sltid) {
																																TileEntity inv = world
																																		.getTileEntity(
																																				pos);
																																if (inv instanceof TileEntityLockableLoot)
																																	return ((TileEntityLockableLoot) inv)
																																			.getStackInSlot(
																																					sltid);
																																return ItemStack.EMPTY;
																															}
																														}.getItemStack(
																																new BlockPos((int) x,
																																		(int) y,
																																		(int) z),
																																(int) (16)))
																																		.getItem() == new ItemStack(
																																				ItemCommanderBone.block,
																																				(int) (1))
																																						.getItem()
																																&& (new Object() {
																																	public ItemStack getItemStack(
																																			BlockPos pos,
																																			int sltid) {
																																		TileEntity inv = world
																																				.getTileEntity(
																																						pos);
																																		if (inv instanceof TileEntityLockableLoot)
																																			return ((TileEntityLockableLoot) inv)
																																					.getStackInSlot(
																																							sltid);
																																		return ItemStack.EMPTY;
																																	}
																																}.getItemStack(
																																		new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z),
																																		(int) (16)))
																																				.getMetadata() == new ItemStack(
																																						ItemCommanderBone.block,
																																						(int) (1))
																																								.getMetadata())
																																&& (((new Object() {
																																	public ItemStack getItemStack(
																																			BlockPos pos,
																																			int sltid) {
																																		TileEntity inv = world
																																				.getTileEntity(
																																						pos);
																																		if (inv instanceof TileEntityLockableLoot)
																																			return ((TileEntityLockableLoot) inv)
																																					.getStackInSlot(
																																							sltid);
																																		return ItemStack.EMPTY;
																																	}
																																}.getItemStack(
																																		new BlockPos(
																																				(int) x,
																																				(int) y,
																																				(int) z),
																																		(int) (17)))
																																				.getItem() == new ItemStack(
																																						ItemCommanderBone.block,
																																						(int) (1))
																																								.getItem()
																																		&& (new Object() {
																																			public ItemStack getItemStack(
																																					BlockPos pos,
																																					int sltid) {
																																				TileEntity inv = world
																																						.getTileEntity(
																																								pos);
																																				if (inv instanceof TileEntityLockableLoot)
																																					return ((TileEntityLockableLoot) inv)
																																							.getStackInSlot(
																																									sltid);
																																				return ItemStack.EMPTY;
																																			}
																																		}.getItemStack(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z),
																																				(int) (17)))
																																						.getMetadata() == new ItemStack(
																																								ItemCommanderBone.block,
																																								(int) (1))
																																										.getMetadata())
																																		&& (((new Object() {
																																			public ItemStack getItemStack(
																																					BlockPos pos,
																																					int sltid) {
																																				TileEntity inv = world
																																						.getTileEntity(
																																								pos);
																																				if (inv instanceof TileEntityLockableLoot)
																																					return ((TileEntityLockableLoot) inv)
																																							.getStackInSlot(
																																									sltid);
																																				return ItemStack.EMPTY;
																																			}
																																		}.getItemStack(
																																				new BlockPos(
																																						(int) x,
																																						(int) y,
																																						(int) z),
																																				(int) (18)))
																																						.getItem() == new ItemStack(
																																								ItemCommanderBone.block,
																																								(int) (1))
																																										.getItem()
																																				&& (new Object() {
																																					public ItemStack getItemStack(
																																							BlockPos pos,
																																							int sltid) {
																																						TileEntity inv = world
																																								.getTileEntity(
																																										pos);
																																						if (inv instanceof TileEntityLockableLoot)
																																							return ((TileEntityLockableLoot) inv)
																																									.getStackInSlot(
																																											sltid);
																																						return ItemStack.EMPTY;
																																					}
																																				}.getItemStack(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z),
																																						(int) (18)))
																																								.getMetadata() == new ItemStack(
																																										ItemCommanderBone.block,
																																										(int) (1))
																																												.getMetadata())
																																				&& (((new Object() {
																																					public ItemStack getItemStack(
																																							BlockPos pos,
																																							int sltid) {
																																						TileEntity inv = world
																																								.getTileEntity(
																																										pos);
																																						if (inv instanceof TileEntityLockableLoot)
																																							return ((TileEntityLockableLoot) inv)
																																									.getStackInSlot(
																																											sltid);
																																						return ItemStack.EMPTY;
																																					}
																																				}.getItemStack(
																																						new BlockPos(
																																								(int) x,
																																								(int) y,
																																								(int) z),
																																						(int) (19)))
																																								.getItem() == new ItemStack(
																																										ItemCommanderBone.block,
																																										(int) (1))
																																												.getItem()
																																						&& (new Object() {
																																							public ItemStack getItemStack(
																																									BlockPos pos,
																																									int sltid) {
																																								TileEntity inv = world
																																										.getTileEntity(
																																												pos);
																																								if (inv instanceof TileEntityLockableLoot)
																																									return ((TileEntityLockableLoot) inv)
																																											.getStackInSlot(
																																													sltid);
																																								return ItemStack.EMPTY;
																																							}
																																						}.getItemStack(
																																								new BlockPos(
																																										(int) x,
																																										(int) y,
																																										(int) z),
																																								(int) (19)))
																																										.getMetadata() == new ItemStack(
																																												ItemCommanderBone.block,
																																												(int) (1))
																																														.getMetadata())
																																						&& (((new Object() {
																																							public ItemStack getItemStack(
																																									BlockPos pos,
																																									int sltid) {
																																								TileEntity inv = world
																																										.getTileEntity(
																																												pos);
																																								if (inv instanceof TileEntityLockableLoot)
																																									return ((TileEntityLockableLoot) inv)
																																											.getStackInSlot(
																																													sltid);
																																								return ItemStack.EMPTY;
																																							}
																																						}.getItemStack(
																																								new BlockPos(
																																										(int) x,
																																										(int) y,
																																										(int) z),
																																								(int) (20)))
																																										.getItem() == new ItemStack(
																																												ItemCommanderBone.block,
																																												(int) (1))
																																														.getItem()
																																								&& (new Object() {
																																									public ItemStack getItemStack(
																																											BlockPos pos,
																																											int sltid) {
																																										TileEntity inv = world
																																												.getTileEntity(
																																														pos);
																																										if (inv instanceof TileEntityLockableLoot)
																																											return ((TileEntityLockableLoot) inv)
																																													.getStackInSlot(
																																															sltid);
																																										return ItemStack.EMPTY;
																																									}
																																								}.getItemStack(
																																										new BlockPos(
																																												(int) x,
																																												(int) y,
																																												(int) z),
																																										(int) (20)))
																																												.getMetadata() == new ItemStack(
																																														ItemCommanderBone.block,
																																														(int) (1))
																																																.getMetadata())
																																								&& (((new Object() {
																																									public ItemStack getItemStack(
																																											BlockPos pos,
																																											int sltid) {
																																										TileEntity inv = world
																																												.getTileEntity(
																																														pos);
																																										if (inv instanceof TileEntityLockableLoot)
																																											return ((TileEntityLockableLoot) inv)
																																													.getStackInSlot(
																																															sltid);
																																										return ItemStack.EMPTY;
																																									}
																																								}.getItemStack(
																																										new BlockPos(
																																												(int) x,
																																												(int) y,
																																												(int) z),
																																										(int) (21)))
																																												.getItem() == new ItemStack(
																																														ItemCommanderBone.block,
																																														(int) (1))
																																																.getItem()
																																										&& (new Object() {
																																											public ItemStack getItemStack(
																																													BlockPos pos,
																																													int sltid) {
																																												TileEntity inv = world
																																														.getTileEntity(
																																																pos);
																																												if (inv instanceof TileEntityLockableLoot)
																																													return ((TileEntityLockableLoot) inv)
																																															.getStackInSlot(
																																																	sltid);
																																												return ItemStack.EMPTY;
																																											}
																																										}.getItemStack(
																																												new BlockPos(
																																														(int) x,
																																														(int) y,
																																														(int) z),
																																												(int) (21)))
																																														.getMetadata() == new ItemStack(
																																																ItemCommanderBone.block,
																																																(int) (1))
																																																		.getMetadata())
																																										&& (((new Object() {
																																											public ItemStack getItemStack(
																																													BlockPos pos,
																																													int sltid) {
																																												TileEntity inv = world
																																														.getTileEntity(
																																																pos);
																																												if (inv instanceof TileEntityLockableLoot)
																																													return ((TileEntityLockableLoot) inv)
																																															.getStackInSlot(
																																																	sltid);
																																												return ItemStack.EMPTY;
																																											}
																																										}.getItemStack(
																																												new BlockPos(
																																														(int) x,
																																														(int) y,
																																														(int) z),
																																												(int) (22)))
																																														.getItem() == new ItemStack(
																																																ItemCommanderBone.block,
																																																(int) (1))
																																																		.getItem()
																																												&& (new Object() {
																																													public ItemStack getItemStack(
																																															BlockPos pos,
																																															int sltid) {
																																														TileEntity inv = world
																																																.getTileEntity(
																																																		pos);
																																														if (inv instanceof TileEntityLockableLoot)
																																															return ((TileEntityLockableLoot) inv)
																																																	.getStackInSlot(
																																																			sltid);
																																														return ItemStack.EMPTY;
																																													}
																																												}.getItemStack(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) z),
																																														(int) (22)))
																																																.getMetadata() == new ItemStack(
																																																		ItemCommanderBone.block,
																																																		(int) (1))
																																																				.getMetadata())
																																												&& (((new Object() {
																																													public ItemStack getItemStack(
																																															BlockPos pos,
																																															int sltid) {
																																														TileEntity inv = world
																																																.getTileEntity(
																																																		pos);
																																														if (inv instanceof TileEntityLockableLoot)
																																															return ((TileEntityLockableLoot) inv)
																																																	.getStackInSlot(
																																																			sltid);
																																														return ItemStack.EMPTY;
																																													}
																																												}.getItemStack(
																																														new BlockPos(
																																																(int) x,
																																																(int) y,
																																																(int) z),
																																														(int) (23)))
																																																.getItem() == new ItemStack(
																																																		ItemCommanderBone.block,
																																																		(int) (1))
																																																				.getItem()
																																														&& (new Object() {
																																															public ItemStack getItemStack(
																																																	BlockPos pos,
																																																	int sltid) {
																																																TileEntity inv = world
																																																		.getTileEntity(
																																																				pos);
																																																if (inv instanceof TileEntityLockableLoot)
																																																	return ((TileEntityLockableLoot) inv)
																																																			.getStackInSlot(
																																																					sltid);
																																																return ItemStack.EMPTY;
																																															}
																																														}.getItemStack(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) z),
																																																(int) (23)))
																																																		.getMetadata() == new ItemStack(
																																																				ItemCommanderBone.block,
																																																				(int) (1))
																																																						.getMetadata())
																																														&& ((new Object() {
																																															public ItemStack getItemStack(
																																																	BlockPos pos,
																																																	int sltid) {
																																																TileEntity inv = world
																																																		.getTileEntity(
																																																				pos);
																																																if (inv instanceof TileEntityLockableLoot)
																																																	return ((TileEntityLockableLoot) inv)
																																																			.getStackInSlot(
																																																					sltid);
																																																return ItemStack.EMPTY;
																																															}
																																														}.getItemStack(
																																																new BlockPos(
																																																		(int) x,
																																																		(int) y,
																																																		(int) z),
																																																(int) (24)))
																																																		.getItem() == new ItemStack(
																																																				ItemCommanderBone.block,
																																																				(int) (1))
																																																						.getItem()
																																																&& (new Object() {
																																																	public ItemStack getItemStack(
																																																			BlockPos pos,
																																																			int sltid) {
																																																		TileEntity inv = world
																																																				.getTileEntity(
																																																						pos);
																																																		if (inv instanceof TileEntityLockableLoot)
																																																			return ((TileEntityLockableLoot) inv)
																																																					.getStackInSlot(
																																																							sltid);
																																																		return ItemStack.EMPTY;
																																																	}
																																																}.getItemStack(
																																																		new BlockPos(
																																																				(int) x,
																																																				(int) y,
																																																				(int) z),
																																																		(int) (24)))
																																																				.getMetadata() == new ItemStack(
																																																						ItemCommanderBone.block,
																																																						(int) (1))
																																																								.getMetadata())))))))))))))))))))))))
				&& ((((new Object() {
					public int getAmount(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot) {
							ItemStack stack = ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
							if (stack != null)
								return stack.getCount();
						}
						return 0;
					}
				}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (25))) <= 63) && ((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof TileEntityLockableLoot)
							return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (25)))
						.getItem() == new ItemStack(BlockCommanderBoneBlock.block, (int) (1)).getItem() && (new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (25)))
								.getMetadata() == new ItemStack(BlockCommanderBoneBlock.block, (int) (1)).getMetadata()))
						|| ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof TileEntityLockableLoot)
									return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (25))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
								.getItem() && (new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										TileEntity inv = world.getTileEntity(pos);
										if (inv instanceof TileEntityLockableLoot)
											return ((TileEntityLockableLoot) inv).getStackInSlot(sltid);
										return ItemStack.EMPTY;
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (25)))
										.getMetadata() == new ItemStack(Blocks.AIR, (int) (1)).getMetadata()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (2), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (3), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (4), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (5), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (6), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (7), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (8), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (9), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (10), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (11), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (12), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (13), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (14), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (15), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (16), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (17), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (18), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (19), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (20), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (21), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (22), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (23), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof TileEntityLockableLoot)
					((TileEntityLockableLoot) inv).decrStackSize((int) (24), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof TileEntityLockableLoot)) {
					ItemStack _setstack = new ItemStack(BlockCommanderBoneBlock.block, (int) (1));
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
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (25))) + 1));
					((TileEntityLockableLoot) inv).setInventorySlotContents((int) (25), _setstack);
				}
			}
		}

	}

}
