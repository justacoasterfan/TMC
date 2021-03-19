
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCookedBonechops extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:cookedbonechops")
	public static final Item block = null;

	public ItemCookedBonechops(ElementsToomuchCommander instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:cookedbonechops", "inventory"));
	}

	public static class ItemFoodCustom extends ItemFood {

		public ItemFoodCustom() {
			super(8, 12.8f, true);
			setUnlocalizedName("cookedbonechops");
			setRegistryName("cookedbonechops");

			setCreativeTab(TabTooMuchCommander.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

	}

}
