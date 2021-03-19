
package net.mcreator.tmc.world.structure;

@ElementsToomuchCommander.ModElement.Tag
public class StructureBunker extends ElementsToomuchCommander.ModElement {

	public StructureBunker(ElementsToomuchCommander instance) {
		super(instance, 77);
	}

	@Override
	public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		boolean dimensionCriteria = false;
		boolean isNetherType = false;
		if (dimID == 0)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;

		if ((random.nextInt(1000000) + 1) <= 1000) {

			int count = random.nextInt(1) + 1;
			for (int a = 0; a < count; a++) {

				int i = i2 + random.nextInt(16) + 8;
				int k = k2 + random.nextInt(16) + 8;
				int height = 255;

				if (isNetherType) {
					boolean notpassed = true;
					while (height > 0) {
						if (notpassed && (world.isAirBlock(new BlockPos(i, height, k)) || !world.getBlockState(new BlockPos(i, height, k)).getBlock()
								.getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement()))
							notpassed = false;
						else if (!notpassed && !world.isAirBlock(new BlockPos(i, height, k)) && world.getBlockState(new BlockPos(i, height, k))
								.getBlock().getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement())
							break;
						height--;
					}
				} else {
					while (height > 0) {
						if (!world.isAirBlock(new BlockPos(i, height, k)) && world.getBlockState(new BlockPos(i, height, k)).getBlock()
								.getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement())
							break;
						height--;
					}
				}

				int j = height - 1;

				if (world.isRemote)
					return;

				Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
						new ResourceLocation("tmc", "bunker40e"));
				if (template == null)
					return;

				Rotation rotation = Rotation.values()[random.nextInt(3)];
				Mirror mirror = Mirror.values()[random.nextInt(2)];

				BlockPos spawnTo = new BlockPos(i, j + -25, k);
				IBlockState iblockstate = world.getBlockState(spawnTo);
				world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);
				template.addBlocksToWorldChunk(world, spawnTo, new PlacementSettings().setRotation(rotation).setMirror(mirror)
						.setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(false).setIgnoreEntities(false));

			}

		}
	}

}
