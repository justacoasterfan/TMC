
package net.mcreator.tmc.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.tmc.item.ItemCommanderBone;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class TabTooMuchCommander extends ElementsToomuchCommander.ModElement {
	public TabTooMuchCommander(ElementsToomuchCommander instance) {
		super(instance, 68);
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
