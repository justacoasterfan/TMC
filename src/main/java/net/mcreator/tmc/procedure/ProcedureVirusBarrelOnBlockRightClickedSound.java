package net.mcreator.tmc.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.tmc.gui.GuiVirusBarrel2;
import net.mcreator.tmc.ToomuchCommander;
import net.mcreator.tmc.ElementsToomuchCommander;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureVirusBarrelOnBlockRightClickedSound extends ElementsToomuchCommander.ModElement {
	public ProcedureVirusBarrelOnBlockRightClickedSound(ElementsToomuchCommander instance) {
		super(instance, 145);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VirusBarrelOnBlockRightClickedSound!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure VirusBarrelOnBlockRightClickedSound!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure VirusBarrelOnBlockRightClickedSound!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure VirusBarrelOnBlockRightClickedSound!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure VirusBarrelOnBlockRightClickedSound!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(ToomuchCommander.instance, GuiVirusBarrel2.GUIID, world, x, y, z);
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), SoundCategory.NEUTRAL,
				(float) 1, (float) 1);
	}
}
