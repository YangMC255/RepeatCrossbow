package com.yangmc255.yangsadditions.tabs;

import com.yangmc255.yangsadditions.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {

    public ModTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.REPEAT_CROSSBOW);
    }
}
