
package net.mcreator.tmc.item;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumArmorArmor extends ElementsToomuchCommander.ModElement {

	@GameRegistry.ObjectHolder("tmc:commandiumarmorarmorhelmet")
	public static final Item helmet = null;

	@GameRegistry.ObjectHolder("tmc:commandiumarmorarmorbody")
	public static final Item body = null;

	@GameRegistry.ObjectHolder("tmc:commandiumarmorarmorlegs")
	public static final Item legs = null;

	@GameRegistry.ObjectHolder("tmc:commandiumarmorarmorboots")
	public static final Item boots = null;

	public ItemCommandiumArmorArmor(ElementsToomuchCommander instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("COMMANDIUMARMORARMOR", "tmc:commandiumarmor", 75, new int[]{10, 30, 25, 10}, 45,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("commandiumarmorarmorhelmet")
				.setRegistryName("commandiumarmorarmorhelmet").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("commandiumarmorarmorbody")
				.setRegistryName("commandiumarmorarmorbody").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("commandiumarmorarmorlegs")
				.setRegistryName("commandiumarmorarmorlegs").setCreativeTab(TabTooMuchCommander.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("commandiumarmorarmorboots")
				.setRegistryName("commandiumarmorarmorboots").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("tmc:commandiumarmorarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("tmc:commandiumarmorarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("tmc:commandiumarmorarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("tmc:commandiumarmorarmorboots", "inventory"));
	}

}
