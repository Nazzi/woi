package com.nazzimods.woi.reference;

public class Messages {

	public static final String NO_FINGERPRINT_MESSAGE = "The copy of World of Irregulars that you are running is a development version of the mod, and as such may be unstable and/or incomplete.";
	public static final String INVALID_FINGERPRINT_MESSAGE = "The copy of World of Irregulars that you are running has been modified from the original, and unpredictable things may happen. Please consider re-downloading the original version of the mod.";

	public static final class Configuration {

		public static final String GENERAL_SYNC_THRESHOLD = "sync.threshold";
		public static final String GENERAL_SYNC_THRESHOLD_LABEL = "general.sync.threshold.label";
		public static final String GENERAL_SYNC_THRESHOLD_COMMENT = "general.sync.threshold.comment";

		public static final String SOUND_MODE = "soundMode";
		public static final String SOUND_MODE_LABEL = "general.sound.soundMode.label";
		public static final String SOUND_MODE_COMMENT = "general.sound.soundMode.comment";

		public static final String ABILITIES_ONLY_LOAD_FILE = "abilities.onlyLoadFile";
		public static final String ABILITIES_ONLY_LOAD_FILE_LABEL = "general.abilities.onlyLoadFile.label";
		public static final String ABILITIES_ONLY_LOAD_FILE_COMMENT = "general.abilities.onlyLoadFile.comment";
	}
	
	public static final class Commands {
		
		private static final String COMMAND_PREFIX = "commands.woi.";
		
		 public static final String BASE_COMMAND_USAGE = COMMAND_PREFIX + "usage";
	}
}
