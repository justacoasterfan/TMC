
package net.mcreator.tmc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.tmc.creativetab.TabTooMuchCommander;
import net.mcreator.tmc.ElementsToomuchCommander;

import java.util.Set;
import java.util.HashMap;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommandiumShovel extends ElementsToomuchCommander.ModElement {
	@GameRegistry.ObjectHolder("tmc:commandiumshovel")
	public static final Item block = null;
	public ItemCommandiumShovel(ElementsToomuchCommander instance) {
		super(instance, 36);
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
