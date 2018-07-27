package com.tensortime.taintedchunks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = TaintedChunks.MODID, name = TaintedChunks.NAME, version = TaintedChunks.VERSION)
public class TaintedChunks
{
    public static final String MODID = "taintedchunks";
    public static final String NAME = "Tainted Chunks";
    public static final String VERSION = "alpha-0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("Let the taint begin...");
    }
}
