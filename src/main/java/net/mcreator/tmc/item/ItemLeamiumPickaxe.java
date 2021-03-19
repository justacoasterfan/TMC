
package net.mcreator.tmc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.tmc.creativetab.TabTooMuchCommander;
import net.mcreator.tmc.ElementsToomuchCommander;

import java.util.Set;
import java.util.HashMap;

@ElementsToomuchCommander.ModElement.Tag
public class ItemLeamiumPickaxe extends ElementsToomuchCommander.ModElement {
	@GameRegistry.ObjectHolder("tmc:leamiumpickaxe")
	public static final Item block = null;
	public ItemLeamiumPickaxe(ElementsToomuchCommander instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("LEAMIUMPICKAXE", 3, 361, 7f, -1f, 18)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("leamiumpickaxe").setRegistryName("leamiumpickaxe").setCreativeTab(TabTooMuchCommander.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:leamiumpickaxe", "inventory"));
	}
}
