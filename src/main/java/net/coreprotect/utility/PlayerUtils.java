package net.coreprotect.utility;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

public class PlayerUtils {
    public static boolean isOp(String name){
        var userPlayer = Bukkit.getOfflinePlayerIfCached(name);
        return userPlayer != null && userPlayer.isOp();
    }
    public static boolean shouldHideLookup(CommandSender sender,String userName){
        return !sender.isOp() && isOp(userName);
    }
}
