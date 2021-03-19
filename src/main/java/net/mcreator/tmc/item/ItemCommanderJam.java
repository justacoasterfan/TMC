
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommanderJam extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commanderjam")
	public static final Item block = null;

	public ItemCommanderJam(ElementsToomuchCommander instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commanderjam", "inventory"));
	}

	public static class MusicDiscItemCustom extends ItemRecord {

		public MusicDiscItemCustom() {
			super("commanderjam", ElementsToomuchCommander.sounds.get(new ResourceLocation("tmc:commanderjam")));
			setUnlocalizedName("commanderjam");
			setRegistryName("commanderjam");
			setCreativeTab(TabTooMuchCommander.tab);
		}

	}

}
