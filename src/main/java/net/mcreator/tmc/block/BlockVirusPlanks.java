
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusPlanks extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:virusplanks")
	public static final Block block = null;

	public BlockVirusPlanks(ElementsToomuchCommander instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("virusplanks"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:virusplanks", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.WOOD);

			setUnlocalizedName("virusplanks");
			setSoundType(SoundType.WOOD);

			setHarvestLevel("axe", 1);

			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTooMuchCommander.tab);

		}

	}

}
