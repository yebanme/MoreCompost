package com.github.jummes.morecompost.command;

import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

import com.github.jummes.libs.command.AbstractCommand;
import com.github.jummes.libs.core.Libs;
import com.github.jummes.morecompost.core.MoreCompost;

public class ReloadCommand extends AbstractCommand {

	public ReloadCommand(CommandSender sender, String subCommand, String[] arguments, boolean isSenderPlayer) {
		super(sender, subCommand, arguments, isSenderPlayer);
	}

	@Override
	protected void execute() {

		MoreCompost.getInstance().getCompostersManager().reloadData();
		MoreCompost.getInstance().getCompostablesManager().reloadData();
		MoreCompost.getInstance().getDropsManager().reloadData();
		Libs.getLocale().reloadData();
		sender.sendMessage(MoreCompost.getInstance().getLocale().get("command.reload"));

	}

	@Override
	protected boolean isOnlyPlayer() {
		return false;
	}

	@Override
	protected Permission getPermission() {
		return new Permission("morecompost.commands.reload");
	}

}
