package com.projectrixor.rixor.scrimmage.commands;

import com.projectrixor.rixor.scrimmage.player.Client;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdl, String[] args) {
		if(args.length < 2) {
			sender.sendMessage(ChatColor.RED + "/report <playername> <message>");
			return false;
		}
		
		String message = "";
		int i = 0;
		while(i < args.length) {
			message += " " + args[i];
			i++;
		}
		message = message.substring(1);
		sender.sendMessage(ChatColor.GOLD + "Thank you for submitting your report, the issue will be resolved shortly.");
		for (Player Online : Bukkit.getOnlinePlayers()) {
			if (Client.getClient((Player)Online).isRanked()) {
				if(online.haspermission("rixor.staff")){
						online.sendMessage(ChatColor.RED + sender.getName() + " has reported - " + args[2] + " -> " + args[1]);
						Online.playSound(Online.getLocation(), Sound.ORB_PICKUP, 10, 1);
					}
				}
			}
		}
		return false;
	}
	
}
