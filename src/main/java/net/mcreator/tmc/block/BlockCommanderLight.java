
package net.mcreator.tmc.block;

@ElementsToomuchCommander.ModElement.Tag
public class BlockCommanderLight extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commanderlight")
	public static final Block block = null;

	public BlockCommanderLight(ElementsToomuchCommander instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("commanderlight"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("tmc:commanderlight", "inventory"));

	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.REDSTONE_LIGHT);

			setUnlocalizedName("commanderlight");
			setSoundType(SoundType.GROUND);

			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabTooMuchCommander.tab);
			setBlockUnbreakable();

		}

	}

}
