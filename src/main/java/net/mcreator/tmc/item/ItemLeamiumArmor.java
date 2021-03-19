
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemLeamiumArmor extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:leamiumarmorhelmet")
	public static final Item helmet = null;

	@GameRegistry.ObjectHolder("tmc:leamiumarmorbody")
	public static final Item body = null;

	@GameRegistry.ObjectHolder("tmc:leamiumarmorlegs")
	public static final Item legs = null;

	@GameRegistry.ObjectHolder("tmc:leamiumarmorboots")
	public static final Item boots = null;

	public ItemLeamiumArmor(ElementsToomuchCommander instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("LEAMIUMARMOR", "tmc:leamium", 20, new int[]{3, 8, 7, 3}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("leamiumarmorhelmet")
				.setRegistryName("leamiumarmorhelmet").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("leamiumarmorbody")
				.setRegistryName("leamiumarmorbody").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("leamiumarmorlegs")
				.setRegistryName("leamiumarmorlegs").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("leamiumarmorboots")
				.setRegistryName("leamiumarmorboots").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("tmc:leamiumarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("tmc:leamiumarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("tmc:leamiumarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("tmc:leamiumarmorboots", "inventory"));
	}

}
