package com.nazzimods.woi.command;

import java.util.List;

import com.nazzimods.woi.reference.Names;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class CommandDebug extends CommandBase {

	@Override
	public String getCommandName() {
		return Names.Commands.DEBUG;
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 2;
	}

	@Override
	public String getCommandUsage(ICommandSender commandSender) {
		return null;
	}

	@Override
	public void processCommand(ICommandSender commandSender, String[] args) {
	}

	@Override
	public List addTabCompletionOptions(ICommandSender commandSender, String[] args) {
		return null;
	}

}
