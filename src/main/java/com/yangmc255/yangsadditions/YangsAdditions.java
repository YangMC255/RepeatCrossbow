package com.yangmc255.yangsadditions;

import com.yangmc255.yangsadditions.config.YangsAdditionsConfig;
import com.yangmc255.yangsadditions.proxy.CommonProxy;
import com.yangmc255.yangsadditions.tabs.ModTab;
import com.yangmc255.yangsadditions.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class YangsAdditions {

    @Instance
    public static YangsAdditions instance;

    public static final CreativeTabs modtab = new ModTab("modtab");
    public static final YangsAdditionsConfig CONFIG = new YangsAdditionsConfig();
    public static Configuration config;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static void loadConfig() {
        File configFile = new File(Loader.instance().getConfigDir(), "yangs_additions.cfg");
        if (!configFile.exists()) {
            try {
                configFile.createNewFile();
            } catch (Exception e) {
                System.err.println("Could not create new config file.");
            }
        }
        config = new Configuration(configFile);
        config.load();
    }

    public static void syncConfig() {
        CONFIG.init(config);
        config.save();
    }

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        loadConfig();
        syncConfig();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event) {

    }

}
