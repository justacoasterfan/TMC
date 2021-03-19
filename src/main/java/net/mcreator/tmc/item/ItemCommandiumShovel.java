
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumShovel extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commandiumshovel")
	public static final Item block = null;

	public ItemCommandiumShovel(ElementsToomuchCommander instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("COMMANDIUMSHOVEL", 3, 2005, 10f, 3f, 12)) {

			{
				this.attackSpeed = -2.4f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}

		}.setUnlocalizedName("commandiumshovel").setRegistryName("commandiumshovel").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commandiumshovel", "inventory"));
	}

}
