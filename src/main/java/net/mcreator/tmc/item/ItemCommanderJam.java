
package net.mcreator.tmc.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.tmc.creativetab.TabTooMuchCommander;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class ItemCommanderJam extends ElementsToomuchCommander.ModElement {
	@GameRegistry.ObjectHolder("tmc:commanderjam")
	public static final Item block = null;
	public ItemCommanderJam(ElementsToomuchCommander instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("tmc:commanderjam", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("commanderjam", ElementsToomuchCommander.sounds.get(new ResourceLocation("tmc:commanderjam")));
			setUnlocalizedName("commanderjam");
			setRegistryName("commanderjam");
			setCreativeTab(TabTooMuchCommander.tab);
		}
	}
}
