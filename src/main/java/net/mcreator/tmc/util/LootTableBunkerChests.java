
package net.mcreator.tmc.util;

@ElementsToomuchCommander.ModElement.Tag
public class LootTableBunkerChests extends ElementsToomuchCommander.ModElement {

	public LootTableBunkerChests(ElementsToomuchCommander instance) {
		super(instance, 95);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("tmc", "bunkerchests"));
	}

}
