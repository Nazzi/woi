package com.nazzimods.woi.handler;

import java.io.File;

import com.nazzimods.woi.reference.Messages;
import com.nazzimods.woi.reference.Settings;
import com.nazzimods.woi.util.ConfigurationHelper;

import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

	public static Configuration configuration;

	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}

	private static void loadConfiguration() {
		// TODO Come back and do these constants in logical locations and names
		Settings.General.syncThreshold = configuration.getInt(Messages.Configuration.GENERAL_SYNC_THRESHOLD, Configuration.CATEGORY_GENERAL, 5, 0, Short.MAX_VALUE, StatCollector.translateToLocal(Messages.Configuration.GENERAL_SYNC_THRESHOLD_COMMENT), Messages.Configuration.GENERAL_SYNC_THRESHOLD_LABEL);
		Settings.Sounds.soundMode = ConfigurationHelper.getString(configuration, Messages.Configuration.SOUND_MODE, Configuration.CATEGORY_GENERAL, "All", StatCollector.translateToLocal(Messages.Configuration.SOUND_MODE_COMMENT), new String[] { "All", "Self", "None" }, Messages.Configuration.SOUND_MODE_LABEL);
		
		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

}
