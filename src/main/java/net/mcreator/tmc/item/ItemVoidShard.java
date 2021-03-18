
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemVoidShard extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:voidshard")
	public static final Item block = null;

	public ItemVoidShard(ElementsToomuchCommander instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:voidshard", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("voidshard");
			setRegistryName("voidshard");
			setCreativeTab(TabTooMuchCommander.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<String> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add("Used to craft a Virus Core");
		}

	}

}
