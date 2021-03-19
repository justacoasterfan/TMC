
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemLeamiumHoe extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:leamiumhoe")
	public static final Item block = null;

	public ItemLeamiumHoe(ElementsToomuchCommander instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("LEAMIUMHOE", 3, 361, 7f, 0f, 18)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 3);
				return ret.keySet();
			}

		}.setUnlocalizedName("leamiumhoe").setRegistryName("leamiumhoe").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:leamiumhoe", "inventory"));
	}

}
