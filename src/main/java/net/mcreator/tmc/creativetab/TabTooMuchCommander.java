
package net.mcreator.tmc.creativetab;

@ElementsToomuchCommander.ModElement.Tag
public class TabTooMuchCommander extends ElementsToomuchCommander.ModElement {

	public TabTooMuchCommander(ElementsToomuchCommander instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabtoomuchcommander") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCommanderBone.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static CreativeTabs tab;

}
