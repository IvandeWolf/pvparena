package net.slipcor.pvparena.ext;

import net.slipcor.pvparena.PVPArena;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ArcadeHook {
	private final Plugin arcadePlugin;
	public ArcadeHook() {
		arcadePlugin = Bukkit.getPluginManager().getPlugin("Arcade");
	}

    private String getPluginName(String player) {
        try {
            Method getPlugin = arcadePlugin.getClass().getDeclaredMethod("getPlugin", String.class);
            return ((Plugin) getPlugin.invoke(arcadePlugin, player)).getName();
        } catch (NoSuchMethodException e) {
            return null;
        } catch (InvocationTargetException e) {
            return null;
        } catch (IllegalAccessException e) {
            return null;
        } catch (NullPointerException e) {
        	return null;
        }
    }

    private boolean getPlaying(String player) {
        try {
            Method getPlugin = arcadePlugin.getClass().getDeclaredMethod("isPlaying", String.class);
            return (Boolean) getPlugin.invoke(arcadePlugin, player);
        } catch (NoSuchMethodException e) {
            return false;
        } catch (InvocationTargetException e) {
            return false;
        } catch (IllegalAccessException e) {
            return false;
        }
    }

    private void playerJoin(String player, Plugin plugin) {
        try {
            Method getPlugin = arcadePlugin.getClass().getDeclaredMethod("playerJoin", String.class, Plugin.class);
            getPlugin.invoke(arcadePlugin, player, plugin);
        } catch (NoSuchMethodException e) {
            return;
        } catch (InvocationTargetException e) {
            return;
        } catch (IllegalAccessException e) {
            return;
        }
    }

    private void playerLeave(String player, Plugin plugin) {
        try {
            Method getPlugin = arcadePlugin.getClass().getDeclaredMethod("playerLeave", String.class, Plugin.class);
            getPlugin.invoke(arcadePlugin, player, plugin);
        } catch (NoSuchMethodException e) {
            return;
        } catch (InvocationTargetException e) {
            return;
        } catch (IllegalAccessException e) {
            return;
        }
    }

	public boolean isPlaying(final String player) {
		if (arcadePlugin == null) {
			return false;
		}
        String pluginName = getPluginName(player);

        if (PVPArena.instance.getDescription().getName().equals(pluginName)) {
			return false; // we don't consider our own plugin an external thing
		}
		return getPlaying(player);
	}
	
	public void setPlaying(final String player, final boolean value) {
		if (arcadePlugin == null) {
			return;
		}
		if (value) {
			playerJoin(player, PVPArena.instance);
		} else {
			playerLeave(player, PVPArena.instance);
		}
	}
	
	public String getPlugin(final String player) {
		if (arcadePlugin == null) {
			return null;
		}
		return getPluginName(player);
	}
}