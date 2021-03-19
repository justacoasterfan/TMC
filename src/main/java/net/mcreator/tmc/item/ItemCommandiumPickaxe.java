
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumPickaxe extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commandiumpickaxe")
	public static final Item block = null;

	public ItemCommandiumPickaxe(ElementsToomuchCommander instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("COMMANDIUMPICKAXE", 3, 2005, 10f, 0f, 12)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}

		}.setUnlocalizedName("commandiumpickaxe").setRegistryName("commandiumpickaxe").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commandiumpickaxe", "inventory"));
	}

}
