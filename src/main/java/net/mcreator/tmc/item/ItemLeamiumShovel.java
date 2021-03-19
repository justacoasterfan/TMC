
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemLeamiumShovel extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:leamiumshovel")
	public static final Item block = null;

	public ItemLeamiumShovel(ElementsToomuchCommander instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("LEAMIUMSHOVEL", 3, 361, 7f, -1f, 18)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}

		}.setUnlocalizedName("leamiumshovel").setRegistryName("leamiumshovel").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:leamiumshovel", "inventory"));
	}

}
