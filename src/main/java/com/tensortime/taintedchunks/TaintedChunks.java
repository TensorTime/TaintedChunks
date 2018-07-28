package com.tensortime.taintedchunks;
import com.tensortime.taintedchunks.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TaintedChunks
{
	@Instance("taintedchunks")
	public static TaintedChunks instance;
	
	@SidedProxy(clientSide="com.tensortime.taintedchunks.proxy.ClientProxy", serverSide="com.tensortime.taintedchunks.proxy.ServerProxy")
	public static CommonProxy proxy;

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
