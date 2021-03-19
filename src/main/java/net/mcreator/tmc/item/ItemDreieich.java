
package net.mcreator.tmc.item;

public class ItemDreieich extends Item {

	@GameRegistry.ObjectHolder("tmc:dreieich")
	public static final Item block = null;

	public ItemDreieich() {
		super();
		this.maxStackSize = 1;
		setMaxDamage(64);
		setCreativeTab(TabTooMuchCommander.tab);
	}

	@Override
	public EnumActionResult onItemUse(EntityPlayer entity, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY,
			float hitZ) {
		pos = pos.offset(facing);
		ItemStack itemstack = entity.getHeldItem(hand);
		if (!entity.canPlayerEdit(pos, facing, itemstack)) {
			return EnumActionResult.FAIL;
		} else {
			if (world.isAirBlock(pos))
				WorldDreieich.portal.portalSpawn(world, pos);

			itemstack.damageItem(1, entity);
			return EnumActionResult.SUCCESS;
		}
	}
}
