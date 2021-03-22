package net.mcreator.tmc.procedure;

@ElementsToomuchCommander.ModElement.Tag
public class ProcedureVirusSwordMobIsHitWithTool extends ElementsToomuchCommander.ModElement {

	public ProcedureVirusSwordMobIsHitWithTool(ElementsToomuchCommander instance) {
		super(instance, 136);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure VirusSwordMobIsHitWithTool!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).capabilities.allowFlying = (false);
			((EntityPlayer) entity).sendPlayerAbilities();
		}

	}

}
