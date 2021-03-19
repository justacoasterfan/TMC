
package net.mcreator.tmc.world;

@ElementsToomuchCommander.ModElement.Tag
public class WorldDreieich extends ElementsToomuchCommander.ModElement {

	public static int DIMID = 3;
	public static final boolean NETHER_TYPE = false;

	@GameRegistry.ObjectHolder("tmc:dreieich_portal")
	public static final BlockCustomPortal portal = null;

	public static DimensionType dtype;

	public WorldDreieich(ElementsToomuchCommander instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomPortal());
		elements.items.add(() -> new ItemBlock(portal).setRegistryName(portal.getRegistryName()));
		elements.items.add(() -> new ItemDreieich().setUnlocalizedName("dreieich").setRegistryName("dreieich"));
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		if (DimensionManager.isDimensionRegistered(DIMID)) {
			DIMID = DimensionManager.getNextFreeDimId();
			System.err.println("Dimension ID for dimension dreieich is already registered. Falling back to ID: " + DIMID);
		}
		dtype = DimensionType.register("dreieich", "_dreieich", DIMID, WorldProviderMod.class, true);
		DimensionManager.registerDimension(DIMID, dtype);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(ItemDreieich.block, 0, new ModelResourceLocation("tmc:dreieich", "inventory"));
	}

	public static class WorldProviderMod extends WorldProvider {

		@Override
		public void init() {
			this.biomeProvider = new BiomeProviderCustom(this.world.getSeed());
			this.nether = NETHER_TYPE;
			this.hasSkyLight = true;
		}

		@Override
		public DimensionType getDimensionType() {
			return dtype;
		}

		@Override
		@SideOnly(Side.CLIENT)
		public Vec3d getFogColor(float par1, float par2) {
			return new Vec3d(0.752941176471, 0.847058823529, 1);
		}

		@Override
		public IChunkGenerator createChunkGenerator() {
			return new ChunkProviderModded(this.world, this.world.getSeed() - DIMID);
		}

		@Override
		public boolean isSurfaceWorld() {
			return false;
		}

		@Override
		public boolean canRespawnHere() {
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public boolean doesXZShowFog(int par1, int par2) {
			return false;
		}

		@Override
		public WorldSleepResult canSleepAt(EntityPlayer player, BlockPos pos) {
			return WorldSleepResult.ALLOW;
		}

		@Override
		protected void generateLightBrightnessTable() {
			float f = 0.5f;
			for (int i = 0; i <= 15; ++i) {
				float f1 = 1 - (float) i / 15f;
				this.lightBrightnessTable[i] = (1 - f1) / (f1 * 3 + 1) * (1 - f) + f;
			}
		}

		@Override
		public boolean doesWaterVaporize() {
			return false;
		}

	}

public static class TeleporterDimensionMod extends Teleporter {

	private Vec3d lastPortalVec;
	private EnumFacing teleportDirection;

	public TeleporterDimensionMod(WorldServer worldServer, Vec3d lastPortalVec, EnumFacing teleportDirection) {
		super(worldServer);
		this.lastPortalVec = lastPortalVec;
		this.teleportDirection = teleportDirection;
	}

	@Override /* failed to load code for net.minecraft.world.Teleporter */

	@Override /* failed to load code for net.minecraft.world.Teleporter */

	@Override /* failed to load code for net.minecraft.world.Teleporter */

}

	public static class BlockCustomPortal extends BlockPortal {

		public BlockCustomPortal() {
			setHardness(-1.0F);
			setUnlocalizedName("dreieich_portal");
			setRegistryName("dreieich_portal");
			setLightLevel(1F);
		}

		@Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
		}

		public void portalSpawn(World worldIn, BlockPos pos) {
			BlockCustomPortal.Size portalsize = new BlockCustomPortal.Size(worldIn, pos, EnumFacing.Axis.X);
			if (portalsize.isValid() && portalsize.portalBlockCount == 0) {
				portalsize.placePortalBlocks();
			} else {
				portalsize = new BlockCustomPortal.Size(worldIn, pos, EnumFacing.Axis.Z);
				if (portalsize.isValid() && portalsize.portalBlockCount == 0)
					portalsize.placePortalBlocks();
			}
		}

		@Override /* failed to load code for net.minecraft.block.BlockPortal */

		@Override /* failed to load code for net.minecraft.block.BlockPortal */

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			for (int i = 0; i < 4; i++) {
				double px = pos.getX() + random.nextFloat();
				double py = pos.getY() + random.nextFloat();
				double pz = pos.getZ() + random.nextFloat();
				double vx = (random.nextFloat() - 0.5) / 2f;
				double vy = (random.nextFloat() - 0.5) / 2f;
				double vz = (random.nextFloat() - 0.5) / 2f;
				int j = random.nextInt(4) - 1;
				if (world.getBlockState(pos.west()).getBlock() != this && world.getBlockState(pos.east()).getBlock() != this) {
					px = pos.getX() + 0.5 + 0.25 * j;
					vx = random.nextFloat() * 2 * j;
				} else {
					pz = pos.getZ() + 0.5 + 0.25 * j;
					vz = random.nextFloat() * 2 * j;
				}
				world.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, px, py, pz, vx, vy, vz);
			}

			if (random.nextInt(110) == 0)
				world.playSound(pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
						(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY
								.getObject(new ResourceLocation(("block.portal.ambient"))),
						SoundCategory.BLOCKS, 0.5f, random.nextFloat() * 0.4F + 0.8F, false);
		}

		public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
			if (!worldIn.isRemote && !entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn instanceof EntityPlayerMP) {
				EntityPlayerMP thePlayer = (EntityPlayerMP) entityIn;
				if (thePlayer.timeUntilPortal > 0) {
					thePlayer.timeUntilPortal = 10;
				} else if (thePlayer.dimension != DIMID) {
					thePlayer.timeUntilPortal = 10;
					ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
					thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, DIMID, getTeleporterForDimension(thePlayer, pos, DIMID));
				} else {
					thePlayer.timeUntilPortal = 10;
					ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
					thePlayer.mcServer.getPlayerList().transferPlayerToDimension(thePlayer, 0, getTeleporterForDimension(thePlayer, pos, 0));
				}

			}
		}

		private TeleporterDimensionMod getTeleporterForDimension(Entity entity, BlockPos pos, int dimid) {
			BlockPattern.PatternHelper bph = portal.createPatternHelper(entity.world, new BlockPos(pos));
			double d0 = bph.getForwards().getAxis() == EnumFacing.Axis.X
					? (double) bph.getFrontTopLeft().getZ()
					: (double) bph.getFrontTopLeft().getX();
			double d1 = bph.getForwards().getAxis() == EnumFacing.Axis.X ? entity.posZ : entity.posX;
			d1 = Math.abs(MathHelper.pct(d1 - (double) (bph.getForwards().rotateY().getAxisDirection() == EnumFacing.AxisDirection.NEGATIVE ? 1 : 0),
					d0, d0 - (double) bph.getWidth()));
			double d2 = MathHelper.pct(entity.posY - 1, (double) bph.getFrontTopLeft().getY(),
					(double) (bph.getFrontTopLeft().getY() - bph.getHeight()));
			return new TeleporterDimensionMod(entity.getServer().getWorld(dimid), new Vec3d(d1, d2, 0), bph.getForwards());
		}

	public static class Size /* failed to load code for net.minecraft.block.BlockPortal */

}

		public static class ChunkProviderModded implements IChunkGenerator {

			private static final IBlockState STONE = Blocks.STONE.getStateFromMeta(0);
			private static final IBlockState AIR = Blocks.AIR.getDefaultState();

			private static final int SEALEVEL = 63;

			private final World world;
			private Random random;

			private final NoiseGeneratorSimplex islandNoise;
			private final NoiseGeneratorOctaves perlinnoise1;
			private final NoiseGeneratorOctaves perlinnoise2;
			private final NoiseGeneratorOctaves perlinnoise3;
			private final NoiseGeneratorPerlin height;

			private Biome[] biomesForGeneration;
			private double[] buffer;
			private double[] pnr;
			private double[] ar;
			private double[] br;

			private double[] depthbuff = new double[256];

			private WorldGenerator islandGen;

			public ChunkProviderModded(World worldIn, long seed) {
				worldIn.setSeaLevel(SEALEVEL);

				this.world = worldIn;
				this.random = new Random(seed);
				this.perlinnoise1 = new NoiseGeneratorOctaves(this.random, 16);
				this.perlinnoise2 = new NoiseGeneratorOctaves(this.random, 16);
				this.perlinnoise3 = new NoiseGeneratorOctaves(this.random, 8);
				this.height = new NoiseGeneratorPerlin(this.random, 4);
				this.islandNoise = new NoiseGeneratorSimplex(this.random);

				this.islandGen = new WorldGenerator() {
					public boolean generate(World worldIn, Random rand, BlockPos position) {
						float f = (float) (rand.nextInt(4) + 5);
						for (int i = 0; f > 1.5F; --i) {
							for (int j = MathHelper.floor(-f); j <= MathHelper.ceil(f); ++j) {
								for (int k = MathHelper.floor(-f); k <= MathHelper.ceil(f); ++k) {
									if ((float) (j * j + k * k) <= (f + 1.0F) * (f + 1.0F)) {
										this.setBlockAndNotifyAdequately(worldIn, position.add(j, i, k), STONE);
									}
								}
							}
							f = (float) ((double) f - ((double) rand.nextInt(2) + 0.5D));
						}

						return true;
					}
				};
			}

			@Override
			public Chunk generateChunk(int x, int z) {
				this.random.setSeed((long) x * 535358712L + (long) z * 347539041L);
				ChunkPrimer chunkprimer = new ChunkPrimer();
				this.setBlocksInChunk(x, z, chunkprimer);

				this.biomesForGeneration = this.world.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 16, z * 16, 16, 16);
				this.replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);

				Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
				byte[] abyte = chunk.getBiomeArray();

				for (int i = 0; i < abyte.length; ++i)
					abyte[i] = (byte) Biome.getIdForBiome(this.biomesForGeneration[i]);

				chunk.generateSkylightMap();
				return chunk;
			}

			@Override
			public void populate(int x, int z) {
				BlockFalling.fallInstantly = true;

				net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.random, x, z, false);

				int i = x * 16;
				int j = z * 16;
				BlockPos blockpos = new BlockPos(i, 0, j);

				float f = this.getIslandHeightValue(x, z, 1, 1);
				if (f < -10.0F && this.random.nextInt(6) == 0) {
					this.islandGen.generate(this.world, this.random,
							blockpos.add(this.random.nextInt(16) + 8, 55 + this.random.nextInt(16), this.random.nextInt(16) + 8));
					if (this.random.nextInt(4) == 0)
						this.islandGen.generate(this.world, this.random,
								blockpos.add(this.random.nextInt(16) + 8, 55 + this.random.nextInt(16), this.random.nextInt(16) + 8));
				}

				Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));

				net.minecraftforge.common.MinecraftForge.EVENT_BUS
						.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Pre(this.world, this.random, blockpos));

				biome.decorate(this.world, this.random, new BlockPos(i, 0, j));

				net.minecraftforge.common.MinecraftForge.EVENT_BUS
						.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Post(this.world, this.random, blockpos));

				if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.random, x, z, false,
						net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS))
					WorldEntitySpawner.performWorldGenSpawning(this.world, biome, i + 8, j + 8, 16, 16, this.random);

				net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.random, x, z, false);

				BlockFalling.fallInstantly = false;
			}

			@Override
			public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
				return this.world.getBiome(pos).getSpawnableList(creatureType);
			}

			@Override
			public void recreateStructures(Chunk chunkIn, int x, int z) {
			}

			@Override
			public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
				return false;
			}

			@Override
			public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
				return null;
			}

			@Override
			public boolean generateStructures(Chunk chunkIn, int x, int z) {
				return false;
			}

			/* failed to load code for net.minecraft.world.gen.ChunkGeneratorEnd */

			/* failed to load code for net.minecraft.world.gen.ChunkGeneratorEnd */

			/* failed to load code for net.minecraft.world.gen.ChunkGeneratorEnd */

			private void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {
				this.depthbuff = this.height.getRegion(this.depthbuff, (double) (x * 16), (double) (z * 16), 16, 16, 0.0625, 0.0625, 1.0);
				for (int i = 0; i < 16; i++)
					for (int j = 0; j < 16; j++)
						generateBiomeTerrain(this.world, this.random, primer, x * 16 + i, z * 16 + j, this.depthbuff[j + i * 16],
								biomesIn[j + i * 16]);
			}

			private void generateBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal, Biome biome) {
				int i = SEALEVEL;
				IBlockState iblockstate = biome.topBlock;
				IBlockState iblockstate1 = biome.fillerBlock;
				int j = -1;
				int k = (int) (noiseVal / 3.0 + 3 + rand.nextDouble() / 4f);
				int l = x & 15;
				int i1 = z & 15;

				for (int j1 = 255; j1 >= 0; --j1) {
					IBlockState iblockstate2 = chunkPrimerIn.getBlockState(i1, j1, l);

					if (iblockstate2.getMaterial() == Material.AIR) {
						j = -1;
					} else if (iblockstate2.getBlock() == STONE.getBlock()) {
						if (j == -1) {
							if (k <= 0) {
								iblockstate = AIR;
								iblockstate1 = STONE;
							}

							j = k;

							if (j1 >= i - 1) {
								chunkPrimerIn.setBlockState(i1, j1, l, iblockstate);
							} else if (j1 < i - 7 - k) {
								iblockstate1 = STONE;
							} else {
								chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1);
							}
						} else if (j > 0) {
							j--;
							chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1);
						}
					}
				}
			}

		}

		public static class GenLayerBiomesCustom extends GenLayer {

			private Biome[] allowedBiomes = {Biome.REGISTRY.getObject(new ResourceLocation("tmc:commanderfields")),};

			public GenLayerBiomesCustom(long seed) {
				super(seed);
			}

			@Override
			public int[] getInts(int x, int z, int width, int depth) {
				int[] dest = IntCache.getIntCache(width * depth);
				for (int dz = 0; dz < depth; dz++) {
					for (int dx = 0; dx < width; dx++) {
						this.initChunkSeed(dx + x, dz + z);
						dest[(dx + dz * width)] = Biome.getIdForBiome(this.allowedBiomes[nextInt(this.allowedBiomes.length)]);
					}
				}
				return dest;
			}
		}

public static class BiomeProviderCustom extends BiomeProvider {

	private GenLayer genBiomes;
	private GenLayer biomeIndexLayer;
	private BiomeCache biomeCache;

	public BiomeProviderCustom() {
		this.biomeCache = new BiomeCache(this);
	}

	public BiomeProviderCustom(long seed) {
		this.biomeCache = new BiomeCache(this);
		GenLayer[] agenlayer = makeTheWorld(seed);
		this.genBiomes = agenlayer[0];
		this.biomeIndexLayer = agenlayer[1];
	}

	private GenLayer[] makeTheWorld(long seed) {
		GenLayer biomes = new GenLayerBiomesCustom(1);
		biomes = new GenLayerZoom(1000, biomes);
		biomes = new GenLayerZoom(1001, biomes);
		biomes = new GenLayerZoom(1002, biomes);
		biomes = new GenLayerZoom(1003, biomes);
		biomes = new GenLayerZoom(1004, biomes);
		biomes = new GenLayerZoom(1005, biomes);
		GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10, biomes);
		biomes.initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);
		return new GenLayer[] { biomes, genlayervoronoizoom };
	}

	public BiomeProviderCustom(World world) {
		this(world.getSeed());
	}

	@Override public void cleanupCache() {
		this.biomeCache.cleanupCache();
	}

	@Override public Biome getBiome(BlockPos pos) {
		return this.getBiome(pos, null);
	}

	@Override public Biome getBiome(BlockPos pos, Biome defaultBiome) {
		return this.biomeCache.getBiome(pos.getX(), pos.getZ(), defaultBiome);
	}

	@Override public Biome[] getBiomes(Biome[] oldBiomeList, int x, int z, int width, int depth) {
		return this.getBiomes(oldBiomeList, x, z, width, depth, true);
	}

	@Override /* failed to load code for net.minecraft.world.biome.BiomeProvider */

	@Override /* failed to load code for net.minecraft.world.biome.BiomeProvider */

	@Override /* failed to load code for net.minecraft.world.biome.BiomeProvider */

	@Override /* failed to load code for net.minecraft.world.biome.BiomeProvider */

}
}
