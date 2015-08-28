package com.nazzimods.woi.util;

import java.io.*;
import java.util.*;

import org.apache.commons.codec.digest.DigestUtils;

import com.nazzimods.woi.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;

public class SerializationHelper {

	private static File instanceDataDirectory;
	private static File instancePlayerDataDirectory;

	/**
	 * Returns a File reference to the mod specific directory in the data
	 * directory
	 *
	 * @return
	 */
	public static File getInstanceDataDirectory() {
		return instanceDataDirectory;
	}

	/**
	 * Returns a File reference to the mod specific directory in the playerdata
	 * directory
	 *
	 * @return
	 */
	public static File getInstancePlayerDataDirectory() {
		return instancePlayerDataDirectory;
	}

	/**
	 * Creates (if one does not exist already) and initializes a mod specific
	 * File reference inside of the current world's playerdata directory
	 */
	public static void initModDataDirectories() {
		instanceDataDirectory = new File(FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld().getSaveHandler().getWorldDirectory(), "data" + File.separator + Reference.LOWERCASE_MOD_ID);
		instanceDataDirectory.mkdirs();

		instancePlayerDataDirectory = new File(FMLCommonHandler.instance().getMinecraftServerInstance().getEntityWorld().getSaveHandler().getWorldDirectory(), "playerdata" + File.separator + Reference.LOWERCASE_MOD_ID);
		instancePlayerDataDirectory.mkdirs();
	}

	public static String getModListMD5() {
		List<String> modList = new ArrayList<String>();

		for (ModContainer modContainer : Loader.instance().getModList()) {
			modList.add("[" + modContainer.getModId() + "-" + modContainer.getName() + "-" + modContainer.getVersion() + "]");
		}

		Collections.sort(modList);

		StringBuilder modListString = new StringBuilder();
		for (String modEntry : modList) {
			modListString.append(modEntry);
		}

		return DigestUtils.md5Hex(modListString.toString());
	}

	public static NBTTagCompound readNBTFromFile(File nbtEncodedFile) {
		if (nbtEncodedFile.exists() && nbtEncodedFile.isFile()) {
			try {
				return CompressedStreamTools.readCompressed(new FileInputStream(nbtEncodedFile));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public static void writeNBTToFile(File directory, String fileName, INBTTaggable nbtTaggable) {
		writeNBTToFile(directory, fileName, nbtTaggable, false);
	}

	public static void writeNBTToFile(File directory, String fileName, INBTTaggable nbtTaggable, boolean verboseLogging) {
		if (directory != null && fileName != null && nbtTaggable != null) {
			if (!directory.exists()) {
				directory.mkdirs();
			}

			NBTTagCompound nbtTagCompound = new NBTTagCompound();
			nbtTaggable.writeToNBT(nbtTagCompound);

			try {
				File file1 = new File(directory, fileName + ".tmp");
				File file2 = new File(directory, fileName);
				CompressedStreamTools.writeCompressed(nbtTagCompound, new FileOutputStream(file1));

				if (file2.exists()) {
					file2.delete();
				}

				file1.renameTo(file2);

				if (verboseLogging) {
					LogHelper.info(String.format("Successfully saved %s to file: %s", nbtTaggable.getTagLabel(), file2.getAbsolutePath()));
				}
			} catch (Exception exception) {
				LogHelper.warn(String.format("Failed to save %s to file: %s%s%s", nbtTaggable.getTagLabel(), directory.getAbsolutePath(), File.separator, fileName));
				exception.printStackTrace();
			}
		}
	}


	

}
