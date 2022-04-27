package com.yangmc255.yangsadditions.items;

import com.yangmc255.yangsadditions.YangsAdditions;
import com.yangmc255.yangsadditions.init.ModItems;
import com.yangmc255.yangsadditions.util.IHasModel;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(YangsAdditions.modtab);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        YangsAdditions.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
