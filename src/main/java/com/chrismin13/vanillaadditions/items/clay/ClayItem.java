package com.chrismin13.vanillaadditions.items.clay;

import org.bukkit.Material;

import com.chrismin13.vanillaadditions.items.AverageTexturedTool;

import us.fihgu.toolbox.item.DamageableItem;

public class ClayItem extends AverageTexturedTool{

	public ClayItem(DamageableItem damageableItem, String customItemIdName, String displayName,
			String textureName) {
		super(damageableItem, Material.GOLDEN_SWORD.getMaxDurability(), customItemIdName, displayName, textureName);
	}
}
