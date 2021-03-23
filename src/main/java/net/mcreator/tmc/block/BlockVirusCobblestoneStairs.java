
package net.mcreator.tmc.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.Block;

import net.mcreator.tmc.creativetab.TabTooMuchCommander;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class BlockVirusCobblestoneStairs extends ElementsToomuchCommander.ModElement {
	@GameRegistry.ObjectHolder("tmc:viruscobblestonestairs")
	public static final Block block = null;
	public BlockVirusCobblestoneStairs(ElementsToomuchCommander instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("viruscobblestonestairs"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("tmc:viruscobblestonestairs", "inventory"));
	}
	public static class BlockCustom extends BlockStairs {
		public BlockCustom() {
			super(new Block(Material.ROCK).getDefaultState());
			setUnlocalizedName("viruscobblestonestairs");
			setSoundType(SoundType.STONE);
			setHardness(2.5F);
			setResistance(6F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabTooMuchCommander.tab);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
