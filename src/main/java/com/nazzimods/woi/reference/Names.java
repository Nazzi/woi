package com.nazzimods.woi.reference;

public class Names {

	public static final class Blocks {

		public static final String CHALK = "chalkBlock";
		public static final String ALCHEMY_ARRAY = "alchemyArray";
		public static final String DUMMY_ARRAY = "dummyArray";
	}

	public static final class TileEntities {

		private static final String PREFIX = "tile.woi:";
		private static final String SUFFIX = ".name";
		
	}

	public static final class Items {

		public static final String ALCHEMICAL_BAG = "alchemicalBag";
		public static final String ALCHEMICAL_DUST = "alchemicalDust";
		public static final String[] ALCHEMICAL_DUST_SUBTYPES = { "ash", "verdant", "azure", "minium" };
		public static final String MATTER = "matter";
		public static final String[] MATTER_SUBTYPES = { "Proto", "Dark", "Corporeal", "Kinetic", "Temporal", "Essentia", "Amorphous", "Void", "Omni" };
		public static final String GEM = "gem";
		public static final String[] GEM_SUBTYPES = { "Black", "Blue", "Green", "Grey", "Purple", "Red", "Yellow" };
	}

	public static final class Fluids {

		public static final String MILK = "woi.milk";
	}

	public static final class Materials {

		public static final String DARK_MATTER = "matterDark";
	}

	public static final class Tools {

		public static final String DARK_MATTER_SHOVEL = "shovelDarkMatter";
		public static final String DARK_MATTER_PICKAXE = "pickAxeDarkMatter";
		public static final String DARK_MATTER_HAMMER = "hammerDarkMatter";
		public static final String DARK_MATTER_AXE = "axeDarkMatter";
		public static final String DARK_MATTER_HOE = "hoeDarkMatter";
		public static final String DARK_MATTER_FISHING_ROD = "fishingRodDarkMatter";
		public static final String DARK_MATTER_SHEARS = "shearsDarkMatter";
	}

	public static final class Weapons {

		public static final String DARK_MATTER_BOW = "bowDarkMatter";
		public static final String DARK_MATTER_ARROW = "arrowDarkMatter";
		public static final String DARK_MATTER_SWORD = "swordDarkMatter";
	}

	public static final class Armor {

		public static final String DARK_MATTER_ARMOR = "armorDarkMatter";
		public static final String CORPOREAL_MATTER_ARMOR = "armorCorporealMatter";
		public static final String KINETIC_MATTER_ARMOR = "armorKineticMatter";
		public static final String TEMPORAL_MATTER_ARMOR = "armorTemporalMatter";
		public static final String ESSENTIA_MATTER_ARMOR = "armorEssentiaMatter";
		public static final String AMORPHOUS_MATTER_ARMOR = "armorAmorphousMatter";
		public static final String VOID_MATTER_ARMOR = "armorVoidMatter";
		public static final String OMNI_MATTER_ARMOR = "armorOmniMatter";
	}

	public static final class NBT {

		public static final String ITEMS = "Items";
		public static final String ITEM_TRANSMUTATION_KNOWLEDGE = "transmutationKnowledge";
		public static final String CHARGE_LEVEL = "chargeLevel";
		public static final String MODE = "mode";
		public static final String CRAFTING_GUI_OPEN = "craftingGuiOpen";
		public static final String TRANSMUTATION_GUI_OPEN = "transmutationGuiOpen";
		public static final String ALCHEMICAL_BAG_GUI_OPEN = "alchemicalBagGuiOpen";
		public static final String UUID_MOST_SIG = "UUIDMostSig";
		public static final String UUID_LEAST_SIG = "UUIDLeastSig";
		public static final String DISPLAY = "display";
		public static final String COLOR = "color";
		public static final String STATE = "teState";
		public static final String CUSTOM_NAME = "CustomName";
		public static final String DIRECTION = "teDirection";
		public static final String OWNER = "owner";
		public static final String OWNER_UUID_MOST_SIG = "ownerUUIDMostSig";
		public static final String OWNER_UUID_LEAST_SIG = "ownerUUIDLeastSig";
	}

	public static final class Containers {

		public static final String VANILLA_INVENTORY = "container.inventory";
		public static final String VANILLA_CRAFTING = "container.crafting";
		
	}

	public static final class Keys {

		public static final String CATEGORY = "key.categories.woi";
		public static final String CHARGE = "key.charge";
		public static final String EXTRA = "key.extra";
		public static final String RELEASE = "key.release";
		public static final String TOGGLE = "key.toggle";
	}

	public static final class Commands {

		public static final String BASE_COMMAND = Reference.LOWERCASE_MOD_ID;
		public static final String RUN_TEST = "run-tests";
		public static final String DEBUG = "debug";
	}

}
