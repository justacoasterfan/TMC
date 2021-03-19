
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumScythe extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commandiumscythe")
	public static final Item block = null;

	public ItemCommandiumScythe(ElementsToomuchCommander instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("COMMANDIUMSCYTHE", 3, 2005, 10f, 3f, 12)) {

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 3);
				return ret.keySet();
			}

		}.setUnlocalizedName("commandiumscythe").setRegistryName("commandiumscythe").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commandiumscythe", "inventory"));
	}

}
