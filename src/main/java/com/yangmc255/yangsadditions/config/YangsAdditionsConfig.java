package com.yangmc255.yangsadditions.config;

import net.minecraftforge.common.config.Configuration;

public class YangsAdditionsConfig {

    // Repeat Crossbow config
    public int repeatCrossbowDurability;
    public float repeatCrossbowProjectileSpeed;

    public void init(Configuration config) {
        this.repeatCrossbowDurability = config.getInt("Repeat Crossbow Durability", "Repeat Crossbow", 300, 1, Integer.MAX_VALUE, "Durability of the Repeat Crossbow (Default value: 300)");
        this.repeatCrossbowProjectileSpeed = config.getFloat("Repeat Crossbow Projectile Speed", "Repeat Crossbow", 10, 1, Float.MAX_VALUE, "Projectile speed of the Repeat Crossbow (Default value: 10.0)");
    }

}
